/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package pay.gate.integration.dvc.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import pay.gate.integration.dvc.model.PhiLePhi;
import pay.gate.integration.dvc.model.PhiLePhiModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the PhiLePhi service. Represents a row in the &quot;opencps_philephi&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link PhiLePhiModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PhiLePhiImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PhiLePhiImpl
 * @see PhiLePhi
 * @see PhiLePhiModel
 * @generated
 */
@ProviderType
public class PhiLePhiModelImpl extends BaseModelImpl<PhiLePhi>
	implements PhiLePhiModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a phi le phi model instance should use the {@link PhiLePhi} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_philephi";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "phiLePhiId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "loaiPLP", Types.VARCHAR },
			{ "maPLP", Types.VARCHAR },
			{ "tenPLP", Types.VARCHAR },
			{ "soTien", Types.BIGINT },
			{ "serviceConfigMappingId", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("phiLePhiId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("loaiPLP", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("maPLP", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("tenPLP", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("soTien", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("serviceConfigMappingId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table opencps_philephi (uuid_ VARCHAR(75) null,phiLePhiId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,loaiPLP VARCHAR(75) null,maPLP VARCHAR(75) null,tenPLP VARCHAR(75) null,soTien LONG,serviceConfigMappingId LONG)";
	public static final String TABLE_SQL_DROP = "drop table opencps_philephi";
	public static final String ORDER_BY_JPQL = " ORDER BY phiLePhi.phiLePhiId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_philephi.phiLePhiId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(pay.gate.integration.dvc.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.pay.gate.integration.dvc.model.PhiLePhi"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(pay.gate.integration.dvc.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.pay.gate.integration.dvc.model.PhiLePhi"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(pay.gate.integration.dvc.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.pay.gate.integration.dvc.model.PhiLePhi"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long SERVICECONFIGMAPPINGID_COLUMN_BITMASK = 4L;
	public static final long UUID_COLUMN_BITMASK = 8L;
	public static final long PHILEPHIID_COLUMN_BITMASK = 16L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(pay.gate.integration.dvc.service.util.ServiceProps.get(
				"lock.expiration.time.pay.gate.integration.dvc.model.PhiLePhi"));

	public PhiLePhiModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _phiLePhiId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPhiLePhiId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _phiLePhiId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return PhiLePhi.class;
	}

	@Override
	public String getModelClassName() {
		return PhiLePhi.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("phiLePhiId", getPhiLePhiId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("loaiPLP", getLoaiPLP());
		attributes.put("maPLP", getMaPLP());
		attributes.put("tenPLP", getTenPLP());
		attributes.put("soTien", getSoTien());
		attributes.put("serviceConfigMappingId", getServiceConfigMappingId());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long phiLePhiId = (Long)attributes.get("phiLePhiId");

		if (phiLePhiId != null) {
			setPhiLePhiId(phiLePhiId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String loaiPLP = (String)attributes.get("loaiPLP");

		if (loaiPLP != null) {
			setLoaiPLP(loaiPLP);
		}

		String maPLP = (String)attributes.get("maPLP");

		if (maPLP != null) {
			setMaPLP(maPLP);
		}

		String tenPLP = (String)attributes.get("tenPLP");

		if (tenPLP != null) {
			setTenPLP(tenPLP);
		}

		Long soTien = (Long)attributes.get("soTien");

		if (soTien != null) {
			setSoTien(soTien);
		}

		Long serviceConfigMappingId = (Long)attributes.get(
				"serviceConfigMappingId");

		if (serviceConfigMappingId != null) {
			setServiceConfigMappingId(serviceConfigMappingId);
		}
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getPhiLePhiId() {
		return _phiLePhiId;
	}

	@Override
	public void setPhiLePhiId(long phiLePhiId) {
		_phiLePhiId = phiLePhiId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@Override
	public String getLoaiPLP() {
		if (_loaiPLP == null) {
			return "";
		}
		else {
			return _loaiPLP;
		}
	}

	@Override
	public void setLoaiPLP(String loaiPLP) {
		_loaiPLP = loaiPLP;
	}

	@Override
	public String getMaPLP() {
		if (_maPLP == null) {
			return "";
		}
		else {
			return _maPLP;
		}
	}

	@Override
	public void setMaPLP(String maPLP) {
		_maPLP = maPLP;
	}

	@Override
	public String getTenPLP() {
		if (_tenPLP == null) {
			return "";
		}
		else {
			return _tenPLP;
		}
	}

	@Override
	public void setTenPLP(String tenPLP) {
		_tenPLP = tenPLP;
	}

	@Override
	public long getSoTien() {
		return _soTien;
	}

	@Override
	public void setSoTien(long soTien) {
		_soTien = soTien;
	}

	@Override
	public long getServiceConfigMappingId() {
		return _serviceConfigMappingId;
	}

	@Override
	public void setServiceConfigMappingId(long serviceConfigMappingId) {
		_columnBitmask |= SERVICECONFIGMAPPINGID_COLUMN_BITMASK;

		if (!_setOriginalServiceConfigMappingId) {
			_setOriginalServiceConfigMappingId = true;

			_originalServiceConfigMappingId = _serviceConfigMappingId;
		}

		_serviceConfigMappingId = serviceConfigMappingId;
	}

	public long getOriginalServiceConfigMappingId() {
		return _originalServiceConfigMappingId;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				PhiLePhi.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			PhiLePhi.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public PhiLePhi toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (PhiLePhi)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PhiLePhiImpl phiLePhiImpl = new PhiLePhiImpl();

		phiLePhiImpl.setUuid(getUuid());
		phiLePhiImpl.setPhiLePhiId(getPhiLePhiId());
		phiLePhiImpl.setGroupId(getGroupId());
		phiLePhiImpl.setCompanyId(getCompanyId());
		phiLePhiImpl.setUserId(getUserId());
		phiLePhiImpl.setUserName(getUserName());
		phiLePhiImpl.setCreateDate(getCreateDate());
		phiLePhiImpl.setModifiedDate(getModifiedDate());
		phiLePhiImpl.setLoaiPLP(getLoaiPLP());
		phiLePhiImpl.setMaPLP(getMaPLP());
		phiLePhiImpl.setTenPLP(getTenPLP());
		phiLePhiImpl.setSoTien(getSoTien());
		phiLePhiImpl.setServiceConfigMappingId(getServiceConfigMappingId());

		phiLePhiImpl.resetOriginalValues();

		return phiLePhiImpl;
	}

	@Override
	public int compareTo(PhiLePhi phiLePhi) {
		long primaryKey = phiLePhi.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PhiLePhi)) {
			return false;
		}

		PhiLePhi phiLePhi = (PhiLePhi)obj;

		long primaryKey = phiLePhi.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		PhiLePhiModelImpl phiLePhiModelImpl = this;

		phiLePhiModelImpl._originalUuid = phiLePhiModelImpl._uuid;

		phiLePhiModelImpl._originalGroupId = phiLePhiModelImpl._groupId;

		phiLePhiModelImpl._setOriginalGroupId = false;

		phiLePhiModelImpl._originalCompanyId = phiLePhiModelImpl._companyId;

		phiLePhiModelImpl._setOriginalCompanyId = false;

		phiLePhiModelImpl._setModifiedDate = false;

		phiLePhiModelImpl._originalServiceConfigMappingId = phiLePhiModelImpl._serviceConfigMappingId;

		phiLePhiModelImpl._setOriginalServiceConfigMappingId = false;

		phiLePhiModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<PhiLePhi> toCacheModel() {
		PhiLePhiCacheModel phiLePhiCacheModel = new PhiLePhiCacheModel();

		phiLePhiCacheModel.uuid = getUuid();

		String uuid = phiLePhiCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			phiLePhiCacheModel.uuid = null;
		}

		phiLePhiCacheModel.phiLePhiId = getPhiLePhiId();

		phiLePhiCacheModel.groupId = getGroupId();

		phiLePhiCacheModel.companyId = getCompanyId();

		phiLePhiCacheModel.userId = getUserId();

		phiLePhiCacheModel.userName = getUserName();

		String userName = phiLePhiCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			phiLePhiCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			phiLePhiCacheModel.createDate = createDate.getTime();
		}
		else {
			phiLePhiCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			phiLePhiCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			phiLePhiCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		phiLePhiCacheModel.loaiPLP = getLoaiPLP();

		String loaiPLP = phiLePhiCacheModel.loaiPLP;

		if ((loaiPLP != null) && (loaiPLP.length() == 0)) {
			phiLePhiCacheModel.loaiPLP = null;
		}

		phiLePhiCacheModel.maPLP = getMaPLP();

		String maPLP = phiLePhiCacheModel.maPLP;

		if ((maPLP != null) && (maPLP.length() == 0)) {
			phiLePhiCacheModel.maPLP = null;
		}

		phiLePhiCacheModel.tenPLP = getTenPLP();

		String tenPLP = phiLePhiCacheModel.tenPLP;

		if ((tenPLP != null) && (tenPLP.length() == 0)) {
			phiLePhiCacheModel.tenPLP = null;
		}

		phiLePhiCacheModel.soTien = getSoTien();

		phiLePhiCacheModel.serviceConfigMappingId = getServiceConfigMappingId();

		return phiLePhiCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", phiLePhiId=");
		sb.append(getPhiLePhiId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", loaiPLP=");
		sb.append(getLoaiPLP());
		sb.append(", maPLP=");
		sb.append(getMaPLP());
		sb.append(", tenPLP=");
		sb.append(getTenPLP());
		sb.append(", soTien=");
		sb.append(getSoTien());
		sb.append(", serviceConfigMappingId=");
		sb.append(getServiceConfigMappingId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("pay.gate.integration.dvc.model.PhiLePhi");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phiLePhiId</column-name><column-value><![CDATA[");
		sb.append(getPhiLePhiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiPLP</column-name><column-value><![CDATA[");
		sb.append(getLoaiPLP());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maPLP</column-name><column-value><![CDATA[");
		sb.append(getMaPLP());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenPLP</column-name><column-value><![CDATA[");
		sb.append(getTenPLP());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soTien</column-name><column-value><![CDATA[");
		sb.append(getSoTien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceConfigMappingId</column-name><column-value><![CDATA[");
		sb.append(getServiceConfigMappingId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = PhiLePhi.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			PhiLePhi.class, ModelWrapper.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _phiLePhiId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _loaiPLP;
	private String _maPLP;
	private String _tenPLP;
	private long _soTien;
	private long _serviceConfigMappingId;
	private long _originalServiceConfigMappingId;
	private boolean _setOriginalServiceConfigMappingId;
	private long _columnBitmask;
	private PhiLePhi _escapedModel;
}