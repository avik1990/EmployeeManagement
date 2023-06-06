package com.employee.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.attendance.entity.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, Long>{

}
