package com.sm.test.vo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class User {
	@Id
	@Column(unique = true)
	private String id;
	private int age;
	private String name;
	private String role;
	
	@OneToMany(mappedBy = "user",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Board> board;
}
