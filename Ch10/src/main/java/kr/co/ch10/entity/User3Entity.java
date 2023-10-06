package kr.co.ch10.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "User3")
public class User3Entity {

	@Id
	private String id;
	private String name;
	private String hp;
	private int age;
	
}