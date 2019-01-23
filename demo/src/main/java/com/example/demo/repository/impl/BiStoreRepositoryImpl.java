/**
 * 
 */
package com.example.demo.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.BiStore;
/**
 * @author user
 *
 */
public class BiStoreRepositoryImpl {

	@Autowired
	private EntityManager entityManager;

//	/*
//	 * 查询门店-模糊搜索
//	 */
//	public List<BiStore> showStore(String str) {
//		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//		CriteriaQuery<BiStore> criteria = builder.createQuery(BiStore.class);
//		Root<BiStore> root = criteria.from(BiStore.class);
//		List<Predicate> con = new ArrayList<>();
//		con.add(builder.like(root.get(BiStore_.BiStore_), "%" + str + "%"));
//		criteria.where(con.toArray(new Predicate[con.size()]));
//		criteria.orderBy(builder.asc(root.get(BiStore_.id)));
//		TypedQuery<BiStore> query = entityManager.createQuery(criteria);
//		List<BiStore> rtn = query.getResultList();
//		if (rtn != null && rtn.size() > 0 && rtn.get(0) != null) {
//			return rtn;
//		}
//		return new ArrayList<>();
//	}

}
