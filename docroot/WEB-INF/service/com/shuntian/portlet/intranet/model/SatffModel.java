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
import com.liferay.portal.model.StagedAuditedModel;
import com.liferay.portal.model.TrashedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.trash.model.TrashEntry;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Satff service. Represents a row in the &quot;Intranet_Satff&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.shuntian.portlet.intranet.model.impl.SatffModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.shuntian.portlet.intranet.model.impl.SatffImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Satff
 * @see com.shuntian.portlet.intranet.model.impl.SatffImpl
 * @see com.shuntian.portlet.intranet.model.impl.SatffModelImpl
 * @generated
 */
public interface SatffModel extends BaseModel<Satff>, StagedAuditedModel,
	TrashedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a satff model instance should use the {@link Satff} interface instead.
	 */

	/**
	 * Returns the primary key of this satff.
	 *
	 * @return the primary key of this satff
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this satff.
	 *
	 * @param primaryKey the primary key of this satff
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this satff.
	 *
	 * @return the uuid of this satff
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this satff.
	 *
	 * @param uuid the uuid of this satff
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the ID of this satff.
	 *
	 * @return the ID of this satff
	 */
	public long getId();

	/**
	 * Sets the ID of this satff.
	 *
	 * @param id the ID of this satff
	 */
	public void setId(long id);

	/**
	 * Returns the user_id of this satff.
	 *
	 * @return the user_id of this satff
	 */
	public long getUser_id();

	/**
	 * Sets the user_id of this satff.
	 *
	 * @param user_id the user_id of this satff
	 */
	public void setUser_id(long user_id);

	/**
	 * Returns the city of this satff.
	 *
	 * @return the city of this satff
	 */
	@AutoEscape
	public String getCity();

	/**
	 * Sets the city of this satff.
	 *
	 * @param city the city of this satff
	 */
	public void setCity(String city);

	/**
	 * Returns the name of this satff.
	 *
	 * @return the name of this satff
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this satff.
	 *
	 * @param name the name of this satff
	 */
	public void setName(String name);

	/**
	 * Returns the turnover_time of this satff.
	 *
	 * @return the turnover_time of this satff
	 */
	public Date getTurnover_time();

	/**
	 * Sets the turnover_time of this satff.
	 *
	 * @param turnover_time the turnover_time of this satff
	 */
	public void setTurnover_time(Date turnover_time);

	/**
	 * Returns the entry_time of this satff.
	 *
	 * @return the entry_time of this satff
	 */
	public Date getEntry_time();

	/**
	 * Sets the entry_time of this satff.
	 *
	 * @param entry_time the entry_time of this satff
	 */
	public void setEntry_time(Date entry_time);

	/**
	 * Returns the base_pay of this satff.
	 *
	 * @return the base_pay of this satff
	 */
	public double getBase_pay();

	/**
	 * Sets the base_pay of this satff.
	 *
	 * @param base_pay the base_pay of this satff
	 */
	public void setBase_pay(double base_pay);

	/**
	 * Returns the performance_pay of this satff.
	 *
	 * @return the performance_pay of this satff
	 */
	public double getPerformance_pay();

	/**
	 * Sets the performance_pay of this satff.
	 *
	 * @param performance_pay the performance_pay of this satff
	 */
	public void setPerformance_pay(double performance_pay);

	/**
	 * Returns the wage_subtotal of this satff.
	 *
	 * @return the wage_subtotal of this satff
	 */
	public double getWage_subtotal();

	/**
	 * Sets the wage_subtotal of this satff.
	 *
	 * @param wage_subtotal the wage_subtotal of this satff
	 */
	public void setWage_subtotal(double wage_subtotal);

	/**
	 * Returns the insurance_base of this satff.
	 *
	 * @return the insurance_base of this satff
	 */
	public double getInsurance_base();

	/**
	 * Sets the insurance_base of this satff.
	 *
	 * @param insurance_base the insurance_base of this satff
	 */
	public void setInsurance_base(double insurance_base);

	/**
	 * Returns the endowment_insurance of this satff.
	 *
	 * @return the endowment_insurance of this satff
	 */
	public double getEndowment_insurance();

	/**
	 * Sets the endowment_insurance of this satff.
	 *
	 * @param endowment_insurance the endowment_insurance of this satff
	 */
	public void setEndowment_insurance(double endowment_insurance);

	/**
	 * Returns the unemployment_insurance of this satff.
	 *
	 * @return the unemployment_insurance of this satff
	 */
	public double getUnemployment_insurance();

	/**
	 * Sets the unemployment_insurance of this satff.
	 *
	 * @param unemployment_insurance the unemployment_insurance of this satff
	 */
	public void setUnemployment_insurance(double unemployment_insurance);

	/**
	 * Returns the work_injury_insurance of this satff.
	 *
	 * @return the work_injury_insurance of this satff
	 */
	public double getWork_injury_insurance();

	/**
	 * Sets the work_injury_insurance of this satff.
	 *
	 * @param work_injury_insurance the work_injury_insurance of this satff
	 */
	public void setWork_injury_insurance(double work_injury_insurance);

	/**
	 * Returns the birth_insurance of this satff.
	 *
	 * @return the birth_insurance of this satff
	 */
	public double getBirth_insurance();

	/**
	 * Sets the birth_insurance of this satff.
	 *
	 * @param birth_insurance the birth_insurance of this satff
	 */
	public void setBirth_insurance(double birth_insurance);

	/**
	 * Returns the medical_insurance of this satff.
	 *
	 * @return the medical_insurance of this satff
	 */
	public double getMedical_insurance();

	/**
	 * Sets the medical_insurance of this satff.
	 *
	 * @param medical_insurance the medical_insurance of this satff
	 */
	public void setMedical_insurance(double medical_insurance);

	/**
	 * Returns the individual_insurance of this satff.
	 *
	 * @return the individual_insurance of this satff
	 */
	public double getIndividual_insurance();

	/**
	 * Sets the individual_insurance of this satff.
	 *
	 * @param individual_insurance the individual_insurance of this satff
	 */
	public void setIndividual_insurance(double individual_insurance);

	/**
	 * Returns the housing_accumulation_fund_base of this satff.
	 *
	 * @return the housing_accumulation_fund_base of this satff
	 */
	public double getHousing_accumulation_fund_base();

	/**
	 * Sets the housing_accumulation_fund_base of this satff.
	 *
	 * @param housing_accumulation_fund_base the housing_accumulation_fund_base of this satff
	 */
	public void setHousing_accumulation_fund_base(
		double housing_accumulation_fund_base);

	/**
	 * Returns the individual_pay of this satff.
	 *
	 * @return the individual_pay of this satff
	 */
	public double getIndividual_pay();

	/**
	 * Sets the individual_pay of this satff.
	 *
	 * @param individual_pay the individual_pay of this satff
	 */
	public void setIndividual_pay(double individual_pay);

	/**
	 * Returns the amount_payable of this satff.
	 *
	 * @return the amount_payable of this satff
	 */
	public double getAmount_payable();

	/**
	 * Sets the amount_payable of this satff.
	 *
	 * @param amount_payable the amount_payable of this satff
	 */
	public void setAmount_payable(double amount_payable);

	/**
	 * Returns the people_together of this satff.
	 *
	 * @return the people_together of this satff
	 */
	public double getPeople_together();

	/**
	 * Sets the people_together of this satff.
	 *
	 * @param people_together the people_together of this satff
	 */
	public void setPeople_together(double people_together);

	/**
	 * Returns the company ID of this satff.
	 *
	 * @return the company ID of this satff
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this satff.
	 *
	 * @param companyId the company ID of this satff
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this satff.
	 *
	 * @return the user ID of this satff
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this satff.
	 *
	 * @param userId the user ID of this satff
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this satff.
	 *
	 * @return the user uuid of this satff
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this satff.
	 *
	 * @param userUuid the user uuid of this satff
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this satff.
	 *
	 * @return the user name of this satff
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this satff.
	 *
	 * @param userName the user name of this satff
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this satff.
	 *
	 * @return the create date of this satff
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this satff.
	 *
	 * @param createDate the create date of this satff
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this satff.
	 *
	 * @return the modified date of this satff
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this satff.
	 *
	 * @param modifiedDate the modified date of this satff
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this satff.
	 *
	 * @return the status of this satff
	 */
	@Override
	public int getStatus();

	/**
	 * Returns the trash entry created when this satff was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this satff.
	 *
	 * @return the trash entry created when this satff was moved to the Recycle Bin
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TrashEntry getTrashEntry() throws PortalException, SystemException;

	/**
	 * Returns the class primary key of the trash entry for this satff.
	 *
	 * @return the class primary key of the trash entry for this satff
	 */
	@Override
	public long getTrashEntryClassPK();

	/**
	 * Returns the trash handler for this satff.
	 *
	 * @return the trash handler for this satff
	 */
	@Override
	public TrashHandler getTrashHandler();

	/**
	 * Returns <code>true</code> if this satff is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this satff is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash();

	/**
	 * Returns <code>true</code> if the parent of this satff is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this satff is in the Recycle Bin; <code>false</code> otherwise
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
	public int compareTo(Satff satff);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Satff> toCacheModel();

	@Override
	public Satff toEscapedModel();

	@Override
	public Satff toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}