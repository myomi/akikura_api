package com.akikura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.akikura.dao.OwnerDao;
import com.akikura.entity.Owner;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class OwnerController {
	@Autowired
	private OwnerDao ownerDao;
	
	@GetMapping("/owners")
	public Flux<Owner> getOwners() {
		List<Owner> owners = ownerDao.selectAll();
		return Flux.fromIterable(owners);
	}
	
	@GetMapping("/owners/{id}")
	public Mono<Owner> getOwner(@PathVariable("id") long id) {
		Owner owner = ownerDao.selectById(id);
		return Mono.just(owner);
	}
}
