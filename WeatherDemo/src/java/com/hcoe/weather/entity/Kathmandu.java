/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcoe.weather.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mkpan
 */
@Entity
@Table(name = "ka_all", catalog = "weather", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kathmandu.findAll", query = "SELECT w FROM Kathmandu w"),
    @NamedQuery(name = "Kathmandu.findBySn", query = "SELECT w FROM Kathmandu w WHERE w.sn = :sn"),
    @NamedQuery(name = "Kathmandu.findByDay", query = "SELECT w FROM Kathmandu w WHERE w.day = :day"),
    @NamedQuery(name = "Kathmandu.findByTMax", query = "SELECT w FROM Kathmandu w WHERE w.maxTemperature = :maxTemperature"),
    @NamedQuery(name = "Kathmandu.findByTMin", query = "SELECT w FROM Kathmandu w WHERE w.minTemperature = :minTemperature"),
    @NamedQuery(name = "Kathmandu.findByHAm", query = "SELECT w FROM Kathmandu w WHERE w.amHumidity = :amHumidity"),
    @NamedQuery(name = "Kathmandu.findByHPm", query = "SELECT w FROM Kathmandu w WHERE w.pmHumidity = :pmHumidity"),
    @NamedQuery(name = "Kathmandu.findByRainfall", query = "SELECT w FROM Kathmandu w WHERE w.rainfall = :rainfall"),
    @NamedQuery(name = "Kathmandu.findBySunshine", query = "SELECT w FROM Kathmandu w WHERE w.sunshine = :sunshine"),
    @NamedQuery(name = "Kathmandu.findByWind", query = "SELECT w FROM Kathmandu w WHERE w.wind = :wind"),
    @NamedQuery(name = "Kathmandu.findByYear", query = "SELECT w FROM Kathmandu w WHERE w.year = :year")})
public class Kathmandu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer sn;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private int day;
    @Basic(optional = false)
    @NotNull
    @Column(name = "t_max", nullable = false)
    private float maxTemperature;
    @Basic(optional = false)
    @NotNull
    @Column(name = "t_min", nullable = false)
    private float minTemperature;
    @Basic(optional = false)
    @NotNull
    @Column(name = "h_am", nullable = false)
    private float amHumidity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "h_pm", nullable = false)
    private float pmHumidity;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private float rainfall;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private float sunshine;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private float wind;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private int year;

    public Kathmandu() {
    }

    public Kathmandu(Integer sn) {
        this.sn = sn;
    }

    public Kathmandu(Integer sn, int day, float maxTemperature, float minTemperature, float amHumidity, float pmHumidity, float rainfall, float sunshine, float wind, int year) {
        this.sn = sn;
        this.day = day;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
        this.amHumidity = amHumidity;
        this.pmHumidity = pmHumidity;
        this.rainfall = rainfall;
        this.sunshine = sunshine;
        this.wind = wind;
        this.year = year;
    }

    public Integer getSn() {
        return sn;
    }

    public void setSn(Integer sn) {
        this.sn = sn;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public float getTMax() {
        return maxTemperature;
    }

    public void setTMax(float maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public float getTMin() {
        return minTemperature;
    }

    public void setTMin(float minTemperature) {
        this.minTemperature = minTemperature;
    }

    public float getHAm() {
        return amHumidity;
    }

    public void setHAm(float amHumidity) {
        this.amHumidity = amHumidity;
    }

    public float getHPm() {
        return pmHumidity;
    }

    public void setHPm(float pmHumidity) {
        this.pmHumidity = pmHumidity;
    }

    public float getRainfall() {
        return rainfall;
    }

    public void setRainfall(float rainfall) {
        this.rainfall = rainfall;
    }

    public float getSunshine() {
        return sunshine;
    }

    public void setSunshine(float sunshine) {
        this.sunshine = sunshine;
    }

    public float getWind() {
        return wind;
    }

    public void setWind(float wind) {
        this.wind = wind;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sn != null ? sn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kathmandu)) {
            return false;
        }
        Kathmandu other = (Kathmandu) object;
        if ((this.sn == null && other.sn != null) || (this.sn != null && !this.sn.equals(other.sn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hcoe.weather.entity.Kathmandu[ sn=" + sn + " ]";
    }
    
}
