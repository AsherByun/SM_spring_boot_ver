package com.sm.test.persistence;

import org.springframework.data.repository.CrudRepository;

import com.sm.test.vo.Board;
import java.util.*;
public interface BoardRepository extends CrudRepository<Board, Long>{
	List<Board> findAll();
}
