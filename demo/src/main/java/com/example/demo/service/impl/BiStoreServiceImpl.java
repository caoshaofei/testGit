/**
 * 
 */
package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.BiStore;
import com.example.demo.repository.api.BiStoreRepository;
import com.example.demo.service.api.BiStoreService;
/**
 * @author user
 *
 */
@Service
public class BiStoreServiceImpl implements BiStoreService{
	
	@Autowired
	public BiStoreRepository repo;
	
	@Autowired
	private EntityManager entityManager;

	/*
	 * 查询门店-模糊搜索
	 */
	@Override
	public List<BiStore> showStore(String str) {
		List<BiStore> store = repo.findAll();
		return store;
	}
	
	/* 
	 * 获取门店列表
	 */
	@Override
	public List<BiStore> getStoreList() {
		List<BiStore> store = repo.findAll();
		return store;
	}

	/** 
	* 获取repo 
	* @return repo repo 
	*/
	
	public BiStoreRepository getRepo() {
		return repo;
	}

	/** 
	* 设置repo 
	* @param repo repo 
	*/
	
	public void setRepo(BiStoreRepository repo) {
		this.repo = repo;
	}

}
