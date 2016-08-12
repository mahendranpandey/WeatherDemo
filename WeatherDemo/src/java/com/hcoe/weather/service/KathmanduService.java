package com.hcoe.weather.service;

import com.hcoe.weather.entity.Kathmandu;
import java.util.List;

public interface KathmanduService {
    
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
