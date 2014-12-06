package iss.precision.laps.repository;

import iss.precision.laps.models.userprofile;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UserProfileRepository extends JpaRepository<userprofile, String> {

}
