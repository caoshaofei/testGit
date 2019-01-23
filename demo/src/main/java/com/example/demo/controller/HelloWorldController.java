package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.dto.BiStoreDto;
import com.example.demo.entity.BiStore;
import com.example.demo.entityDto.User;
import com.example.demo.service.api.BiStoreService;
@RestController
public class HelloWorldController {
	
	@Autowired
	public BiStoreService biStoreService;
	
	@RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
	
	@RequestMapping("/getUser")
    public User getUser() {
		User user=new User();
    	user.setName("1");
    	user.setPassWord("2");
    	return user;
    }
	
	@RequestMapping("/getStore")
    public List<BiStoreDto> getStore() {
		List<BiStoreDto> list = new ArrayList<>();
//		List<BiStore> store = biStoreService.getStoreList();
		List<BiStore> store = biStoreService.showStore("珠海吉大店");
		for (BiStore biStore : store) {
			BiStoreDto b = new BiStoreDto();
			b.setCode(biStore.getCode());
			b.setName(biStore.getName());
			list.add(b);
		}
    	return list;
    }
}
