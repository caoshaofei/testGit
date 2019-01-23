package com.example.demo.entityDto;

public class User {
	/**
	 * 名字
	 */
	private String name;
	
	/**
	 * 密码
	 */
	private String passWord;

	/** 
	* 获取name 
	* @return name name 
	*/
	
	public String getName() {
		return name;
	}
	

	/** 
	* 设置name 
	* @param name name 
	*/
	
	public void setName(String name) {
		this.name = name;
	}
	

	/** 
	* 获取passWord 
	* @return passWord passWord 
	*/
	
	public String getPassWord() {
		return passWord;
	}
	

	/** 
	* 设置passWord 
	* @param passWord passWord 
	*/
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
