package iss.precision.laps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import iss.precision.laps.models.keymanagement;

public interface KeyManagementRepository extends JpaRepository<keymanagement, String> {

}

