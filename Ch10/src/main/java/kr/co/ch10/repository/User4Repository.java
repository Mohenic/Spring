package kr.co.ch10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.ch10.entity.User4Entity;

@Repository
public interface User4Repository extends JpaRepository<User4Entity, String>{

}
