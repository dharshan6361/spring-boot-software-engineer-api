package com.dharshan;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineeringService {

    private static SoftwareEngineeringRepository softwareEngineeringRepository = null;

    public SoftwareEngineeringService(SoftwareEngineeringRepository softwareEngineeringRepository) {
        SoftwareEngineeringService.softwareEngineeringRepository = softwareEngineeringRepository;
    }

    public static void insertSoftwareEngineering(SoftwareEngineering softwareEngineering) {
        softwareEngineeringRepository.save(softwareEngineering);
    }

    public List<SoftwareEngineering> getAllSoftwareEngineerings() {
        return softwareEngineeringRepository.findAll();

    }
}
