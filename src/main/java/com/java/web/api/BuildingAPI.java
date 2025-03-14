package com.java.web.api;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.java.web.Model.BuildingDTO;
import com.java.web.service.BuildingService;

@RestController
public class BuildingAPI {
	@Autowired
private BuildingService buildingServive;
    @PostMapping(value="/api/building/")
    public List<BuildingDTO> getBuilding(@RequestParam(value = "name",required = false) List<String> name) {
        List<BuildingDTO> result = buildingServive.findAll(name);


        return result;
    }
}
