package com.epsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epsi.model.EvaluationModel;

@Repository
public interface EvaluationRepository extends JpaRepository<EvaluationModel, Long> {

}