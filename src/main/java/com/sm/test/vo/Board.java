package com.sm.test.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString(exclude = "user")
public class Board {
	@Id @GeneratedValue
	private Long seq;
	private String content;
	private String title;
	
	@ManyToOne
	@JoinColumn(name = "id",nullable = false)
	private User user;
}
