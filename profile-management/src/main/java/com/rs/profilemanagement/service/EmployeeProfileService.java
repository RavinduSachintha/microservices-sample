package com.rs.profilemanagement.service;

import com.rs.profilemanagement.domain.EmployeeProfile;
import java.util.List;

public interface EmployeeProfileService {
    void addEmployeeProfile(EmployeeProfile profile);
    List <EmployeeProfile> getEmployeeProfiles();
}
