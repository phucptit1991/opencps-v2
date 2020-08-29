package org.opencps.usermgt.scheduler.utils;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;

import javax.ws.rs.HttpMethod;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import org.opencps.usermgt.constants.UserRegisterTerm;

public class RegisterLGSPUtils {

	private static Log _log = LogFactoryUtil.getLog(RegisterLGSPUtils.class);

	public static String getTokenLGSP() {
		StringBuilder sbToken = new StringBuilder();
		try {

			URL urlVal = new URL(UserRegisterTerm.URL_TOKEN);
			StringBuilder postData = new StringBuilder();
			//
			postData.append(UserRegisterTerm.CLIENT_ID);
			postData.append(StringPool.EQUAL);
			postData.append(UserRegisterTerm.VALUE_CLIENT_ID);
			//
			postData.append(StringPool.AMPERSAND);
			postData.append(UserRegisterTerm.CLIENT_SECRECT);
			postData.append(StringPool.EQUAL);
			postData.append(UserRegisterTerm.VALUE_CLIENT_SECRECT);
			//
			postData.append(StringPool.AMPERSAND);
			postData.append(UserRegisterTerm.GRANT_TYPE);
			postData.append(StringPool.EQUAL);
			postData.append(UserRegisterTerm.VALUE_GRANT_TYPE);

			java.net.HttpURLConnection conToken = (java.net.HttpURLConnection) urlVal.openConnection();
			conToken.setRequestMethod(HttpMethod.POST);
			conToken.setRequestProperty(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON);
			conToken.setRequestProperty(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED);
			conToken.setRequestProperty(HttpHeaders.CONTENT_LENGTH,
					StringPool.BLANK + Integer.toString(postData.toString().getBytes().length));

			conToken.setUseCaches(false);
			conToken.setDoInput(true);
			conToken.setDoOutput(true);
			_log.debug("POST DATA: " + postData.toString());
			OutputStream osToken = conToken.getOutputStream();
			osToken.write(postData.toString().getBytes());
			osToken.close();

			BufferedReader brfToken = new BufferedReader(new InputStreamReader(conToken.getInputStream()));

			int cpToken;
			while ((cpToken = brfToken.read()) != -1) {
				sbToken.append((char) cpToken);
			}
		} catch (Exception e) {
			_log.debug(e);
		}

		return sbToken.toString();
	}

//	public static String getTokenNewLGSP() {
//		StringBuilder sbToken = new StringBuilder();
//		
//		LGSPToken tokenLGPS = LGSPTokenLocalServiceUtil.fetchByTokenType("Bearer");
//		if (tokenLGPS != null) {
//			Date now = new Date();
//			Date expiryDate = tokenLGPS.getExpiryDate();
//			_log.info("now: "+now);
//			_log.info("expiryDate: "+expiryDate);
//			if (now.before(expiryDate) && Validator.isNotNull(tokenLGPS.getToken())) {
//				return tokenLGPS.getToken();
//			}
//		} else {
//			try {
//				URL urlToken = new URL(UserRegisterTerm.NEW_BASE_URL + UserRegisterTerm.NEW_ENDPOINT_TOKEN);
//
//				java.net.HttpURLConnection conToken = (java.net.HttpURLConnection) urlToken.openConnection();
//				conToken.setRequestMethod(HttpMethod.POST);
//				conToken.setRequestProperty(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON);
//				conToken.setRequestProperty(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED);
//				conToken.setRequestProperty("Auth", "WVdSdGFXND06WVdSdGFXNUFNZz09");
//				conToken.setRequestProperty("Content-Length", String.valueOf(0));
//
//				conToken.setUseCaches(false);
//				conToken.setDoInput(true);
//				conToken.setDoOutput(true);
//				
//				OutputStream os = conToken.getOutputStream();
//				os.close();
//
//				BufferedReader brfToken = new BufferedReader(new InputStreamReader(conToken.getInputStream()));
//
//				int cpToken;
//				while ((cpToken = brfToken.read()) != -1) {
//					sbToken.append((char) cpToken);
//				}
//			} catch (Exception e) {
//				_log.debug(e);
//			}
//			// Update Token
//			if (Validator.isNotNull(sbToken.toString())) {
//				JSONObject jsonToken = null;
//				try {
//					jsonToken = JSONFactoryUtil.createJSONObject(sbToken.toString());
//				} catch (JSONException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				if (jsonToken != null && jsonToken.has("token") && jsonToken.has("refreshToken")
//						&& jsonToken.has("expiryDate")) {
//					String token = jsonToken.getString("token");
//					String refreshToken = jsonToken.getString("token");
//					String strExpiryDate = jsonToken.getString("expiryDate");
//					
//					//APIDateTimeUtils._NORMAL_DATE
//					
//					
//				}
//			}
//		}
//		
//		
//
//		return sbToken.toString();
//	}

//	public static String registerLGSP(String tokenType, String accessToken, String applicantIdType, String contactEmail,
//			String applicantIdNo, String applicantName, String applicantIdDate, String contactTelNo) {
//
//		String strProfile = StringPool.BLANK;
//
//		if (ApplicantTerm.APPLICANTIDTYPE_CITIZEN.equalsIgnoreCase(applicantIdType)) {
//			//
//			String urlRegister = UserRegisterTerm.BASE_URL + UserRegisterTerm.ENDPOINT_CITIZEN;
//			String authStrEnc = tokenType + StringPool.SPACE + accessToken;
//
//			StringBuilder sbReg = new StringBuilder();
//			try {
//				URL urlValRegister = new URL(urlRegister);
//
//				JSONObject jsonBody = JSONFactoryUtil.createJSONObject();
//				jsonBody.put(UserRegisterTerm.EMAIL, contactEmail);
//				jsonBody.put(UserRegisterTerm.SO_CMND, applicantIdNo);
//				jsonBody.put(UserRegisterTerm.NGAY_SINH, "1990-12-01");
//				jsonBody.put(UserRegisterTerm.GIOI_TINH, 0);
//				jsonBody.put(UserRegisterTerm.DIA_CHI_THUONG_TRU, StringPool.BLANK);
//				jsonBody.put(UserRegisterTerm.TINH_THUONG_TRU, 0);
//				jsonBody.put(UserRegisterTerm.HUYEN_THUONG_TRU, 0);
//				jsonBody.put(UserRegisterTerm.XA_THUONG_TRU, 0);
//				jsonBody.put(UserRegisterTerm.DIEN_THOAI, contactTelNo);
//				//
//				if (Validator.isNotNull(applicantName)) {
//					String[] splitAppName = applicantName.split("\\s+");
//					int lengthAppName = splitAppName.length;
//					if (lengthAppName > 3) {
//						jsonBody.put(UserRegisterTerm.HO, splitAppName[0]);
//						jsonBody.put(UserRegisterTerm.TEN, splitAppName[lengthAppName - 1]);
//						String tenDem = StringPool.BLANK;
//						for (int i = 1; i < splitAppName.length - 1; i++) {
//							if (i == 1) {
//								tenDem += splitAppName[1];
//							} else {
//								tenDem += StringPool.SPACE + splitAppName[i];
//							}
//						}
//						jsonBody.put(UserRegisterTerm.DEM, tenDem);
//					} else if (lengthAppName == 3) {
//						jsonBody.put(UserRegisterTerm.HO, splitAppName[0]);
//						jsonBody.put(UserRegisterTerm.DEM, splitAppName[1]);
//						jsonBody.put(UserRegisterTerm.TEN, splitAppName[2]);
//					} else if (lengthAppName == 2) {
//						jsonBody.put(UserRegisterTerm.HO, "Công dân");
//						jsonBody.put(UserRegisterTerm.DEM, splitAppName[1]);
//						jsonBody.put(UserRegisterTerm.TEN, splitAppName[2]);
//					} else {
//						jsonBody.put(UserRegisterTerm.HO, "Công");
//						jsonBody.put(UserRegisterTerm.DEM, "dân");
//						jsonBody.put(UserRegisterTerm.TEN, splitAppName[2]);
//					}
//				}
//
//				java.net.HttpURLConnection conReg = (java.net.HttpURLConnection) urlValRegister.openConnection();
//				conReg.setRequestMethod(HttpMethod.POST);
//				conReg.setRequestProperty(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON);
//				conReg.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json;charset=UTF-8");
//				conReg.setRequestProperty(HttpHeaders.AUTHORIZATION, authStrEnc);
//				_log.debug("BASIC AUTHEN: " + authStrEnc);
//				conReg.setRequestProperty(HttpHeaders.CONTENT_LENGTH,
//						StringPool.BLANK + Integer.toString(jsonBody.toString().getBytes().length));
//
//				conReg.setUseCaches(false);
//				conReg.setDoInput(true);
//				conReg.setDoOutput(true);
//				_log.debug("POST DATA: " + jsonBody.toString());
//				OutputStream osReg = conReg.getOutputStream();
//				osReg.write(jsonBody.toString().getBytes());
//				osReg.close();
//
//				BufferedReader brfReg = new BufferedReader(new InputStreamReader(conReg.getInputStream()));
//
//				int cpReg;
//				while ((cpReg = brfReg.read()) != -1) {
//					sbReg.append((char) cpReg);
//				}
//				_log.info("RESULT PROXY: " + sbReg.toString());
//				//
//				if (Validator.isNotNull(sbReg.toString())) {
//					//
//					_log.error("sbReg:" + sbReg.toString());
//					JSONObject jsonReg = JSONFactoryUtil.createJSONObject(sbReg.toString());
//					if (jsonReg.has(UserRegisterTerm.MESSAGE)
//							&& jsonReg.has(UserRegisterTerm.ERROR_CODE)
//							&& Validator.isNotNull(jsonReg.get(UserRegisterTerm.MESSAGE))
//							&& Validator.isNotNull(jsonReg.get(UserRegisterTerm.ERROR_CODE))) {
//						String message = jsonReg.getString(UserRegisterTerm.MESSAGE);
//						int errorCode = jsonReg.getInt(UserRegisterTerm.ERROR_CODE);
//
//						if (errorCode == 0) {
//							JSONObject jsonMessage = JSONFactoryUtil.createJSONObject(message);
//							//
//							String maXacNhan = jsonMessage.getString(UserRegisterTerm.MA_XAC_NHAN);
//							String matKhau = jsonMessage.getString(UserRegisterTerm.MAT_KHAU);
//							String taiKhoan = jsonMessage.getString(UserRegisterTerm.TAI_KHOAN);
//							// Them 1 cot luu pass vs activeCode vào profile
//							JSONObject jsonProfile = JSONFactoryUtil.createJSONObject();
//							jsonProfile.put(UserRegisterTerm.MA_XAC_NHAN, maXacNhan);
//							jsonProfile.put(UserRegisterTerm.MAT_KHAU, matKhau);
//							jsonProfile.put(UserRegisterTerm.TAI_KHOAN, taiKhoan);
//							//
//							_log.error("maXacNhan:" + maXacNhan);
//							_log.error("matKhau:" + matKhau);
//							strProfile = jsonProfile.toJSONString();
//						}
//					}
//				}
//			} catch (Exception e) {
//				_log.error(e);
//				_log.debug("Something went wrong while reading/writing in stream!!");
//			}
//		} else if (ApplicantTerm.APPLICANTIDTYPE_BUSINESS.equalsIgnoreCase(applicantIdType)) {
//			//
//			String urlRegister = UserRegisterTerm.BASE_URL + UserRegisterTerm.ENDPOINT_BUSINESS;
//			String authStrEnc = tokenType + StringPool.SPACE + accessToken;
//
//			StringBuilder sbReg = new StringBuilder();
//			try {
//				URL urlValRegister = new URL(urlRegister);
//
//				String ngayCapGiayPhep = StringPool.BLANK;
//				if (Validator.isNotNull(applicantIdDate)) {
//					String[] splitDate = applicantIdDate.split(StringPool.FORWARD_SLASH);
//					if (splitDate != null && splitDate.length == 3) {
//						ngayCapGiayPhep = splitDate[2] + StringPool.DASH + splitDate[1] + StringPool.DASH
//								+ splitDate[0];
//					}
//				}
//
//				JSONObject jsonBody = JSONFactoryUtil.createJSONObject();
//				jsonBody.put(UserRegisterTerm.EMAIL, contactEmail);
//				jsonBody.put(UserRegisterTerm.MA_SO_THUE, applicantIdNo);
//				jsonBody.put(UserRegisterTerm.NGAY_CAP_GIAY_PHEP, ngayCapGiayPhep);
//				jsonBody.put(UserRegisterTerm.MA_GIAY_PHEP, applicantIdNo);
//				jsonBody.put(UserRegisterTerm.MO_TA_DIA_DIEM_KINH_DOANH, StringPool.BLANK);
//				jsonBody.put(UserRegisterTerm.TINH_DIA_DIEM_KD, 0);
//				jsonBody.put(UserRegisterTerm.HUYEN_DIA_DIEM_KD, 0);
//				jsonBody.put(UserRegisterTerm.XA_DIA_DIEM_KD, 0);
//				jsonBody.put(UserRegisterTerm.DIEN_THOAI, contactTelNo);
//				jsonBody.put(UserRegisterTerm.TEN, applicantName);
//				//
//
//				java.net.HttpURLConnection conReg = (java.net.HttpURLConnection) urlValRegister.openConnection();
//				conReg.setRequestMethod(HttpMethod.POST);
//				conReg.setRequestProperty(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON);
//				conReg.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json;charset=UTF-8");
//				conReg.setRequestProperty(HttpHeaders.AUTHORIZATION, authStrEnc);
//				_log.debug("BASIC AUTHEN: " + authStrEnc);
//				conReg.setRequestProperty(HttpHeaders.CONTENT_LENGTH,
//						StringPool.BLANK + Integer.toString(jsonBody.toString().getBytes().length));
//
//				conReg.setUseCaches(false);
//				conReg.setDoInput(true);
//				conReg.setDoOutput(true);
//				_log.debug("POST DATA: " + jsonBody.toString());
//				OutputStream osReg = conReg.getOutputStream();
//				osReg.write(jsonBody.toString().getBytes());
//				osReg.close();
//
//				BufferedReader brfReg = new BufferedReader(new InputStreamReader(conReg.getInputStream()));
//
//				int cpReg;
//				while ((cpReg = brfReg.read()) != -1) {
//					sbReg.append((char) cpReg);
//				}
//				_log.info("RESULT PROXY: " + sbReg.toString());
//				//
//				if (Validator.isNotNull(sbReg.toString())) {
//					//
//					_log.error("sbReg:" + sbReg.toString());
//					JSONObject jsonReg = JSONFactoryUtil.createJSONObject(sbReg.toString());
//					if (jsonReg.has(UserRegisterTerm.MESSAGE)
//							&& jsonReg.has(UserRegisterTerm.ERROR_CODE)
//							&& Validator.isNotNull(jsonReg.get(UserRegisterTerm.MESSAGE))
//							&& Validator.isNotNull(jsonReg.get(UserRegisterTerm.ERROR_CODE))) {
//						String message = jsonReg.getString(UserRegisterTerm.MESSAGE);
//						int errorCode = jsonReg.getInt(UserRegisterTerm.ERROR_CODE);
//
//						if (errorCode == 0) {
//							JSONObject jsonMessage = JSONFactoryUtil.createJSONObject(message);
//							//
//							String maXacNhan = jsonMessage.getString(UserRegisterTerm.MA_XAC_NHAN);
//							String matKhau = jsonMessage.getString(UserRegisterTerm.MAT_KHAU);
//							String taiKhoan = jsonMessage.getString(UserRegisterTerm.TAI_KHOAN);
//							// Them 1 cot luu pass vs activeCode vào profile
//							JSONObject jsonProfile = JSONFactoryUtil.createJSONObject();
//							jsonProfile.put(UserRegisterTerm.MA_XAC_NHAN, maXacNhan);
//							jsonProfile.put(UserRegisterTerm.MAT_KHAU, matKhau);
//							jsonProfile.put(UserRegisterTerm.TAI_KHOAN, taiKhoan);
//							//
//							_log.error("maXacNhan:" + maXacNhan);
//							_log.error("matKhau:" + matKhau);
//							strProfile = jsonProfile.toJSONString();
//						}
//					}
//				}
//			} catch (Exception e) {
//				_log.error(e);
//				_log.debug("Something went wrong while reading/writing in stream!!");
//			}
//		}
//		return strProfile;
//	}

//	public static int activeUserLGSP(JSONObject jsonToken, long groupId, String profile, String tmpSecrect,
//			String contactEmail, String applicantIdType) throws Exception {
//
//		String accessToken = jsonToken.getString("access_token");
//		String tokenType = jsonToken.getString("token_type");
//
//		_log.info("accessToken: " + accessToken);
//		_log.info("tokenType: " + tokenType);
//
//		// Dang ky tk cong dan
//		String maXacNhan = StringPool.BLANK;
//		String matKhau = StringPool.BLANK;
//		if (Validator.isNotNull(profile)) {
//			JSONObject jsonProfile = JSONFactoryUtil.createJSONObject(profile);
//			//
//			if (jsonProfile.has(UserRegisterTerm.MA_XAC_NHAN) && jsonProfile.has(UserRegisterTerm.MAT_KHAU)
//					&& Validator.isNotNull(jsonProfile.getString(UserRegisterTerm.MA_XAC_NHAN))
//					&& Validator.isNotNull(jsonProfile.getString(UserRegisterTerm.MAT_KHAU))) {
//				maXacNhan = jsonProfile.getString(UserRegisterTerm.MA_XAC_NHAN);
//				matKhau = jsonProfile.getString(UserRegisterTerm.MAT_KHAU);
//
//			}
//		}
//		//
//		String urlActive = UserRegisterTerm.BASE_URL;
//		if (ApplicantTerm.APPLICANTIDTYPE_CITIZEN.equalsIgnoreCase(applicantIdType)) {
//			urlActive += UserRegisterTerm.ENDPOINT_CITIZEN_ACTIVE + StringPool.FORWARD_SLASH + maXacNhan;
//		} else if (ApplicantTerm.APPLICANTIDTYPE_BUSINESS.equalsIgnoreCase(applicantIdType)) {
//			urlActive += UserRegisterTerm.ENDPOINT_BUSINESS_ACTIVE + StringPool.FORWARD_SLASH + maXacNhan;
//		}
//		
//		_log.info("urlActive: "+urlActive);
//		_log.info("applicantIdType: "+applicantIdType);
//		String authStrEnc = tokenType + StringPool.SPACE + accessToken;
//
//		StringBuilder sbActive = new StringBuilder();
//		try {
//			URL urlValActive = new URL(urlActive);
//
//			java.net.HttpURLConnection conActive = (java.net.HttpURLConnection) urlValActive.openConnection();
//			conActive.setRequestMethod(HttpMethod.POST);
//			conActive.setRequestProperty(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON);
//			conActive.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json;charset=UTF-8");
//			conActive.setRequestProperty(HttpHeaders.AUTHORIZATION, authStrEnc);
//			_log.debug("BASIC AUTHEN: " + authStrEnc);
//
//			BufferedReader brfAc = new BufferedReader(new InputStreamReader(conActive.getInputStream()));
//
//			int cpActive;
//			while ((cpActive = brfAc.read()) != -1) {
//				sbActive.append((char) cpActive);
//			}
//			_log.info("RESULT PROXY: " + sbActive.toString());
//			//
//			if (Validator.isNotNull(sbActive.toString())) {
//				//
//				_log.error("sbActive:" + sbActive.toString());
//				JSONObject jsonActive = JSONFactoryUtil.createJSONObject(sbActive.toString());
//				if (jsonActive.has(UserRegisterTerm.MESSAGE) && jsonActive.has(UserRegisterTerm.ERROR_CODE)
//						&& Validator.isNotNull(jsonActive.get(UserRegisterTerm.MESSAGE))
//						&& Validator.isNotNull(jsonActive.get(UserRegisterTerm.ERROR_CODE))) {
//					int errorCode = jsonActive.getInt(UserRegisterTerm.ERROR_CODE);
//					if (errorCode == 0) {
//						boolean flagChange = changePassLGSP(matKhau, tmpSecrect, contactEmail, authStrEnc);
//						if (!flagChange) {
//							SyncSchedulerLocalServiceUtil.updateSyncScheduler(0, groupId, User.class.getName(),
//									contactEmail, new Date(), 0, new ServiceContext());
//						}
//
//						return 2;
//					} else {
//						return 1;
//					}
//				}
//			}
//		} catch (IOException e) {
//			_log.error(e);
//			_log.debug("Something went wrong while reading/writing in stream!!");
//		}
//		return 0;
//	}

