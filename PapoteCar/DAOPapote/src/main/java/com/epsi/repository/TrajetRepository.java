package com.epsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epsi.model.TrajetModel;

@Repository
public interface TrajetRepository extends JpaRepository<TrajetModel, Long> {

}