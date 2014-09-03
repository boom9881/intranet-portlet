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

package com.shuntian.portlet.intranet.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.shuntian.portlet.intranet.model.ext_information;

import java.util.List;

/**
 * The persistence utility for the ext_information service. This utility wraps {@link ext_informationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ext_informationPersistence
 * @see ext_informationPersistenceImpl
 * @generated
 */
public class ext_informationUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(ext_information ext_information) {
		getPersistence().clearCache(ext_information);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ext_information> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ext_information> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ext_information> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ext_information update(ext_information ext_information)
		throws SystemException {
		return getPersistence().update(ext_information);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ext_information update(ext_information ext_information,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(ext_information, serviceContext);
	}

	/**
	* Returns all the ext_informations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching ext_informations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.ext_information> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the ext_informations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ext_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of ext_informations
	* @param end the upper bound of the range of ext_informations (not inclusive)
	* @return the range of matching ext_informations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.ext_information> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the ext_informations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ext_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of ext_informations
	* @param end the upper bound of the range of ext_informations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ext_informations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.ext_information> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first ext_information in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext_information
	* @throws com.shuntian.portlet.intranet.NoSuchext_informationException if a matching ext_information could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchext_informationException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first ext_information in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext_information, or <code>null</code> if a matching ext_information could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last ext_information in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext_information
	* @throws com.shuntian.portlet.intranet.NoSuchext_informationException if a matching ext_information could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchext_informationException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last ext_information in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext_information, or <code>null</code> if a matching ext_information could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the ext_informations before and after the current ext_information in the ordered set where uuid = &#63;.
	*
	* @param extId the primary key of the current ext_information
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext_information
	* @throws com.shuntian.portlet.intranet.NoSuchext_informationException if a ext_information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information[] findByUuid_PrevAndNext(
		long extId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchext_informationException {
		return getPersistence()
				   .findByUuid_PrevAndNext(extId, uuid, orderByComparator);
	}

	/**
	* Removes all the ext_informations where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of ext_informations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching ext_informations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns all the ext_informations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching ext_informations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.ext_information> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the ext_informations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ext_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of ext_informations
	* @param end the upper bound of the range of ext_informations (not inclusive)
	* @return the range of matching ext_informations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.ext_information> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the ext_informations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ext_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of ext_informations
	* @param end the upper bound of the range of ext_informations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ext_informations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.ext_information> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first ext_information in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext_information
	* @throws com.shuntian.portlet.intranet.NoSuchext_informationException if a matching ext_information could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchext_informationException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first ext_information in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext_information, or <code>null</code> if a matching ext_information could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last ext_information in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext_information
	* @throws com.shuntian.portlet.intranet.NoSuchext_informationException if a matching ext_information could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchext_informationException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last ext_information in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext_information, or <code>null</code> if a matching ext_information could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the ext_informations before and after the current ext_information in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param extId the primary key of the current ext_information
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext_information
	* @throws com.shuntian.portlet.intranet.NoSuchext_informationException if a ext_information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information[] findByUuid_C_PrevAndNext(
		long extId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchext_informationException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(extId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the ext_informations where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of ext_informations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching ext_informations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the ext_information in the entity cache if it is enabled.
	*
	* @param ext_information the ext_information
	*/
	public static void cacheResult(
		com.shuntian.portlet.intranet.model.ext_information ext_information) {
		getPersistence().cacheResult(ext_information);
	}

	/**
	* Caches the ext_informations in the entity cache if it is enabled.
	*
	* @param ext_informations the ext_informations
	*/
	public static void cacheResult(
		java.util.List<com.shuntian.portlet.intranet.model.ext_information> ext_informations) {
		getPersistence().cacheResult(ext_informations);
	}

	/**
	* Creates a new ext_information with the primary key. Does not add the ext_information to the database.
	*
	* @param extId the primary key for the new ext_information
	* @return the new ext_information
	*/
	public static com.shuntian.portlet.intranet.model.ext_information create(
		long extId) {
		return getPersistence().create(extId);
	}

	/**
	* Removes the ext_information with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extId the primary key of the ext_information
	* @return the ext_information that was removed
	* @throws com.shuntian.portlet.intranet.NoSuchext_informationException if a ext_information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information remove(
		long extId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchext_informationException {
		return getPersistence().remove(extId);
	}

	public static com.shuntian.portlet.intranet.model.ext_information updateImpl(
		com.shuntian.portlet.intranet.model.ext_information ext_information)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(ext_information);
	}

	/**
	* Returns the ext_information with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchext_informationException} if it could not be found.
	*
	* @param extId the primary key of the ext_information
	* @return the ext_information
	* @throws com.shuntian.portlet.intranet.NoSuchext_informationException if a ext_information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information findByPrimaryKey(
		long extId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchext_informationException {
		return getPersistence().findByPrimaryKey(extId);
	}

	/**
	* Returns the ext_information with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param extId the primary key of the ext_information
	* @return the ext_information, or <code>null</code> if a ext_information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.ext_information fetchByPrimaryKey(
		long extId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(extId);
	}

	/**
	* Returns all the ext_informations.
	*
	* @return the ext_informations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.ext_information> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ext_informations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ext_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext_informations
	* @param end the upper bound of the range of ext_informations (not inclusive)
	* @return the range of ext_informations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.ext_information> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ext_informations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ext_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext_informations
	* @param end the upper bound of the range of ext_informations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ext_informations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.ext_information> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the ext_informations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ext_informations.
	*
	* @return the number of ext_informations
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ext_informationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ext_informationPersistence)PortletBeanLocatorUtil.locate(com.shuntian.portlet.intranet.service.ClpSerializer.getServletContextName(),
					ext_informationPersistence.class.getName());

			ReferenceRegistry.registerReference(ext_informationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ext_informationPersistence persistence) {
	}

	private static ext_informationPersistence _persistence;
}