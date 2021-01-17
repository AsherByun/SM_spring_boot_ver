package com.sm.test.vo;

import java.io.Serializable;
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
	@GeneratedValue
	private Long seq;
	private String id;
	private int age;
	private String name;
}
