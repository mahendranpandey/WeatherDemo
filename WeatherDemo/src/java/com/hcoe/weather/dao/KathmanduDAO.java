package com.hcoe.weather.dao;

import com.hcoe.weather.dao.impl.KathmanduDAOImpl;
import com.hcoe.weather.entity.Kathmandu;
import java.util.List;

public interface KathmanduDAO {
    
    void insert(Kathmandu w);
    void display(Kathmandu w);
     
    List<Kathmandu> getAll();
    
    List<Kathmandu> getTen();
    List<Kathmandu> getEleven();
    List<Kathmandu> getTwelve();
    List<Kathmandu> getThirteen();
    List<Kathmandu> getCurrent();    
    
    Kathmandu getById(int id);
            
            
}
