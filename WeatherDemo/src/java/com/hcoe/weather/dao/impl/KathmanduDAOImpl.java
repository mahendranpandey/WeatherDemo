package com.hcoe.weather.dao.impl;

import com.hcoe.weather.dao.KathmanduDAO;
import com.hcoe.weather.entity.Kathmandu;
import java.time.LocalDate;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mkpan
 */
@Repository(value="kathmanduDAO")
public class KathmanduDAOImpl implements KathmanduDAO {
    
    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction trans;
    
    int current_year = LocalDate.now().getYear();
    int current_day = LocalDate.now().getDayOfYear(); 

    @Override
    public void insert(Kathmandu w) {

    }

    @Override
    public void display(Kathmandu w) {

    }
    @Override
    public Kathmandu getById(int id) {
       session=sessionFactory.openSession();
       Kathmandu weather=(Kathmandu)session.get(Kathmandu.class, id);
       session.close();
       return weather;
    }

    @Override
    public List<Kathmandu> getAll() {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        List<Kathmandu> weatherList=session.createCriteria(Kathmandu.class).add(Restrictions.eq("day",current_day+1)).list();
        session.close();
        return weatherList;         
    }
    
    @Override
    public List<Kathmandu> getTen() {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        List<Kathmandu> tenList=session.createCriteria(Kathmandu.class)
        .add(Restrictions.between("day", current_day-7, current_day+6))
        .add(Restrictions.eq("year",2010))
        .list();
        //session.close();
        return tenList;          
    }
    
    @Override
    public List<Kathmandu> getEleven() {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        List<Kathmandu> elevenList=session.createCriteria(Kathmandu.class)
        .add(Restrictions.between("day", current_day-7, current_day+6))
        .add(Restrictions.eq("year",2011))
        .list();
        session.close();
        return elevenList;  
    }

    @Override
    public List<Kathmandu> getTwelve() {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        List<Kathmandu> twelveList=session.createCriteria(Kathmandu.class)
        .add(Restrictions.between("day", current_day-7, current_day+6))
        .add(Restrictions.eq("year",2012))
        .list();
        session.close();
        return twelveList;  
    }

    @Override
    public List<Kathmandu> getThirteen() {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        List<Kathmandu> thirteenList=session.createCriteria(Kathmandu.class)
        .add(Restrictions.between("day", current_day-7, current_day+6))
        .add(Restrictions.eq("year",2013))
        .list();
        session.close();
        return thirteenList;  
    }
        
    
    @Override
    public List<Kathmandu> getCurrent(){
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        List<Kathmandu> currentList=session.createCriteria(Kathmandu.class)
        .add(Restrictions.between("day", current_day-7, current_day))
        .add(Restrictions.eq("year",2014))
        .list();
        session.close();
        return currentList;
    }
     
         
}
