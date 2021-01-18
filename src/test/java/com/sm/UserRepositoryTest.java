package com.sm;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import com.querydsl.core.BooleanBuilder;
import com.sm.test.persistence.DynamicUserRepository;
import com.sm.test.persistence.UserRepository;
import com.sm.test.vo.QUser;
import com.sm.test.vo.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private DynamicUserRepository dynamicUserRepo;
//	@Test
//	public void testInsertUser() {
//		User user = new User();
//		user.setAge(27);
//		user.setId("dfdo333");
//		user.setName("변성재");
//		
//		userRepository.save(user);
//	}
//	
//	@Test
//	public void testGetUser() {
//		User user = userRepository.findById(1L).get();
//		System.out.println(user.getName()+"----------");
//	}
//	
//	@Test
//	public void testUpdateUser() {
//		User user = userRepository.findById(1L).get();
//		
//		System.out.println("--------"+user.getName());
//		user.setName("관리자");
//		System.out.println("--------"+user.getName());
//		userRepository.save(user);
//	}

//	@Test
//	public void testDeleteUser() {
//		userRepository.deleteById(3L);
//	}

//	@Test
//	public void testGetAllByName() {
//		Pageable paging = PageRequest.of(0, 1);
//		Page<User> pageInfo = userRepository.findByName("변성재",paging);
//		List<User> list = pageInfo.getContent();
//		System.out.println(pageInfo.getNumber());
//		for (User user : list) {
//			System.out.println(user.getName());
//		}
//	}

//	@Test
//	public void testAnnotation() {
//		List<User> list = userRepository.queryAnnotation("변성재");
//		for (User user : list) {
//			System.out.println(user.getName());
//		}
//	}

//	@Test
//	public void testAnnotation2() {
//		List<Object[]> list = userRepository.queryAnnotation2("변성재");
//		for (Object[] user : list) {
//			System.out.println(Arrays.toString(user));
//		}
//	}

//	@Test
//	public void testDynamic() {
//		String name = "변성재";
//		BooleanBuilder builder = new BooleanBuilder();
//
//		QUser quser = QUser.user;
//
//		if (1 > 0) {
//			builder.and(quser.name.like("%" + name + "%"));
//		} else {
//
//		}
//
//		Pageable paging = PageRequest.of(0, 2);
//		Page<User> users = dynamicUserRepo.findAll(builder, paging);
//		for (User user : users) {
//			System.out.println("------->"+user.toString());
//		}
//	}
}
