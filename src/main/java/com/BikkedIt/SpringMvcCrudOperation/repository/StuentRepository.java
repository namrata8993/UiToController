package com.BikkedIt.SpringMvcCrudOperation.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.BikkedIt.SpringMvcCrudOperation.model.Student;

@Repository
public interface StuentRepository extends CrudRepository<Student, Integer> {

	

}
