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

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.shuntian.portlet.intranet.model.ext_information;
import com.shuntian.portlet.intranet.service.ext_informationLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ext_informationActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public ext_informationActionableDynamicQuery() throws SystemException {
		setBaseLocalService(ext_informationLocalServiceUtil.getService());
		setClass(ext_information.class);

		setClassLoader(com.shuntian.portlet.intranet.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("extId");
	}
}