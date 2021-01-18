package com.sm.test.persistence;

import org.springframework.data.repository.CrudRepository;

import com.sm.test.vo.Board;

public interface BoardRepository extends CrudRepository<Board, Long>{

}
