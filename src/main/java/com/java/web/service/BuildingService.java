package com.java.web.service;

import java.util.List;

import com.java.web.Model.BuildingDTO;

public interface BuildingService {
	List<BuildingDTO> findAll(List<String> name);

}
