package com.sm.test.persistence;

import org.springframework.data.repository.CrudRepository;

import com.sm.test.vo.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
