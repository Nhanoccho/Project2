package com.java.web.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.java.web.repository.BuildingRepository;
import com.java.web.repository.entity.BuildingEntity;

@Repository
public class BuildingRepositoryImpl implements BuildingRepository {

    private static final String DB_URL = "jdbc:mysql://localhost:3309/estatebasic";
    private static final String USER = "root";
    private static final String PASS = "123123";

    @Override
    public List<BuildingEntity> findAll(List<String> names) {
        StringBuilder sql = new StringBuilder("SELECT * FROM building WHERE 1=1");

        List<BuildingEntity> result = new ArrayList<>();

        if (names != null && !names.isEmpty()) {
            sql.append(" AND (");
            for (int i = 0; i < names.size(); i++) {
                if (i > 0) sql.append(" OR ");
                sql.append("name LIKE ?");
            }
            sql.append(")");
        }

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql.toString())) {

            if (names != null && !names.isEmpty()) {
                for (int i = 0; i < names.size(); i++) {
                    pstmt.setString(i + 1, "%" + names.get(i) + "%");
                }
            }

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                BuildingEntity building = new BuildingEntity();
                building.setName(rs.getString("name"));
                building.setStreet(rs.getString("street"));
                building.setWard(rs.getString("ward"));
                building.setNumberOfBasement(rs.getInt("numberofbasement"));
                result.add(building);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
