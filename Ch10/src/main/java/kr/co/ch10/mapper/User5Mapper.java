package kr.co.ch10.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.ch10.dto.User5DTO;

@Mapper
public interface User5Mapper {

	public int insertUser5(User5DTO dto);
	public User5DTO selectUser5(String name);
	public List<User5DTO> selectUser5s();
	public int updateUser5(User5DTO dto);
	public int deleteUser5(String name);
	
}
