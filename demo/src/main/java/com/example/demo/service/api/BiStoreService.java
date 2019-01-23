/**
 * 
 */
package com.example.demo.service.api;

import java.util.List;

import com.example.demo.entity.BiStore;

/**
 * @author user
 *
 */
public interface BiStoreService {
	
	/**
	 * 模糊搜索门店
	 * @param str
	 * @return
	 */
	public List<BiStore> showStore(String str);
	/**
	 * 获取所有门店
	 * @return
	 */
	public List<BiStore> getStoreList();
}
