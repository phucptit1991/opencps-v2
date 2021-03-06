package org.opencps.statistic.service.persistence.impl;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.util.List;

import org.opencps.statistic.model.OpencpsDossierStatisticManual;
import org.opencps.statistic.model.impl.OpencpsDossierStatisticManualImpl;
import org.opencps.statistic.service.persistence.OpencpsDossierStatisticManualFinder;

public class OpencpsDossierStatisticManualFinderImpl extends OpencpsDossierStatisticManualFinderBaseImpl
	implements OpencpsDossierStatisticManualFinder {
	private final static Log LOG = LogFactoryUtil.getLog(OpencpsDossierStatisticManualFinderImpl.class);

	private static final String SEARCH_DOSSIER_STATISTIC = OpencpsDossierStatisticManualFinder.class.getName()
			+ ".searchStatisic";
	private static final String SEARCH_DOSSIER_STATISTIC_SYSTEM = OpencpsDossierStatisticManualFinder.class.getName()
			+ ".searchStatisicSystem";

	private static final String TOTAL = "total";

	private static final String CONDITION_DOMAIN = "(opencps_statistic_manual.domainCode = ?) AND";
	private static final String CONDITION_DOMAIN_REPLACE = "(opencps_statistic_manual.domainCode IS NULL) AND";
	private static final String CONDITION_GOV_AGENCY = "(opencps_statistic_manual.govAgencyCode = ?) AND";
	private static final String CONDITION_GOV_AGENCY_REPLACE = "(opencps_statistic_manual.govAgencyCode IS NULL) AND";
	private static final String CONDITION_GROUP_AGENCY = "(opencps_statistic_manual.groupAgencyCode = ?) AND";
	private static final String CONDITION_MONTH = "(opencps_statistic_manual.month = ?) AND";
	private static final String CONDITION_MONTH_REPLACE = "(opencps_statistic_manual.month != 0) AND";
	private static final String CONDITION_YEAR = "(opencps_statistic_manual.year = ?) AND";
	private static final String CONDITION_YEAR_REPLACE = "(opencps_statistic_manual.year != 0) AND";
	private static final String CONDITION_SYSTEM = "(opencps_statistic_manual.system = ?) AND";
	private static final String CONDITION_SYSTEM_REPLACE = "(opencps_statistic_manual.system IS NULL) AND";
	
	public static final int ALL_MONTH = -1;
	
	@SuppressWarnings("unchecked")
	public OpencpsDossierStatisticManual checkContains(long groupId, int month, int year, String domain, String govAgency) {
		Session session = null;

		try {
			session = openSession();

			String sql = _customSQL.get(getClass(), SEARCH_DOSSIER_STATISTIC);

		
			if (Validator.isNull(domain)) {
				sql = StringUtil.replace(sql, CONDITION_DOMAIN, CONDITION_DOMAIN_REPLACE);
			} 
			
			if (Validator.isNull(govAgency)) {
				sql = StringUtil.replace(sql, CONDITION_GOV_AGENCY, CONDITION_GOV_AGENCY_REPLACE);
			} 
			
			sql = StringUtil.replace(sql, CONDITION_GROUP_AGENCY, StringPool.BLANK);

			//LOG.info(sql);

			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(true);
			q.addEntity("OpencpsDossierStatisticManual", OpencpsDossierStatisticManualImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			/* add month parameter */

			qPos.add(month);

			/* add year parameter */
			qPos.add(year);

			/* add domain parameter */
			if (Validator.isNotNull(domain)) {
				qPos.add(domain);
			}

			/* add govAgency parameter */
			if (Validator.isNotNull(govAgency)) {
				qPos.add(govAgency);
			}

			/* add reporting */
			//qPos.add(reporting);

			/* add groupId */
			qPos.add(groupId);
			
			List<OpencpsDossierStatisticManual> ls = (List<OpencpsDossierStatisticManual>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
			if (ls.size() > 0) {
				return ls.get(0);
			} 


		} catch (Exception e) {
			LOG.error(e);
			try {
				throw new SystemException(e);
			} catch (SystemException se) {
				LOG.error(se);
			}
		} finally {
			closeSession(session);
		}

		return null;
	}

	@SuppressWarnings("unchecked")
	public OpencpsDossierStatisticManual checkContainsSystem(long groupId, int month, int year, String domain,
			String govAgency, String system) {
		Session session = null;

		try {
			session = openSession();

			String sql = _customSQL.get(getClass(), SEARCH_DOSSIER_STATISTIC_SYSTEM);

		
			if (Validator.isNull(domain)) {
				sql = StringUtil.replace(sql, CONDITION_DOMAIN, CONDITION_DOMAIN_REPLACE);
			} 
			
			if (Validator.isNull(govAgency)) {
				sql = StringUtil.replace(sql, CONDITION_GOV_AGENCY, CONDITION_GOV_AGENCY_REPLACE);
			}
			
			if (Validator.isNull(system)) {
				sql = StringUtil.replace(sql, CONDITION_SYSTEM, CONDITION_SYSTEM_REPLACE);
			}
			
			sql = StringUtil.replace(sql, CONDITION_GROUP_AGENCY, StringPool.BLANK);

			//LOG.info(sql);

			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(true);
			q.addEntity("OpencpsDossierStatisticManual", OpencpsDossierStatisticManualImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			/* add month parameter */

			qPos.add(month);

			/* add year parameter */
			qPos.add(year);

			/* add systemId parameter */
			if (Validator.isNotNull(system)) {
				qPos.add(system);
			}

			/* add domain parameter */
			if (Validator.isNotNull(domain)) {
				qPos.add(domain);
			}

			/* add govAgency parameter */
			if (Validator.isNotNull(govAgency)) {
				qPos.add(govAgency);
			}

			/* add reporting */
			//qPos.add(reporting);

			/* add groupId */
			qPos.add(groupId);
			
			List<OpencpsDossierStatisticManual> ls = (List<OpencpsDossierStatisticManual>) QueryUtil.list(q, getDialect(),
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
			if (ls.size() > 0) {
				return ls.get(0);
			} 


		} catch (Exception e) {
			LOG.error(e);
			try {
				throw new SystemException(e);
			} catch (SystemException se) {
				LOG.error(se);
			}
		} finally {
			closeSession(session);
		}

		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<OpencpsDossierStatisticManual> searchDossierStatistic(long groupId, int year,
			String domain, String govAgency, String groupAgencyCode, int start, int end) {
		Session session = null;
		
		try {
			session = openSession();

			String sql = _customSQL.get(getClass(), SEARCH_DOSSIER_STATISTIC);
			
			sql = StringUtil.replace(sql, CONDITION_MONTH, CONDITION_MONTH_REPLACE);
		
			if (domain.contains("total")){
				sql = StringUtil.replace(sql, CONDITION_DOMAIN, CONDITION_DOMAIN_REPLACE);
			}
			
			if (govAgency.contains("total")){
				sql = StringUtil.replace(sql, CONDITION_GOV_AGENCY,CONDITION_GOV_AGENCY_REPLACE);
			}
			
			sql = StringUtil.replace(sql, CONDITION_GROUP_AGENCY, StringPool.BLANK);

			//LOG.info(sql);

			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(true);
			q.addEntity("OpencpsDossierStatisticManual", OpencpsDossierStatisticManualImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			/* add month parameter */


			/* add year parameter */
			qPos.add(year);

			/* add domain parameter */
			if (!domain.contentEquals(TOTAL)) {
				qPos.add(domain);
			}

			/* add govAgency parameter */
			if (!govAgency.contentEquals(TOTAL)) {
				qPos.add(govAgency);
			}

			/* add reporting */
			//qPos.add(reporting);

			/* add groupId */
			qPos.add(groupId);
			
			return (List<OpencpsDossierStatisticManual>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			

		} catch (Exception e) {
			LOG.error(e);
			try {
				throw new SystemException(e);
			} catch (SystemException se) {
				LOG.error(se);
			}
		} finally {
			closeSession(session);
		}

		return null;
	}

	@SuppressWarnings("unchecked")
	public List<OpencpsDossierStatisticManual> searchDossierStatistic(long groupId, int year,
			String domain, String govAgency, String system, String groupAgencyCode, int start, int end) {
		Session session = null;

		try {
			session = openSession();

			String sql = _customSQL.get(getClass(), SEARCH_DOSSIER_STATISTIC_SYSTEM);
			
			sql = StringUtil.replace(sql, CONDITION_MONTH, CONDITION_MONTH_REPLACE);
		
			if (domain.contains("total")){
				sql = StringUtil.replace(sql, CONDITION_DOMAIN, CONDITION_DOMAIN_REPLACE);
			}
			
			if (govAgency.contains("total")){
				sql = StringUtil.replace(sql, CONDITION_GOV_AGENCY,CONDITION_GOV_AGENCY_REPLACE);
			}
			
			if (system.contains("total")){
				sql = StringUtil.replace(sql, CONDITION_SYSTEM,CONDITION_SYSTEM_REPLACE);
			}
			
			sql = StringUtil.replace(sql, CONDITION_GROUP_AGENCY, StringPool.BLANK);

			//LOG.info(sql);

			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(true);
			q.addEntity("OpencpsDossierStatisticManual", OpencpsDossierStatisticManualImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			/* add month parameter */


			/* add year parameter */
			qPos.add(year);

			/* add domain parameter */
			if (!system.contentEquals(TOTAL)) {
				qPos.add(system);
			}

			/* add domain parameter */
			if (!domain.contentEquals(TOTAL)) {
				qPos.add(domain);
			}

			/* add govAgency parameter */
			if (!govAgency.contentEquals(TOTAL)) {
				qPos.add(govAgency);
			}

			/* add reporting */
			//qPos.add(reporting);

			/* add groupId */
			qPos.add(groupId);
			
			return (List<OpencpsDossierStatisticManual>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			

		} catch (Exception e) {
			LOG.error(e);
			try {
				throw new SystemException(e);
			} catch (SystemException se) {
				LOG.error(se);
			}
		} finally {
			closeSession(session);
		}

		return null;
	}

	@SuppressWarnings("unchecked")
	public List<OpencpsDossierStatisticManual> searchYearDossierStatistic(long groupId, int month,
			String domain, String govAgency, String system, String groupAgencyCode, int start, int end) {
		Session session = null;

		try {
			session = openSession();
	
			String sql = _customSQL.get(getClass(), SEARCH_DOSSIER_STATISTIC_SYSTEM);
			
			sql = StringUtil.replace(sql, CONDITION_YEAR, CONDITION_YEAR_REPLACE);
		
			if (domain.contains("total")){
				sql = StringUtil.replace(sql, CONDITION_DOMAIN, CONDITION_DOMAIN_REPLACE);
			}
			
			if (govAgency.contains("total")){
				sql = StringUtil.replace(sql, CONDITION_GOV_AGENCY,CONDITION_GOV_AGENCY_REPLACE);
			}
			
			if (system.contains("total")){
				sql = StringUtil.replace(sql, CONDITION_SYSTEM,CONDITION_SYSTEM_REPLACE);
			}
			
			sql = StringUtil.replace(sql, CONDITION_GROUP_AGENCY, StringPool.BLANK);
	
			//LOG.info("sql: "+sql);
	
			SQLQuery q = session.createSQLQuery(sql);
	
			q.setCacheable(true);
			q.addEntity("OpencpsDossierStatisticManual", OpencpsDossierStatisticManualImpl.class);
	
			QueryPos qPos = QueryPos.getInstance(q);
	
			/* add month parameter */
			qPos.add(month);
	
			/* add year parameter */
	
			/* add domain parameter */
			if (!system.contentEquals(TOTAL)) {
				qPos.add(system);
			}
	
			/* add domain parameter */
			if (!domain.contentEquals(TOTAL)) {
				qPos.add(domain);
			}
	
			/* add govAgency parameter */
			if (!govAgency.contentEquals(TOTAL)) {
				qPos.add(govAgency);
			}
	
			/* add reporting */
			//qPos.add(reporting);
	
			/* add groupId */
			qPos.add(groupId);
			
			return (List<OpencpsDossierStatisticManual>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
	
		} catch (Exception e) {
			LOG.error(e);
			try {
				throw new SystemException(e);
			} catch (SystemException se) {
				LOG.error(se);
			}
		} finally {
			closeSession(session);
		}

		return null;
	}

	@SuppressWarnings("unchecked")
	public List<OpencpsDossierStatisticManual> searchByDomainGovAgencyGroup(long groupId, int month, int year, String domain,
			String govAgency, String groupAgencyCode, int start, int end) {
		Session session = null;

		try {
			session = openSession();

			String sql = _customSQL.get(getClass(), SEARCH_DOSSIER_STATISTIC);

			// LOG.info(sql);

			if (month == ALL_MONTH) {
				sql = StringUtil.replace(sql, CONDITION_MONTH, StringPool.BLANK);
			}

			/* remove year */
			if (year == 0) {
				sql = StringUtil.replace(sql, CONDITION_YEAR, StringPool.BLANK);
			}
			
			if (Validator.isNull(domain)) {
				sql = StringUtil.replace(sql, CONDITION_DOMAIN, StringPool.BLANK);
			} else if (domain.contentEquals(TOTAL)){
				sql = StringUtil.replace(sql, CONDITION_DOMAIN, CONDITION_DOMAIN_REPLACE);
			}
			
			if (Validator.isNull(govAgency)) {
				sql = StringUtil.replace(sql, CONDITION_GOV_AGENCY, StringPool.BLANK);
			} else if (govAgency.contentEquals(TOTAL)){
				sql = StringUtil.replace(sql, CONDITION_GOV_AGENCY,CONDITION_GOV_AGENCY_REPLACE);
			}
			
			/* remove condition groupAgency, find by all groupAgency */
			if (Validator.isNull(groupAgencyCode) || groupAgencyCode.contentEquals(TOTAL)) {
				sql = StringUtil.replace(sql, CONDITION_GROUP_AGENCY, StringPool.BLANK);
			}

			//LOG.info(sql);

			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(true);
			q.addEntity("OpencpsDossierStatisticManual", OpencpsDossierStatisticManualImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			/* add month parameter */

			if (month != ALL_MONTH) {
				qPos.add(month);
			}

			/* add year parameter */
			if (year != 0) {
				qPos.add(year);
			}

			/* add domain parameter */
			if (Validator.isNotNull(domain) && !domain.contentEquals(TOTAL)) {
				qPos.add(domain);
			}

			/* add govAgency parameter */
			if (Validator.isNotNull(govAgency) && !govAgency.contentEquals(TOTAL)) {
				qPos.add(govAgency);
			}

			/* add groupAgency parameter */
			if (Validator.isNotNull(groupAgencyCode) && !groupAgencyCode.contentEquals(TOTAL)) {
				qPos.add(groupAgencyCode);
			}

			/* add reporting */
			//qPos.add(reporting);

			/* add groupId */
			qPos.add(groupId);

			return (List<OpencpsDossierStatisticManual>) QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			LOG.error(e);
			try {
				throw new SystemException(e);
			} catch (SystemException se) {
				LOG.error(se);
			}
		} finally {
			closeSession(session);
		}

		return null;
	}

	@SuppressWarnings("unchecked")
	public List<OpencpsDossierStatisticManual> searchByDomainAgencySystem(long groupId, int month, int year, String domain,
			String govAgency, String system, String groupAgencyCode, int start, int end) {
		Session session = null;

		try {
			session = openSession();

			String sql = _customSQL.get(getClass(), SEARCH_DOSSIER_STATISTIC_SYSTEM);

			 LOG.info(sql);

			if (month == ALL_MONTH) {
				sql = StringUtil.replace(sql, CONDITION_MONTH, StringPool.BLANK);
			}

			/* remove year */
			if (year == ALL_MONTH) {
				sql = StringUtil.replace(sql, CONDITION_YEAR, StringPool.BLANK);
			}

			if (Validator.isNull(system)) {
				sql = StringUtil.replace(sql, CONDITION_SYSTEM, StringPool.BLANK);
			} else if (system.contentEquals(TOTAL)) {
				sql = StringUtil.replace(sql, CONDITION_SYSTEM, CONDITION_SYSTEM_REPLACE);
			}

			if (Validator.isNull(domain)) {
				sql = StringUtil.replace(sql, CONDITION_DOMAIN, StringPool.BLANK);
			} else if (domain.contentEquals(TOTAL)){
				sql = StringUtil.replace(sql, CONDITION_DOMAIN, CONDITION_DOMAIN_REPLACE);
			}
			
			if (Validator.isNull(govAgency)) {
				sql = StringUtil.replace(sql, CONDITION_GOV_AGENCY, StringPool.BLANK);
			} else if (govAgency.contentEquals(TOTAL)){
				sql = StringUtil.replace(sql, CONDITION_GOV_AGENCY,CONDITION_GOV_AGENCY_REPLACE);
			}
			
			/* remove condition groupAgency, find by all groupAgency */
			if (Validator.isNull(groupAgencyCode) || groupAgencyCode.contentEquals(TOTAL)) {
				sql = StringUtil.replace(sql, CONDITION_GROUP_AGENCY, StringPool.BLANK);
			}

			LOG.info(sql);

			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(true);
			q.addEntity("OpencpsDossierStatisticManual", OpencpsDossierStatisticManualImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			/* add month parameter */

			if (month != ALL_MONTH) {
				qPos.add(month);
			}

			/* add year parameter */
			if (year != ALL_MONTH) {
				qPos.add(year);
			}

			/* add system parameter */
			if (Validator.isNotNull(system) && !system.contentEquals(TOTAL)) {
				qPos.add(system);
			}

			/* add domain parameter */
			if (Validator.isNotNull(domain) && !domain.contentEquals(TOTAL)) {
				qPos.add(domain);
			}

			/* add govAgency parameter */
			if (Validator.isNotNull(govAgency) && !govAgency.contentEquals(TOTAL)) {
				qPos.add(govAgency);
			}

			/* add groupAgency parameter */
			if (Validator.isNotNull(groupAgencyCode) && !groupAgencyCode.contentEquals(TOTAL)) {
				qPos.add(groupAgencyCode);
			}

			/* add reporting */
			//qPos.add(reporting);

			/* add groupId */
			qPos.add(groupId);

			return (List<OpencpsDossierStatisticManual>) QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			LOG.error(e);
			try {
				throw new SystemException(e);
			} catch (SystemException se) {
				LOG.error(se);
			}
		} finally {
			closeSession(session);
		}

		return null;
	}
	
	@ServiceReference(type = CustomSQL.class)
	private CustomSQL _customSQL;
}