	public static boolean activeUserNewLGSP(JSONObject jsonToken, long groupId, String tmpSecrect,
			String contactEmail) throws Exception {

		String accessToken = jsonToken.getString("token");
		String refreshToken = jsonToken.getString("refreshToken");
		//String expiryDate = jsonToken.getString("expiryDate");

		_log.info("accessToken: " + accessToken);
		_log.info("refreshToken: " + refreshToken);

		// Dang ky tk cong dan
		//
		String urlActive = UserRegisterTerm.NEW_BASE_URL + UserRegisterTerm.NEW_ENDPOINT_VERIFY_USER;
		
		_log.info("urlActive: "+urlActive);
		String authStrEnc = "Bearer" + StringPool.SPACE + accessToken;

		StringBuilder sbActive = new StringBuilder();
		try {
			URL urlValActive = new URL(urlActive);

			java.net.HttpURLConnection conActive = (java.net.HttpURLConnection) urlValActive.openConnection();
			conActive.setRequestMethod(HttpMethod.POST);
			conActive.setRequestProperty(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON);
			conActive.setRequestProperty(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON);
			conActive.setRequestProperty(HttpHeaders.AUTHORIZATION, authStrEnc);
			conActive.setRequestProperty("username", contactEmail);
			_log.debug("BASIC AUTHEN: " + authStrEnc);
			conActive.setRequestProperty("Content-Length", String.valueOf(0));

			conActive.setUseCaches(false);
			conActive.setDoInput(true);
			conActive.setDoOutput(true);
			
			OutputStream os = conActive.getOutputStream();
			os.close();

			BufferedReader brfAc = new BufferedReader(new InputStreamReader(conActive.getInputStream()));

			int cpActive;
			while ((cpActive = brfAc.read()) != -1) {
				sbActive.append((char) cpActive);
			}
			_log.info("RESULT PROXY: " + sbActive.toString());
			if (Validator.isNotNull(sbActive.toString())) {
				if (Boolean.valueOf(sbActive.toString())) {
					return true;
				} else {
					String urlGetUser = UserRegisterTerm.NEW_BASE_URL + UserRegisterTerm.NEW_ENDPOINT_GET_USER
							+ StringPool.FORWARD_SLASH + contactEmail;
					
					URL urlValUser = new URL(urlGetUser);
					java.net.HttpURLConnection conGetUser = (java.net.HttpURLConnection) urlValUser.openConnection();
					conGetUser.setRequestMethod(HttpMethod.GET);
					conGetUser.setRequestProperty(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON);
					conGetUser.setRequestProperty(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON);
					conGetUser.setRequestProperty(HttpHeaders.AUTHORIZATION, authStrEnc);

					BufferedReader brfUser = new BufferedReader(new InputStreamReader(conGetUser.getInputStream()));

					int cpUser;
					StringBuilder sbUser = new StringBuilder();
					while ((cpUser = brfUser.read()) != -1) {
						sbUser.append((char) cpUser);
					}
					if (Validator.isNotNull(sbUser.toString())) {
						JSONObject jsonUser = JSONFactoryUtil.createJSONObject(sbUser.toString());
						if (jsonUser != null && jsonUser.has("userName") && contactEmail.equals(jsonUser.getString("userName"))) {
							return true;
						}
					}
				}
				
			} else {
				return false;
			}
			//
			return Validator.isNotNull(sbActive.toString()) ? Boolean.valueOf(sbActive.toString()) : false;
		} catch (IOException e) {
			_log.error(e);
			_log.debug("Something went wrong while reading/writing in stream!!");
		}
		return false;
	}

