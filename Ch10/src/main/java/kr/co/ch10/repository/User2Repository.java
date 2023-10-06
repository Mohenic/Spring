package kr.co.ch10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.ch10.entity.User2Entity;

@Repository
public interface User2Repository extends JpaRepository<User2Entity, String>{

}
