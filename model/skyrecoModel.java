
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.skyreco.model;

/**
 *
 * @author aayus
 */
public class skyrecoModel {
    //initializing the variables
    private int serialNumber;
    private String modelNumber;
    private String name;
    private String company;
    private String camera;
    private int range;
    private int cost;
    private String  purpose;

    //forming constructor for entering the values
    public skyrecoModel(int serialNumber, String modelNumber, String name, String company, String camera, int range, int cost, String purpose) {
        this.serialNumber = serialNumber;
        this.modelNumber = modelNumber;
        this.name = name;
        this.company = company;
        this.camera = camera;
        this.range = range;
        this.cost = cost;
        this.purpose = purpose;
    }

    
    //for getting and setting the variable values of skyrecoModel
    
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    
    
    
}
