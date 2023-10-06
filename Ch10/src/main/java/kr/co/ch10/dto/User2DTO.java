package kr.co.ch10.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User2DTO {

	private String id;
	private String name;
	private String hp;
	private int age;
	
}
