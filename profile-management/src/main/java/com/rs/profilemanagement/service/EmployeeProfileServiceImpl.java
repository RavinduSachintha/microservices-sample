package com.rs.profilemanagement.service;

import com.rs.profilemanagement.dao.ProfileRepository;
import com.rs.profilemanagement.domain.EmployeeProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeProfileServiceImpl implements EmployeeProfileService {
    @Autowired
    ProfileRepository repository;
    List<EmployeeProfile> employeeProfileList = new ArrayList<>();

    @Override
    public void addEmployeeProfile(EmployeeProfile profile) {
        repository.save(profile);
    }

    @Override
    public List<EmployeeProfile> getEmployeeProfiles() {
        return repository.findAll();
    }
}