	public static String forgotNewLGSP(String tokenType, String accessToken, String contactEmail) throws Exception {

		_log.info("accessToken: " + accessToken);
		// Dang ky tk cong dan
		String urlReset = UserRegisterTerm.NEW_BASE_URL + UserRegisterTerm.NEW_ENDPOINT_RESET_SECRECT;
		
		_log.info("urlReset: "+urlReset);
		String authStrEnc = tokenType + StringPool.SPACE + accessToken;

		StringBuilder sbReset = new StringBuilder();
		try {
			URL urlValReset = new URL(urlReset);

			java.net.HttpURLConnection conReset = (java.net.HttpURLConnection) urlValReset.openConnection();
			conReset.setRequestMethod(HttpMethod.POST);
			conReset.setRequestProperty(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON);
			conReset.setRequestProperty(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON);
			conReset.setRequestProperty(HttpHeaders.AUTHORIZATION, authStrEnc);
			conReset.setRequestProperty("username", contactEmail);
			_log.debug("BASIC AUTHEN: " + authStrEnc);
			conReset.setRequestProperty("Content-Length", String.valueOf(0));

			conReset.setUseCaches(false);
			conReset.setDoInput(true);
			conReset.setDoOutput(true);
			
			OutputStream os = conReset.getOutputStream();
			os.close();

			BufferedReader brfReset = new BufferedReader(new InputStreamReader(conReset.getInputStream()));

			int cpReset;
			while ((cpReset = brfReset.read()) != -1) {
				sbReset.append((char) cpReset);
			}
			_log.info("RESULT PROXY: " + sbReset.toString());
			//
			return Validator.isNotNull(sbReset.toString()) ? sbReset.toString() : StringPool.BLANK;
		} catch (IOException e) {
			_log.error(e);
			_log.debug("Something went wrong while reading/writing in stream!!");
		}
		return StringPool.BLANK;
	}

//	public static boolean changePassLGSP(String matKhau, String tmpSecrect, String contactEmail, String authStrEnc) {
//
//		try {
//			String oldSecrect = PasswordEncrypt.encrypt(matKhau);
//			String newSecrect = PasswordEncrypt.encrypt(tmpSecrect);
//
//			_log.info("oldSecrect: " + oldSecrect);
//			_log.info("newSecrect: " + newSecrect);
//			//
//			String urlChange = UserRegisterTerm.BASE_URL
//					+ UserRegisterTerm.ENDPOINT_CHANGE_SECRECT;
//
//			StringBuilder sbChange = new StringBuilder();
//
//			URL urlValChange = new URL(urlChange);
//
//			JSONObject jsonBody = JSONFactoryUtil.createJSONObject();
//			jsonBody.put(UserRegisterTerm.OLD_SECRECT, oldSecrect);
//			jsonBody.put(UserRegisterTerm.NEW_SECRECT, newSecrect);
//			jsonBody.put(UserRegisterTerm.EMAIL, contactEmail);
//
//			java.net.HttpURLConnection conChange = (java.net.HttpURLConnection) urlValChange.openConnection();
//			conChange.setRequestMethod(HttpMethod.POST);
//			conChange.setRequestProperty(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON);
//			conChange.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json;charset=UTF-8");
//			conChange.setRequestProperty(HttpHeaders.AUTHORIZATION, authStrEnc);
//			_log.info("BASIC AUTHEN: " + authStrEnc);
//			conChange.setRequestProperty(HttpHeaders.CONTENT_LENGTH,
//					StringPool.BLANK + Integer.toString(jsonBody.toString().getBytes().length));
//
//			conChange.setUseCaches(false);
//			conChange.setDoInput(true);
//			conChange.setDoOutput(true);
//			_log.info("POST DATA: " + jsonBody.toString());
//			OutputStream osChange = conChange.getOutputStream();
//			osChange.write(jsonBody.toString().getBytes());
//			osChange.close();
//
//			BufferedReader brfChange = new BufferedReader(new InputStreamReader(conChange.getInputStream()));
//
//			int cpChange;
//			while ((cpChange = brfChange.read()) != -1) {
//				sbChange.append((char) cpChange);
//			}
//			_log.info("RESULT PROXY: " + sbChange.toString());
//			//
//			if (Validator.isNotNull(sbChange.toString())) {
//				//
//				JSONObject jsonChange = JSONFactoryUtil.createJSONObject(sbChange.toString());
//				if (jsonChange.has(UserRegisterTerm.MESSAGE) && jsonChange.has(UserRegisterTerm.ERROR_CODE)
//						&& Validator.isNotNull(jsonChange.get(UserRegisterTerm.MESSAGE))
//						&& Validator.isNotNull(jsonChange.get(UserRegisterTerm.ERROR_CODE))) {
//					int errorCodeChange = jsonChange.getInt(UserRegisterTerm.ERROR_CODE);
//					if (errorCodeChange == 0) {
//						return true;
//					}
//				}
//			}
//		} catch (Exception e) {
//			_log.error(e);
//			_log.debug("Something went wrong while reading/writing in stream!!");
//		}
//
//		return false;
//	}

//	public static String forgotLGSP(JSONObject jsonToken, String contactEmail) {
//		String accessToken = jsonToken.getString("access_token");
//		String tokenType = jsonToken.getString("token_type");
//
//		_log.info("accessToken: " + accessToken);
//		_log.info("tokenType: " + tokenType);
//
//		// Dang ky tk cong dan
//		if (Validator.isNotNull(contactEmail)) {
//			JSONObject jsonBody = JSONFactoryUtil.createJSONObject();
//			jsonBody.put(UserRegisterTerm.EMAIL, contactEmail);
//			//
//			String urlForgot = UserRegisterTerm.BASE_URL + UserRegisterTerm.ENDPOINT_FORGOT;
//			String authStrEnc = tokenType + StringPool.SPACE + accessToken;
//
//			StringBuilder sbForgot = new StringBuilder();
//			try {
//				URL urlValForgot = new URL(urlForgot);
//
//				java.net.HttpURLConnection conReg = (java.net.HttpURLConnection) urlValForgot.openConnection();
//				conReg.setRequestMethod(HttpMethod.POST);
//				conReg.setRequestProperty(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON);
//				conReg.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json;charset=UTF-8");
//				conReg.setRequestProperty(HttpHeaders.AUTHORIZATION, authStrEnc);
//				_log.debug("BASIC AUTHEN: " + authStrEnc);
//				conReg.setRequestProperty(HttpHeaders.CONTENT_LENGTH,
//						StringPool.BLANK + Integer.toString(jsonBody.toString().getBytes().length));
//
//				conReg.setUseCaches(false);
//				conReg.setDoInput(true);
//				conReg.setDoOutput(true);
//				_log.debug("POST DATA: " + jsonBody.toString());
//				OutputStream osReg = conReg.getOutputStream();
//				osReg.write(jsonBody.toString().getBytes());
//				osReg.close();
//
//				BufferedReader brfForgot = new BufferedReader(new InputStreamReader(conReg.getInputStream()));
//
//				int cpForgot;
//				while ((cpForgot = brfForgot.read()) != -1) {
//					sbForgot.append((char) cpForgot);
//				}
//				_log.info("RESULT PROXY: " + sbForgot.toString());
//				//
//				if (Validator.isNotNull(sbForgot.toString())) {
//					//
//					_log.error("sbForgot:" + sbForgot.toString());
//					JSONObject jsonForgot = JSONFactoryUtil.createJSONObject(sbForgot.toString());
//					if (jsonForgot.has("message") && jsonForgot.has("error_code")
//							&& Validator.isNotNull(jsonForgot.get("message"))
//							&& Validator.isNotNull(jsonForgot.get("error_code"))) {
//						int errorCode = jsonForgot.getInt("error_code");
//						if (errorCode == 0) {
//							return jsonForgot.get("message").toString();
//						}
//					}
//				}
//			} catch (Exception e) {
//				_log.error(e);
//				_log.debug("Something went wrong while reading/writing in stream!!");
//			}
//		}
//
//		return StringPool.BLANK;
//	}
}
