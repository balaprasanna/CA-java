package iss.precision.laps.repository;

import iss.precision.laps.models.leaveentitlement;
import iss.precision.laps.models.leaveentitlementprimary;

import org.springframework.data.jpa.repository.JpaRepository;


public interface LeaveEntitlementRepository extends JpaRepository<leaveentitlement,leaveentitlementprimary > {

}
