/**
 * 
 */
package com.example.demo.controller.dto;

/**
 * @author user
 * 门店信息表
 */
public class BiStoreDto {
	
	/**
	 * 编码
	 */
	private String code;
	
	/**
	 * 名称
	 */
	private String name;

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
	
	
}
