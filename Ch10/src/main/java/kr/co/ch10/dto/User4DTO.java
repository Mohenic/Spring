package kr.co.ch10.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User4DTO {

	private String name;
	private String gender;
	private int age;
	private String addr;
	
}
