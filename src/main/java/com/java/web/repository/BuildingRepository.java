package com.java.web.repository;

import java.util.List;

import com.java.web.repository.entity.BuildingEntity;

public interface BuildingRepository {
List<BuildingEntity> findAll(List<String> name);


}
