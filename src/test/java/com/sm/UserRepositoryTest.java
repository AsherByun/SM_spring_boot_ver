package com.sm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sm.test.persistence.UserRepository;
import com.sm.test.vo.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
	@Autowired
	private UserRepository userRepository;
	
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
	
	@Test
	public void testDeleteUser() {
		userRepository.deleteById(3L);
	}
}
