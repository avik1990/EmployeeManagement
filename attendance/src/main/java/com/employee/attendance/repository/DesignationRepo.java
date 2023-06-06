package com.employee.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.attendance.entity.Designation;

@Repository
public interface DesignationRepo extends JpaRepository<Designation, Long>{

}
