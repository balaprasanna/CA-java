package iss.precision.laps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import iss.precision.laps.models.leaveapplication;

public interface LeaveApplicationRepository extends JpaRepository<leaveapplication,String> {

}