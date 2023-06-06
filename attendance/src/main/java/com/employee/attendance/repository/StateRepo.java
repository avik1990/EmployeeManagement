package com.employee.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.attendance.entity.State;

@Repository
public interface StateRepo extends JpaRepository<State, Long>{

}
