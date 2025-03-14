package com.java.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.web.Model.BuildingDTO;
import com.java.web.repository.BuildingRepository;
import com.java.web.repository.entity.BuildingEntity;
import com.java.web.service.BuildingService;
@Service
public class BuildingServiceImpl implements BuildingService{
	@Autowired
private BuildingRepository buildingRepository;
	@Override
	public List<BuildingDTO> findAll(List<String> names) {
	    List<BuildingEntity> buildingEntities = buildingRepository.findAll(names);
	    List<BuildingDTO> result = new ArrayList<>();

	    for (BuildingEntity item : buildingEntities) {
	        BuildingDTO building = new BuildingDTO();
	        building.setName(item.getName());
	        building.setLocation(item.getStreet() + " " + item.getWard());
	        building.setNumberOfBasement(item.getNumberOfBasement());
	        result.add(building);
	    }
	    return result;
	}


}
