package com.example.storeonline.repository;

import org.aspectj.apache.bcel.classfile.Module.Uses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.storeonline.entity.*;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

}
