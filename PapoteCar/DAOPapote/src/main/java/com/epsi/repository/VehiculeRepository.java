package com.epsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epsi.model.VehiculeModel;

@Repository
public interface VehiculeRepository extends JpaRepository<VehiculeModel, Long> {

}