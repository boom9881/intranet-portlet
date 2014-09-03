/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.shuntian.portlet.intranet.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.shuntian.portlet.intranet.model.basic_information;
import com.shuntian.portlet.intranet.service.basic_informationLocalService;
import com.shuntian.portlet.intranet.service.persistence.SatffFinder;
import com.shuntian.portlet.intranet.service.persistence.SatffPersistence;
import com.shuntian.portlet.intranet.service.persistence.basic_informationPersistence;
import com.shuntian.portlet.intranet.service.persistence.educationPersistence;
import com.shuntian.portlet.intranet.service.persistence.ext_informationPersistence;
import com.shuntian.portlet.intranet.service.persistence.familyPersistence;
import com.shuntian.portlet.intranet.service.persistence.workPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the basic_information local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.shuntian.portlet.intranet.service.impl.basic_informationLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.shuntian.portlet.intranet.service.impl.basic_informationLocalServiceImpl
 * @see com.shuntian.portlet.intranet.service.basic_informationLocalServiceUtil
 * @generated
 */
public abstract class basic_informationLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements basic_informationLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.shuntian.portlet.intranet.service.basic_informationLocalServiceUtil} to access the basic_information local service.
	 */

	/**
	 * Adds the basic_information to the database. Also notifies the appropriate model listeners.
	 *
	 * @param basic_information the basic_information
	 * @return the basic_information that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public basic_information addbasic_information(
		basic_information basic_information) throws SystemException {
		basic_information.setNew(true);

		return basic_informationPersistence.update(basic_information);
	}

	/**
	 * Creates a new basic_information with the primary key. Does not add the basic_information to the database.
	 *
	 * @param staffId the primary key for the new basic_information
	 * @return the new basic_information
	 */
	@Override
	public basic_information createbasic_information(long staffId) {
		return basic_informationPersistence.create(staffId);
	}

	/**
	 * Deletes the basic_information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param staffId the primary key of the basic_information
	 * @return the basic_information that was removed
	 * @throws PortalException if a basic_information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public basic_information deletebasic_information(long staffId)
		throws PortalException, SystemException {
		return basic_informationPersistence.remove(staffId);
	}

	/**
	 * Deletes the basic_information from the database. Also notifies the appropriate model listeners.
	 *
	 * @param basic_information the basic_information
	 * @return the basic_information that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public basic_information deletebasic_information(
		basic_information basic_information) throws SystemException {
		return basic_informationPersistence.remove(basic_information);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(basic_information.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return basic_informationPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.basic_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return basic_informationPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.basic_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return basic_informationPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return basic_informationPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return basic_informationPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public basic_information fetchbasic_information(long staffId)
		throws SystemException {
		return basic_informationPersistence.fetchByPrimaryKey(staffId);
	}

	/**
	 * Returns the basic_information with the matching UUID and company.
	 *
	 * @param uuid the basic_information's UUID
	 * @param  companyId the primary key of the company
	 * @return the matching basic_information, or <code>null</code> if a matching basic_information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information fetchbasic_informationByUuidAndCompanyId(
		String uuid, long companyId) throws SystemException {
		return basic_informationPersistence.fetchByUuid_C_First(uuid,
			companyId, null);
	}

	/**
	 * Returns the basic_information with the primary key.
	 *
	 * @param staffId the primary key of the basic_information
	 * @return the basic_information
	 * @throws PortalException if a basic_information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information getbasic_information(long staffId)
		throws PortalException, SystemException {
		return basic_informationPersistence.findByPrimaryKey(staffId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return basic_informationPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns the basic_information with the matching UUID and company.
	 *
	 * @param uuid the basic_information's UUID
	 * @param  companyId the primary key of the company
	 * @return the matching basic_information
	 * @throws PortalException if a matching basic_information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information getbasic_informationByUuidAndCompanyId(
		String uuid, long companyId) throws PortalException, SystemException {
		return basic_informationPersistence.findByUuid_C_First(uuid, companyId,
			null);
	}

	/**
	 * Returns a range of all the basic_informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.basic_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of basic_informations
	 * @param end the upper bound of the range of basic_informations (not inclusive)
	 * @return the range of basic_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<basic_information> getbasic_informations(int start, int end)
		throws SystemException {
		return basic_informationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of basic_informations.
	 *
	 * @return the number of basic_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getbasic_informationsCount() throws SystemException {
		return basic_informationPersistence.countAll();
	}

	/**
	 * Updates the basic_information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param basic_information the basic_information
	 * @return the basic_information that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public basic_information updatebasic_information(
		basic_information basic_information) throws SystemException {
		return basic_informationPersistence.update(basic_information);
	}

	/**
	 * Returns the basic_information local service.
	 *
	 * @return the basic_information local service
	 */
	public com.shuntian.portlet.intranet.service.basic_informationLocalService getbasic_informationLocalService() {
		return basic_informationLocalService;
	}

	/**
	 * Sets the basic_information local service.
	 *
	 * @param basic_informationLocalService the basic_information local service
	 */
	public void setbasic_informationLocalService(
		com.shuntian.portlet.intranet.service.basic_informationLocalService basic_informationLocalService) {
		this.basic_informationLocalService = basic_informationLocalService;
	}

	/**
	 * Returns the basic_information persistence.
	 *
	 * @return the basic_information persistence
	 */
	public basic_informationPersistence getbasic_informationPersistence() {
		return basic_informationPersistence;
	}

	/**
	 * Sets the basic_information persistence.
	 *
	 * @param basic_informationPersistence the basic_information persistence
	 */
	public void setbasic_informationPersistence(
		basic_informationPersistence basic_informationPersistence) {
		this.basic_informationPersistence = basic_informationPersistence;
	}

	/**
	 * Returns the education local service.
	 *
	 * @return the education local service
	 */
	public com.shuntian.portlet.intranet.service.educationLocalService geteducationLocalService() {
		return educationLocalService;
	}

	/**
	 * Sets the education local service.
	 *
	 * @param educationLocalService the education local service
	 */
	public void seteducationLocalService(
		com.shuntian.portlet.intranet.service.educationLocalService educationLocalService) {
		this.educationLocalService = educationLocalService;
	}

	/**
	 * Returns the education persistence.
	 *
	 * @return the education persistence
	 */
	public educationPersistence geteducationPersistence() {
		return educationPersistence;
	}

	/**
	 * Sets the education persistence.
	 *
	 * @param educationPersistence the education persistence
	 */
	public void seteducationPersistence(
		educationPersistence educationPersistence) {
		this.educationPersistence = educationPersistence;
	}

	/**
	 * Returns the ext_information local service.
	 *
	 * @return the ext_information local service
	 */
	public com.shuntian.portlet.intranet.service.ext_informationLocalService getext_informationLocalService() {
		return ext_informationLocalService;
	}

	/**
	 * Sets the ext_information local service.
	 *
	 * @param ext_informationLocalService the ext_information local service
	 */
	public void setext_informationLocalService(
		com.shuntian.portlet.intranet.service.ext_informationLocalService ext_informationLocalService) {
		this.ext_informationLocalService = ext_informationLocalService;
	}

	/**
	 * Returns the ext_information persistence.
	 *
	 * @return the ext_information persistence
	 */
	public ext_informationPersistence getext_informationPersistence() {
		return ext_informationPersistence;
	}

	/**
	 * Sets the ext_information persistence.
	 *
	 * @param ext_informationPersistence the ext_information persistence
	 */
	public void setext_informationPersistence(
		ext_informationPersistence ext_informationPersistence) {
		this.ext_informationPersistence = ext_informationPersistence;
	}

	/**
	 * Returns the family local service.
	 *
	 * @return the family local service
	 */
	public com.shuntian.portlet.intranet.service.familyLocalService getfamilyLocalService() {
		return familyLocalService;
	}

	/**
	 * Sets the family local service.
	 *
	 * @param familyLocalService the family local service
	 */
	public void setfamilyLocalService(
		com.shuntian.portlet.intranet.service.familyLocalService familyLocalService) {
		this.familyLocalService = familyLocalService;
	}

	/**
	 * Returns the family persistence.
	 *
	 * @return the family persistence
	 */
	public familyPersistence getfamilyPersistence() {
		return familyPersistence;
	}

	/**
	 * Sets the family persistence.
	 *
	 * @param familyPersistence the family persistence
	 */
	public void setfamilyPersistence(familyPersistence familyPersistence) {
		this.familyPersistence = familyPersistence;
	}

	/**
	 * Returns the satff local service.
	 *
	 * @return the satff local service
	 */
	public com.shuntian.portlet.intranet.service.SatffLocalService getSatffLocalService() {
		return satffLocalService;
	}

	/**
	 * Sets the satff local service.
	 *
	 * @param satffLocalService the satff local service
	 */
	public void setSatffLocalService(
		com.shuntian.portlet.intranet.service.SatffLocalService satffLocalService) {
		this.satffLocalService = satffLocalService;
	}

	/**
	 * Returns the satff remote service.
	 *
	 * @return the satff remote service
	 */
	public com.shuntian.portlet.intranet.service.SatffService getSatffService() {
		return satffService;
	}

	/**
	 * Sets the satff remote service.
	 *
	 * @param satffService the satff remote service
	 */
	public void setSatffService(
		com.shuntian.portlet.intranet.service.SatffService satffService) {
		this.satffService = satffService;
	}

	/**
	 * Returns the satff persistence.
	 *
	 * @return the satff persistence
	 */
	public SatffPersistence getSatffPersistence() {
		return satffPersistence;
	}

	/**
	 * Sets the satff persistence.
	 *
	 * @param satffPersistence the satff persistence
	 */
	public void setSatffPersistence(SatffPersistence satffPersistence) {
		this.satffPersistence = satffPersistence;
	}

	/**
	 * Returns the satff finder.
	 *
	 * @return the satff finder
	 */
	public SatffFinder getSatffFinder() {
		return satffFinder;
	}

	/**
	 * Sets the satff finder.
	 *
	 * @param satffFinder the satff finder
	 */
	public void setSatffFinder(SatffFinder satffFinder) {
		this.satffFinder = satffFinder;
	}

	/**
	 * Returns the work local service.
	 *
	 * @return the work local service
	 */
	public com.shuntian.portlet.intranet.service.workLocalService getworkLocalService() {
		return workLocalService;
	}

	/**
	 * Sets the work local service.
	 *
	 * @param workLocalService the work local service
	 */
	public void setworkLocalService(
		com.shuntian.portlet.intranet.service.workLocalService workLocalService) {
		this.workLocalService = workLocalService;
	}

	/**
	 * Returns the work persistence.
	 *
	 * @return the work persistence
	 */
	public workPersistence getworkPersistence() {
		return workPersistence;
	}

	/**
	 * Sets the work persistence.
	 *
	 * @param workPersistence the work persistence
	 */
	public void setworkPersistence(workPersistence workPersistence) {
		this.workPersistence = workPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.shuntian.portlet.intranet.model.basic_information",
			basic_informationLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.shuntian.portlet.intranet.model.basic_information");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return basic_information.class;
	}

	protected String getModelClassName() {
		return basic_information.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = basic_informationPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.shuntian.portlet.intranet.service.basic_informationLocalService.class)
	protected com.shuntian.portlet.intranet.service.basic_informationLocalService basic_informationLocalService;
	@BeanReference(type = basic_informationPersistence.class)
	protected basic_informationPersistence basic_informationPersistence;
	@BeanReference(type = com.shuntian.portlet.intranet.service.educationLocalService.class)
	protected com.shuntian.portlet.intranet.service.educationLocalService educationLocalService;
	@BeanReference(type = educationPersistence.class)
	protected educationPersistence educationPersistence;
	@BeanReference(type = com.shuntian.portlet.intranet.service.ext_informationLocalService.class)
	protected com.shuntian.portlet.intranet.service.ext_informationLocalService ext_informationLocalService;
	@BeanReference(type = ext_informationPersistence.class)
	protected ext_informationPersistence ext_informationPersistence;
	@BeanReference(type = com.shuntian.portlet.intranet.service.familyLocalService.class)
	protected com.shuntian.portlet.intranet.service.familyLocalService familyLocalService;
	@BeanReference(type = familyPersistence.class)
	protected familyPersistence familyPersistence;
	@BeanReference(type = com.shuntian.portlet.intranet.service.SatffLocalService.class)
	protected com.shuntian.portlet.intranet.service.SatffLocalService satffLocalService;
	@BeanReference(type = com.shuntian.portlet.intranet.service.SatffService.class)
	protected com.shuntian.portlet.intranet.service.SatffService satffService;
	@BeanReference(type = SatffPersistence.class)
	protected SatffPersistence satffPersistence;
	@BeanReference(type = SatffFinder.class)
	protected SatffFinder satffFinder;
	@BeanReference(type = com.shuntian.portlet.intranet.service.workLocalService.class)
	protected com.shuntian.portlet.intranet.service.workLocalService workLocalService;
	@BeanReference(type = workPersistence.class)
	protected workPersistence workPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private basic_informationLocalServiceClpInvoker _clpInvoker = new basic_informationLocalServiceClpInvoker();
}