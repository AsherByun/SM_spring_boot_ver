package com.sm.test.persistence;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.sm.test.vo.User;

public interface DynamicUserRepository extends CrudRepository<User, Long>, 
QuerydslPredicateExecutor<User> {
	
}
