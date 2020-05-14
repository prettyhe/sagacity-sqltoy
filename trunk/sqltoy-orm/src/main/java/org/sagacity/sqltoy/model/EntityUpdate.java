/**
 * 
 */
package org.sagacity.sqltoy.model;

import java.io.Serializable;
import java.util.LinkedHashMap;

import javax.sql.DataSource;

/**
 * @author zhong
 *
 */
public class EntityUpdate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6476698994760985087L;

	/**
	 * 条件语句
	 */
	private String where;

	/**
	 * 参数名称
	 */
	private String[] names;

	/**
	 * 参数值
	 */
	private Object[] values;

	private DataSource dataSource;

	private LinkedHashMap<String, Object> setValues = new LinkedHashMap<String, Object>();

	public EntityUpdate set(String param, Object value) {
		setValues.put(param, value);
		return this;
	}

	public EntityUpdate where(String where) {
		this.where = where;
		return this;
	}

	public EntityUpdate names(String... names) {
		this.names = names;
		return this;
	}

	public EntityUpdate values(Object... values) {
		this.values = values;
		return this;
	}

	public EntityUpdate dataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		return this;
	}

	/**
	 * @return the where
	 */
	public String getWhere() {
		return where;
	}

	/**
	 * @return the names
	 */
	public String[] getNames() {
		return names;
	}

	/**
	 * @return the values
	 */
	public Object[] getValues() {
		return values;
	}

	/**
	 * @return the dataSource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}
}
