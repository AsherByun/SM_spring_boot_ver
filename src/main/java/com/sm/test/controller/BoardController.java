package com.sm.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;
import com.sm.test.persistence.BoardRepository;
import com.sm.test.persistence.UserRepository;
import com.sm.test.vo.Board;
import com.sm.test.vo.User;

@Controller
public class BoardController {
	@Autowired
	private final BoardRepository boardRepository;
	@Autowired
	private final UserRepository userRepository;
	
	public BoardController(BoardRepository boardRepository,UserRepository userRepository) {
		this.boardRepository = boardRepository;
		this.userRepository =userRepository;
	}
	
	@GetMapping("/getBoardList")
	public String getBoardList(Model model,Board board) {
		List<Board> boardList = boardRepository.findAll();
		
		model.addAttribute("boardList",boardList);
		return "getBoardList";
	}
	@GetMapping("/getBoard")
	public String getBoard(Model model,Board board,@ModelAttribute("user") User user) {
		model.addAttribute("board", boardRepository.findById(board.getSeq()).get());
		return "getBoard";
	}
	@GetMapping("/insertBoard")
	public String insertBoardView(@ModelAttribute("user") User user) {
		return "insertBoard";
	}
	@PostMapping("/insertBoard")
	public String insertBoard(@ModelAttribute("user") User user,Board board,Model model) {
		User targetUser = userRepository.findById(board.getUser().getId()).get();
		
		board.setUser(targetUser);
		boardRepository.save(board);
		
		return "redirect:getBoardList";
	}
}
