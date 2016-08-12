package com.hcoe.weather.service.impl;

import com.hcoe.weather.dao.KathmanduDAO;
import com.hcoe.weather.entity.Kathmandu;
import com.hcoe.weather.service.KathmanduService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="KathmanduService")
public class KathmanduServiceImpl implements KathmanduService{

    @Autowired
    private KathmanduDAO kathmanduDAO;
    
     public void setCdao(KathmanduDAO weatherDAO) {
        this.kathmanduDAO = kathmanduDAO;
    }
    
    @Override
    public void insert(Kathmandu w) {
    }

    @Override
    public void display(Kathmandu w) {
    }

    @Override
    public List<Kathmandu> getAll() {
        return kathmanduDAO.getAll();
    }

    
    @Override
    public List<Kathmandu> getTen() {
        return kathmanduDAO.getTen();
    }

    @Override
    public List<Kathmandu> getEleven() {
        return kathmanduDAO.getEleven();
    }

    @Override
    public List<Kathmandu> getTwelve() {
        return kathmanduDAO.getTwelve();
    }

    @Override
    public List<Kathmandu> getThirteen() {
        return kathmanduDAO.getThirteen();
    }
    @Override
    public List<Kathmandu> getCurrent() {
        return kathmanduDAO.getCurrent();
    }
    
    
    @Override
    public Kathmandu getById(int id) {
        return kathmanduDAO.getById(id);
    }

    
}
