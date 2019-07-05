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

package org.opencps.dossiermgt.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import org.opencps.dossiermgt.model.ServiceProcessRole;
import org.opencps.dossiermgt.model.ServiceProcessRoleModel;
import org.opencps.dossiermgt.service.persistence.ServiceProcessRolePK;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ServiceProcessRole service. Represents a row in the &quot;opencps_serviceprocessrole&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ServiceProcessRoleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ServiceProcessRoleImpl}.
 * </p>
 *
 * @author huymq
 * @see ServiceProcessRoleImpl
 * @see ServiceProcessRole
 * @see ServiceProcessRoleModel
 * @generated
 */
@ProviderType
public class ServiceProcessRoleModelImpl extends BaseModelImpl<ServiceProcessRole>
	implements ServiceProcessRoleModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a service process role model instance should use the {@link ServiceProcessRole} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_serviceprocessrole";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "serviceProcessId", Types.BIGINT },
			{ "roleId", Types.BIGINT },
			{ "roleCode", Types.VARCHAR },
			{ "roleName", Types.VARCHAR },
			{ "moderator", Types.BOOLEAN },
			{ "condition_", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("serviceProcessId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("roleId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("roleCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("roleName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("moderator", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("condition_", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table opencps_serviceprocessrole (uuid_ VARCHAR(75) null,serviceProcessId LONG not null,roleId LONG not null,roleCode VARCHAR(255) null,roleName VARCHAR(255) null,moderator BOOLEAN,condition_ VARCHAR(75) null,primary key (serviceProcessId, roleId))";
	public static final String TABLE_SQL_DROP = "drop table opencps_serviceprocessrole";
	public static final String ORDER_BY_JPQL = " ORDER BY serviceProcessRole.id.serviceProcessId ASC, serviceProcessRole.id.roleId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_serviceprocessrole.serviceProcessId ASC, opencps_serviceprocessrole.roleId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.org.opencps.dossiermgt.model.ServiceProcessRole"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.org.opencps.dossiermgt.model.ServiceProcessRole"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.opencps.dossiermgt.model.ServiceProcessRole"),
			true);
	public static final long ROLECODE_COLUMN_BITMASK = 1L;
	public static final long SERVICEPROCESSID_COLUMN_BITMASK = 2L;
	public static final long UUID_COLUMN_BITMASK = 4L;
	public static final long ROLEID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"lock.expiration.time.org.opencps.dossiermgt.model.ServiceProcessRole"));

	public ServiceProcessRoleModelImpl() {
	}

	@Override
	public ServiceProcessRolePK getPrimaryKey() {
		return new ServiceProcessRolePK(_serviceProcessId, _roleId);
	}

	@Override
	public void setPrimaryKey(ServiceProcessRolePK primaryKey) {
		setServiceProcessId(primaryKey.serviceProcessId);
		setRoleId(primaryKey.roleId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new ServiceProcessRolePK(_serviceProcessId, _roleId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((ServiceProcessRolePK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceProcessRole.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceProcessRole.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("serviceProcessId", getServiceProcessId());
		attributes.put("roleId", getRoleId());
		attributes.put("roleCode", getRoleCode());
		attributes.put("roleName", getRoleName());
		attributes.put("moderator", isModerator());
		attributes.put("condition", getCondition());

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

		Long serviceProcessId = (Long)attributes.get("serviceProcessId");

		if (serviceProcessId != null) {
			setServiceProcessId(serviceProcessId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}

		String roleCode = (String)attributes.get("roleCode");

		if (roleCode != null) {
			setRoleCode(roleCode);
		}

		String roleName = (String)attributes.get("roleName");

		if (roleName != null) {
			setRoleName(roleName);
		}

		Boolean moderator = (Boolean)attributes.get("moderator");

		if (moderator != null) {
			setModerator(moderator);
		}

		String condition = (String)attributes.get("condition");

		if (condition != null) {
			setCondition(condition);
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
	public long getServiceProcessId() {
		return _serviceProcessId;
	}

	@Override
	public void setServiceProcessId(long serviceProcessId) {
		_columnBitmask |= SERVICEPROCESSID_COLUMN_BITMASK;

		if (!_setOriginalServiceProcessId) {
			_setOriginalServiceProcessId = true;

			_originalServiceProcessId = _serviceProcessId;
		}

		_serviceProcessId = serviceProcessId;
	}

	public long getOriginalServiceProcessId() {
		return _originalServiceProcessId;
	}

	@Override
	public long getRoleId() {
		return _roleId;
	}

	@Override
	public void setRoleId(long roleId) {
		_roleId = roleId;
	}

	@Override
	public String getRoleCode() {
		if (_roleCode == null) {
			return "";
		}
		else {
			return _roleCode;
		}
	}

	@Override
	public void setRoleCode(String roleCode) {
		_columnBitmask |= ROLECODE_COLUMN_BITMASK;

		if (_originalRoleCode == null) {
			_originalRoleCode = _roleCode;
		}

		_roleCode = roleCode;
	}

	public String getOriginalRoleCode() {
		return GetterUtil.getString(_originalRoleCode);
	}

	@Override
	public String getRoleName() {
		if (_roleName == null) {
			return "";
		}
		else {
			return _roleName;
		}
	}

	@Override
	public void setRoleName(String roleName) {
		_roleName = roleName;
	}

	@Override
	public boolean getModerator() {
		return _moderator;
	}

	@Override
	public boolean isModerator() {
		return _moderator;
	}

	@Override
	public void setModerator(boolean moderator) {
		_moderator = moderator;
	}

	@Override
	public String getCondition() {
		if (_condition == null) {
			return "";
		}
		else {
			return _condition;
		}
	}

	@Override
	public void setCondition(String condition) {
		_condition = condition;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ServiceProcessRole toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ServiceProcessRole)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ServiceProcessRoleImpl serviceProcessRoleImpl = new ServiceProcessRoleImpl();

		serviceProcessRoleImpl.setUuid(getUuid());
		serviceProcessRoleImpl.setServiceProcessId(getServiceProcessId());
		serviceProcessRoleImpl.setRoleId(getRoleId());
		serviceProcessRoleImpl.setRoleCode(getRoleCode());
		serviceProcessRoleImpl.setRoleName(getRoleName());
		serviceProcessRoleImpl.setModerator(isModerator());
		serviceProcessRoleImpl.setCondition(getCondition());

		serviceProcessRoleImpl.resetOriginalValues();

		return serviceProcessRoleImpl;
	}

	@Override
	public int compareTo(ServiceProcessRole serviceProcessRole) {
		ServiceProcessRolePK primaryKey = serviceProcessRole.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceProcessRole)) {
			return false;
		}

		ServiceProcessRole serviceProcessRole = (ServiceProcessRole)obj;

		ServiceProcessRolePK primaryKey = serviceProcessRole.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
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
		ServiceProcessRoleModelImpl serviceProcessRoleModelImpl = this;

		serviceProcessRoleModelImpl._originalUuid = serviceProcessRoleModelImpl._uuid;

		serviceProcessRoleModelImpl._originalServiceProcessId = serviceProcessRoleModelImpl._serviceProcessId;

		serviceProcessRoleModelImpl._setOriginalServiceProcessId = false;

		serviceProcessRoleModelImpl._originalRoleCode = serviceProcessRoleModelImpl._roleCode;

		serviceProcessRoleModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ServiceProcessRole> toCacheModel() {
		ServiceProcessRoleCacheModel serviceProcessRoleCacheModel = new ServiceProcessRoleCacheModel();

		serviceProcessRoleCacheModel.serviceProcessRolePK = getPrimaryKey();

		serviceProcessRoleCacheModel.uuid = getUuid();

		String uuid = serviceProcessRoleCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			serviceProcessRoleCacheModel.uuid = null;
		}

		serviceProcessRoleCacheModel.serviceProcessId = getServiceProcessId();

		serviceProcessRoleCacheModel.roleId = getRoleId();

		serviceProcessRoleCacheModel.roleCode = getRoleCode();

		String roleCode = serviceProcessRoleCacheModel.roleCode;

		if ((roleCode != null) && (roleCode.length() == 0)) {
			serviceProcessRoleCacheModel.roleCode = null;
		}

		serviceProcessRoleCacheModel.roleName = getRoleName();

		String roleName = serviceProcessRoleCacheModel.roleName;

		if ((roleName != null) && (roleName.length() == 0)) {
			serviceProcessRoleCacheModel.roleName = null;
		}

		serviceProcessRoleCacheModel.moderator = isModerator();

		serviceProcessRoleCacheModel.condition = getCondition();

		String condition = serviceProcessRoleCacheModel.condition;

		if ((condition != null) && (condition.length() == 0)) {
			serviceProcessRoleCacheModel.condition = null;
		}

		return serviceProcessRoleCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", serviceProcessId=");
		sb.append(getServiceProcessId());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append(", roleCode=");
		sb.append(getRoleCode());
		sb.append(", roleName=");
		sb.append(getRoleName());
		sb.append(", moderator=");
		sb.append(isModerator());
		sb.append(", condition=");
		sb.append(getCondition());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("org.opencps.dossiermgt.model.ServiceProcessRole");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceProcessId</column-name><column-value><![CDATA[");
		sb.append(getServiceProcessId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleCode</column-name><column-value><![CDATA[");
		sb.append(getRoleCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleName</column-name><column-value><![CDATA[");
		sb.append(getRoleName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>moderator</column-name><column-value><![CDATA[");
		sb.append(isModerator());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>condition</column-name><column-value><![CDATA[");
		sb.append(getCondition());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = ServiceProcessRole.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			ServiceProcessRole.class, ModelWrapper.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _serviceProcessId;
	private long _originalServiceProcessId;
	private boolean _setOriginalServiceProcessId;
	private long _roleId;
	private String _roleCode;
	private String _originalRoleCode;
	private String _roleName;
	private boolean _moderator;
	private String _condition;
	private long _columnBitmask;
	private ServiceProcessRole _escapedModel;
}