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

package org.opencps.dossiermgt.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MenuRoleLocalService}.
 *
 * @author huymq
 * @see MenuRoleLocalService
 * @generated
 */
@ProviderType
public class MenuRoleLocalServiceWrapper implements MenuRoleLocalService,
	ServiceWrapper<MenuRoleLocalService> {
	public MenuRoleLocalServiceWrapper(
		MenuRoleLocalService menuRoleLocalService) {
		_menuRoleLocalService = menuRoleLocalService;
	}

	/**
	* Adds the menu role to the database. Also notifies the appropriate model listeners.
	*
	* @param menuRole the menu role
	* @return the menu role that was added
	*/
	@Override
	public org.opencps.dossiermgt.model.MenuRole addMenuRole(
		org.opencps.dossiermgt.model.MenuRole menuRole) {
		return _menuRoleLocalService.addMenuRole(menuRole);
	}

	@Override
	public org.opencps.dossiermgt.model.MenuRole adminProcessData(
		com.liferay.portal.kernel.json.JSONObject objectData) {
		return _menuRoleLocalService.adminProcessData(objectData);
	}

	@Override
	public org.opencps.dossiermgt.model.MenuRole adminProcessDelete(Long id) {
		return _menuRoleLocalService.adminProcessDelete(id);
	}

	/**
	* Creates a new menu role with the primary key. Does not add the menu role to the database.
	*
	* @param menuRolePK the primary key for the new menu role
	* @return the new menu role
	*/
	@Override
	public org.opencps.dossiermgt.model.MenuRole createMenuRole(
		org.opencps.dossiermgt.service.persistence.MenuRolePK menuRolePK) {
		return _menuRoleLocalService.createMenuRole(menuRolePK);
	}

	@Override
	public void deleteAll() {
		_menuRoleLocalService.deleteAll();
	}

	/**
	* Deletes the menu role from the database. Also notifies the appropriate model listeners.
	*
	* @param menuRole the menu role
	* @return the menu role that was removed
	*/
	@Override
	public org.opencps.dossiermgt.model.MenuRole deleteMenuRole(
		org.opencps.dossiermgt.model.MenuRole menuRole) {
		return _menuRoleLocalService.deleteMenuRole(menuRole);
	}

	/**
	* Deletes the menu role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param menuRolePK the primary key of the menu role
	* @return the menu role that was removed
	* @throws PortalException if a menu role with the primary key could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.MenuRole deleteMenuRole(
		org.opencps.dossiermgt.service.persistence.MenuRolePK menuRolePK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _menuRoleLocalService.deleteMenuRole(menuRolePK);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _menuRoleLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _menuRoleLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _menuRoleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.MenuRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _menuRoleLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.MenuRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _menuRoleLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _menuRoleLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _menuRoleLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.opencps.dossiermgt.model.MenuRole fetchMenuRole(
		org.opencps.dossiermgt.service.persistence.MenuRolePK menuRolePK) {
		return _menuRoleLocalService.fetchMenuRole(menuRolePK);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _menuRoleLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.MenuRole> getByRoles(
		long[] roleIds) {
		return _menuRoleLocalService.getByRoles(roleIds);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _menuRoleLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the menu role with the primary key.
	*
	* @param menuRolePK the primary key of the menu role
	* @return the menu role
	* @throws PortalException if a menu role with the primary key could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.MenuRole getMenuRole(
		org.opencps.dossiermgt.service.persistence.MenuRolePK menuRolePK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _menuRoleLocalService.getMenuRole(menuRolePK);
	}

	/**
	* Returns a range of all the menu roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.MenuRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of menu roles
	* @param end the upper bound of the range of menu roles (not inclusive)
	* @return the range of menu roles
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.MenuRole> getMenuRoles(
		int start, int end) {
		return _menuRoleLocalService.getMenuRoles(start, end);
	}

	/**
	* Returns the number of menu roles.
	*
	* @return the number of menu roles
	*/
	@Override
	public int getMenuRolesCount() {
		return _menuRoleLocalService.getMenuRolesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _menuRoleLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _menuRoleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the menu role in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param menuRole the menu role
	* @return the menu role that was updated
	*/
	@Override
	public org.opencps.dossiermgt.model.MenuRole updateMenuRole(
		org.opencps.dossiermgt.model.MenuRole menuRole) {
		return _menuRoleLocalService.updateMenuRole(menuRole);
	}

	@Override
	public org.opencps.dossiermgt.model.MenuRole updateMenuRoleDB(
		long menuConfigId, long roleId) {
		return _menuRoleLocalService.updateMenuRoleDB(menuConfigId, roleId);
	}

	@Override
	public MenuRoleLocalService getWrappedService() {
		return _menuRoleLocalService;
	}

	@Override
	public void setWrappedService(MenuRoleLocalService menuRoleLocalService) {
		_menuRoleLocalService = menuRoleLocalService;
	}

	private MenuRoleLocalService _menuRoleLocalService;
}