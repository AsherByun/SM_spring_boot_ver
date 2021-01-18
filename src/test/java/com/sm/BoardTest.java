package com.sm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sm.test.persistence.BoardRepository;
import com.sm.test.persistence.UserRepository;
import com.sm.test.vo.Board;
import com.sm.test.vo.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTest {
	@Autowired
	private BoardRepository boardRepository;
	@Autowired
	private UserRepository userRepository;

	@Test
	public void testing1() {
		User user1 = new User();
		user1.setAge(27);
		user1.setId("dfdo333");
		user1.setName("관리자");
		userRepository.save(user1);

		User user2 = new User();
		user2.setAge(27);
		user2.setId("tjdwo425");
		user2.setName("변성재");
		userRepository.save(user2);

		for (int i = 0; i < 3; i++) {
			Board board = new Board();
			board.setUser(user1);
			board.setContent("asdf  "+user1.getName()+i);
			board.setTitle("title"+i);
			boardRepository.save(board);
		}
		for (int i = 0; i < 3; i++) {
			Board board = new Board();
			board.setUser(user2);
			board.setContent("asdf  "+user2.getName()+i);
			board.setTitle("title"+i);
			boardRepository.save(board);
		}
		User user = userRepository.findById("dfdo333").get();
		for (Board board : user.getBoard()) {
			System.out.println(board.getContent());
			System.out.println("-------------");
		}
	}
	
	
}
