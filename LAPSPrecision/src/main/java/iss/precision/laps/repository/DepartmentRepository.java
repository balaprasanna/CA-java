package iss.precision.laps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import iss.precision.laps.models.department;

public interface DepartmentRepository extends JpaRepository<department,String> {

}
