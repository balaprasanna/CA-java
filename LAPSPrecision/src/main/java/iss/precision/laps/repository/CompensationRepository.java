package iss.precision.laps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import iss.precision.laps.models.compensation;
import iss.precision.laps.models.compensationprimary;;


public interface CompensationRepository extends JpaRepository<compensation, compensationprimary> {

}

