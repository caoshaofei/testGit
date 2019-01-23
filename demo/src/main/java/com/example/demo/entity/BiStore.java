/**
 * 
 */
package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 门店表
 *
 */
@Entity
@Table(name = "sy_t_bd_store")
public class BiStore extends GBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8486476890691528092L;

	/**
	 * 主键
	 */
	@GeneratedValue
	@Id
	@Column(name = "id",length = 10)
	private Integer id;
	
	/**
	 * 编码
	 */
	@Column(name = "code",length = 100)
	private String code;
	
	/**
	 * 名称
	 */
	@Column(name = "name",length = 100)
	private String name;
	
	/**
	 * 简称
	 */
	@Column(name = "short_name",length = 100)
	private String shortName;
	
	/**
	 * 门店子类型
	 */
	@Column(name = "sub_type_name",length = 100)
	private String subTypeName;

	/** 
	* 获取id 
	* @return id
	*/
	
	public Integer getId() {
		return id;
	}

	/** 
	* 设置id 
	* @param id
	*/
	
	public void setId(Integer id) {
		this.id = id;
	}

	/** 
	* 获取编码 
	* @return code
	*/
	
	public String getCode() {
		return code;
	}

	/** 
	* 设置编码 
	* @param code
	*/
	
	public void setCode(String code) {
		this.code = code;
	}

	/** 
	* 获取名称 
	* @return name 
	*/
	
	public String getName() {
		return name;
	}

	/** 
	* 设置名称 
	* @param name 
	*/
	
	public void setName(String name) {
		this.name = name;
	}

	/** 
	* 获取简称 
	* @return shortName 
	*/
	
	public String getShortName() {
		return shortName;
	}

	/** 
	* 设置简称 
	* @param shortName 
	*/
	
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/** 
	* 获取门店子类型
	* @return subTypeName
	*/
	
	public String getSubTypeName() {
		return subTypeName;
	}

	/** 
	* 设置门店子类型 
	* @param subTypeName 
	*/
	
	public void setSubTypeName(String subTypeName) {
		this.subTypeName = subTypeName;
	}
	
}
