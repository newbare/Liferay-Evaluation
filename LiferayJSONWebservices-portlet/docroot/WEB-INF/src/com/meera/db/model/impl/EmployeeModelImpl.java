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

package com.meera.db.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.meera.db.model.Employee;
import com.meera.db.model.EmployeeModel;
import com.meera.db.model.EmployeeSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Employee service. Represents a row in the &quot;webservices_Employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.meera.db.model.EmployeeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeImpl}.
 * </p>
 *
 * @author E5410
 * @see EmployeeImpl
 * @see com.meera.db.model.Employee
 * @see com.meera.db.model.EmployeeModel
 * @generated
 */
@JSON(strict = true)
public class EmployeeModelImpl extends BaseModelImpl<Employee>
	implements EmployeeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a employee model instance should use the {@link com.meera.db.model.Employee} interface instead.
	 */
	public static final String TABLE_NAME = "webservices_Employee";
	public static final Object[][] TABLE_COLUMNS = {
			{ "emplyeeId", Types.BIGINT },
			{ "emplyeeName", Types.VARCHAR },
			{ "employeeDesignation", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table webservices_Employee (emplyeeId LONG not null primary key,emplyeeName VARCHAR(75) null,employeeDesignation VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table webservices_Employee";
	public static final String ORDER_BY_JPQL = " ORDER BY employee.emplyeeId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY webservices_Employee.emplyeeId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.meera.db.model.Employee"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.meera.db.model.Employee"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.meera.db.model.Employee"),
			true);
	public static long EMPLYEENAME_COLUMN_BITMASK = 1L;
	public static long EMPLYEEID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Employee toModel(EmployeeSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Employee model = new EmployeeImpl();

		model.setEmplyeeId(soapModel.getEmplyeeId());
		model.setEmplyeeName(soapModel.getEmplyeeName());
		model.setEmployeeDesignation(soapModel.getEmployeeDesignation());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Employee> toModels(EmployeeSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Employee> models = new ArrayList<Employee>(soapModels.length);

		for (EmployeeSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.meera.db.model.Employee"));

	public EmployeeModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _emplyeeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmplyeeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _emplyeeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Employee.class;
	}

	@Override
	public String getModelClassName() {
		return Employee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("emplyeeId", getEmplyeeId());
		attributes.put("emplyeeName", getEmplyeeName());
		attributes.put("employeeDesignation", getEmployeeDesignation());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long emplyeeId = (Long)attributes.get("emplyeeId");

		if (emplyeeId != null) {
			setEmplyeeId(emplyeeId);
		}

		String emplyeeName = (String)attributes.get("emplyeeName");

		if (emplyeeName != null) {
			setEmplyeeName(emplyeeName);
		}

		String employeeDesignation = (String)attributes.get(
				"employeeDesignation");

		if (employeeDesignation != null) {
			setEmployeeDesignation(employeeDesignation);
		}
	}

	@JSON
	@Override
	public long getEmplyeeId() {
		return _emplyeeId;
	}

	@Override
	public void setEmplyeeId(long emplyeeId) {
		_columnBitmask = -1L;

		_emplyeeId = emplyeeId;
	}

	@JSON
	@Override
	public String getEmplyeeName() {
		if (_emplyeeName == null) {
			return StringPool.BLANK;
		}
		else {
			return _emplyeeName;
		}
	}

	@Override
	public void setEmplyeeName(String emplyeeName) {
		_columnBitmask |= EMPLYEENAME_COLUMN_BITMASK;

		if (_originalEmplyeeName == null) {
			_originalEmplyeeName = _emplyeeName;
		}

		_emplyeeName = emplyeeName;
	}

	public String getOriginalEmplyeeName() {
		return GetterUtil.getString(_originalEmplyeeName);
	}

	@JSON
	@Override
	public String getEmployeeDesignation() {
		if (_employeeDesignation == null) {
			return StringPool.BLANK;
		}
		else {
			return _employeeDesignation;
		}
	}

	@Override
	public void setEmployeeDesignation(String employeeDesignation) {
		_employeeDesignation = employeeDesignation;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Employee.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Employee toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Employee)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setEmplyeeId(getEmplyeeId());
		employeeImpl.setEmplyeeName(getEmplyeeName());
		employeeImpl.setEmployeeDesignation(getEmployeeDesignation());

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public int compareTo(Employee employee) {
		int value = 0;

		if (getEmplyeeId() < employee.getEmplyeeId()) {
			value = -1;
		}
		else if (getEmplyeeId() > employee.getEmplyeeId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Employee)) {
			return false;
		}

		Employee employee = (Employee)obj;

		long primaryKey = employee.getPrimaryKey();

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
	public void resetOriginalValues() {
		EmployeeModelImpl employeeModelImpl = this;

		employeeModelImpl._originalEmplyeeName = employeeModelImpl._emplyeeName;

		employeeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Employee> toCacheModel() {
		EmployeeCacheModel employeeCacheModel = new EmployeeCacheModel();

		employeeCacheModel.emplyeeId = getEmplyeeId();

		employeeCacheModel.emplyeeName = getEmplyeeName();

		String emplyeeName = employeeCacheModel.emplyeeName;

		if ((emplyeeName != null) && (emplyeeName.length() == 0)) {
			employeeCacheModel.emplyeeName = null;
		}

		employeeCacheModel.employeeDesignation = getEmployeeDesignation();

		String employeeDesignation = employeeCacheModel.employeeDesignation;

		if ((employeeDesignation != null) &&
				(employeeDesignation.length() == 0)) {
			employeeCacheModel.employeeDesignation = null;
		}

		return employeeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{emplyeeId=");
		sb.append(getEmplyeeId());
		sb.append(", emplyeeName=");
		sb.append(getEmplyeeName());
		sb.append(", employeeDesignation=");
		sb.append(getEmployeeDesignation());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.meera.db.model.Employee");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>emplyeeId</column-name><column-value><![CDATA[");
		sb.append(getEmplyeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emplyeeName</column-name><column-value><![CDATA[");
		sb.append(getEmplyeeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeDesignation</column-name><column-value><![CDATA[");
		sb.append(getEmployeeDesignation());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Employee.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Employee.class
		};
	private long _emplyeeId;
	private String _emplyeeName;
	private String _originalEmplyeeName;
	private String _employeeDesignation;
	private long _columnBitmask;
	private Employee _escapedModel;
}