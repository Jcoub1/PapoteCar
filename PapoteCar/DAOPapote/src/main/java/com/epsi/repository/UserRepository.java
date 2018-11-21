package com.epsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epsi.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

}
