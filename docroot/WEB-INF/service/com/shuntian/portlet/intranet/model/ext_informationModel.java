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

package com.shuntian.portlet.intranet.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedModel;
import com.liferay.portal.model.TrashedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.trash.model.TrashEntry;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ext_information service. Represents a row in the &quot;Intranet_ext_information&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.shuntian.portlet.intranet.model.impl.ext_informationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.shuntian.portlet.intranet.model.impl.ext_informationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ext_information
 * @see com.shuntian.portlet.intranet.model.impl.ext_informationImpl
 * @see com.shuntian.portlet.intranet.model.impl.ext_informationModelImpl
 * @generated
 */
public interface ext_informationModel extends BaseModel<ext_information>,
	StagedModel, TrashedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ext_information model instance should use the {@link ext_information} interface instead.
	 */

	/**
	 * Returns the primary key of this ext_information.
	 *
	 * @return the primary key of this ext_information
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ext_information.
	 *
	 * @param primaryKey the primary key of this ext_information
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this ext_information.
	 *
	 * @return the uuid of this ext_information
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this ext_information.
	 *
	 * @param uuid the uuid of this ext_information
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the ext ID of this ext_information.
	 *
	 * @return the ext ID of this ext_information
	 */
	public long getExtId();

	/**
	 * Sets the ext ID of this ext_information.
	 *
	 * @param extId the ext ID of this ext_information
	 */
	public void setExtId(long extId);

	/**
	 * Returns the staff ID of this ext_information.
	 *
	 * @return the staff ID of this ext_information
	 */
	public long getStaffId();

	/**
	 * Sets the staff ID of this ext_information.
	 *
	 * @param staffId the staff ID of this ext_information
	 */
	public void setStaffId(long staffId);

	/**
	 * Returns the open_city of this ext_information.
	 *
	 * @return the open_city of this ext_information
	 */
	@AutoEscape
	public String getOpen_city();

	/**
	 * Sets the open_city of this ext_information.
	 *
	 * @param open_city the open_city of this ext_information
	 */
	public void setOpen_city(String open_city);

	/**
	 * Returns the bank_name of this ext_information.
	 *
	 * @return the bank_name of this ext_information
	 */
	@AutoEscape
	public String getBank_name();

	/**
	 * Sets the bank_name of this ext_information.
	 *
	 * @param bank_name the bank_name of this ext_information
	 */
	public void setBank_name(String bank_name);

	/**
	 * Returns the bankid of this ext_information.
	 *
	 * @return the bankid of this ext_information
	 */
	@AutoEscape
	public String getBankid();

	/**
	 * Sets the bankid of this ext_information.
	 *
	 * @param bankid the bankid of this ext_information
	 */
	public void setBankid(String bankid);

	/**
	 * Returns the labor_contract_start of this ext_information.
	 *
	 * @return the labor_contract_start of this ext_information
	 */
	public Date getLabor_contract_start();

	/**
	 * Sets the labor_contract_start of this ext_information.
	 *
	 * @param labor_contract_start the labor_contract_start of this ext_information
	 */
	public void setLabor_contract_start(Date labor_contract_start);

	/**
	 * Returns the labor_contract_end of this ext_information.
	 *
	 * @return the labor_contract_end of this ext_information
	 */
	public Date getLabor_contract_end();

	/**
	 * Sets the labor_contract_end of this ext_information.
	 *
	 * @param labor_contract_end the labor_contract_end of this ext_information
	 */
	public void setLabor_contract_end(Date labor_contract_end);

	/**
	 * Returns the probation_period_start of this ext_information.
	 *
	 * @return the probation_period_start of this ext_information
	 */
	public Date getProbation_period_start();

	/**
	 * Sets the probation_period_start of this ext_information.
	 *
	 * @param probation_period_start the probation_period_start of this ext_information
	 */
	public void setProbation_period_start(Date probation_period_start);

	/**
	 * Returns the probation_period_end of this ext_information.
	 *
	 * @return the probation_period_end of this ext_information
	 */
	public Date getProbation_period_end();

	/**
	 * Sets the probation_period_end of this ext_information.
	 *
	 * @param probation_period_end the probation_period_end of this ext_information
	 */
	public void setProbation_period_end(Date probation_period_end);

	/**
	 * Returns the indured_location of this ext_information.
	 *
	 * @return the indured_location of this ext_information
	 */
	@AutoEscape
	public String getIndured_location();

	/**
	 * Sets the indured_location of this ext_information.
	 *
	 * @param indured_location the indured_location of this ext_information
	 */
	public void setIndured_location(String indured_location);

	/**
	 * Returns the frist_insured of this ext_information.
	 *
	 * @return the frist_insured of this ext_information
	 */
	public Date getFrist_insured();

	/**
	 * Sets the frist_insured of this ext_information.
	 *
	 * @param frist_insured the frist_insured of this ext_information
	 */
	public void setFrist_insured(Date frist_insured);

	/**
	 * Returns the is_insured of this ext_information.
	 *
	 * @return the is_insured of this ext_information
	 */
	@AutoEscape
	public String getIs_insured();

	/**
	 * Sets the is_insured of this ext_information.
	 *
	 * @param is_insured the is_insured of this ext_information
	 */
	public void setIs_insured(String is_insured);

	/**
	 * Returns the company ID of this ext_information.
	 *
	 * @return the company ID of this ext_information
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this ext_information.
	 *
	 * @param companyId the company ID of this ext_information
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the createuser of this ext_information.
	 *
	 * @return the createuser of this ext_information
	 */
	public long getCreateuser();

	/**
	 * Sets the createuser of this ext_information.
	 *
	 * @param createuser the createuser of this ext_information
	 */
	public void setCreateuser(long createuser);

	/**
	 * Returns the create date of this ext_information.
	 *
	 * @return the create date of this ext_information
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this ext_information.
	 *
	 * @param createDate the create date of this ext_information
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modifieduser of this ext_information.
	 *
	 * @return the modifieduser of this ext_information
	 */
	public long getModifieduser();

	/**
	 * Sets the modifieduser of this ext_information.
	 *
	 * @param modifieduser the modifieduser of this ext_information
	 */
	public void setModifieduser(long modifieduser);

	/**
	 * Returns the modified date of this ext_information.
	 *
	 * @return the modified date of this ext_information
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this ext_information.
	 *
	 * @param modifiedDate the modified date of this ext_information
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this ext_information.
	 *
	 * @return the status of this ext_information
	 */
	@Override
	public int getStatus();

	/**
	 * Returns the trash entry created when this ext_information was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this ext_information.
	 *
	 * @return the trash entry created when this ext_information was moved to the Recycle Bin
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TrashEntry getTrashEntry() throws PortalException, SystemException;

	/**
	 * Returns the class primary key of the trash entry for this ext_information.
	 *
	 * @return the class primary key of the trash entry for this ext_information
	 */
	@Override
	public long getTrashEntryClassPK();

	/**
	 * Returns the trash handler for this ext_information.
	 *
	 * @return the trash handler for this ext_information
	 */
	@Override
	public TrashHandler getTrashHandler();

	/**
	 * Returns <code>true</code> if this ext_information is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this ext_information is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash();

	/**
	 * Returns <code>true</code> if the parent of this ext_information is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this ext_information is in the Recycle Bin; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean isInTrashContainer();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(ext_information ext_information);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ext_information> toCacheModel();

	@Override
	public ext_information toEscapedModel();

	@Override
	public ext_information toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}