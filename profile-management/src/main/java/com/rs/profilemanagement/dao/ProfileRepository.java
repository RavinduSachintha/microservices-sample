package com.rs.profilemanagement.dao;

import com.rs.profilemanagement.domain.EmployeeProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository <EmployeeProfile, Integer> {
}
