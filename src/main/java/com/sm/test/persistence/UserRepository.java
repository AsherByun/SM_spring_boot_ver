package com.sm.test.persistence;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.*;
import com.sm.test.vo.User;

public interface UserRepository extends CrudRepository<User, String> {
//	List<User> findByName(String name);
//	List<User> findByNameContaining(String name,Pageable paging);
//	Page<User> findByName(String name,Pageable paging);
//	
//	@Query(value = "select * from user where name = :name",nativeQuery=true)
//	List<User> queryAnnotation(@Param("name") String name);
//	
//	@Query(value = "select name, age from user where name = :name",nativeQuery=true)
//	List<Object[]> queryAnnotation2(@Param("name") String name);
	
	
}
