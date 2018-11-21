package com.epsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epsi.model.CityModel;

@Repository
public interface CityRepository extends JpaRepository<CityModel, Long> {

}
