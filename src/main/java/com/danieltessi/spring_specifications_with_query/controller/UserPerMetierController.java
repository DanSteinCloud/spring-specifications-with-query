package com.danieltessi.spring_specifications_with_query.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.danieltessi.spring_specifications_with_query.domain.User;
import com.danieltessi.spring_specifications_with_query.service.UserPerMetierService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserPerMetierController {
	
	private final UserPerMetierService userPerMetierService;
	
	public List<User> getUsermatchingCriteria(@RequestParam("ids") Long[] criterias){
		return userPerMetierService.filterUserPerMetier(criterias);
		
	}

}
