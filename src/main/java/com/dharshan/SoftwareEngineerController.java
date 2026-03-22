package com.dharshan;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineeringService softwareEngineeringService;

    public SoftwareEngineerController(SoftwareEngineeringService softwareEngineeringService) {
        this.softwareEngineeringService = softwareEngineeringService;
    }

    @GetMapping

    public List<SoftwareEngineering> getEngineers() {
        return softwareEngineeringService.getAllSoftwareEngineerings();

    }
    @PostMapping
    public void addNewSoftwareEngineering(@RequestBody SoftwareEngineering softwareEngineering) {
        SoftwareEngineeringService.insertSoftwareEngineering(softwareEngineering);
    }
}
