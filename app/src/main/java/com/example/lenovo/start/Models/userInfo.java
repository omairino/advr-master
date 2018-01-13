package com.example.lenovo.start.Models;

import java.util.List;

/**
 * Created by Lenovo on 02/01/2018.
 */

public    class userInfo {
    public String username;
    public String address;
    public String property;
    public String number;
    public String lat,lng;
    public List<String> description;

    public userInfo(String username, String address, String property, String number, String lat, String lng ,List<String> description) {
        this.username = username;
        this.address = address;
        this.property = property;
        this.number = number;
        this.lat = lat;
        this.lng = lng;
        this.description=description;
    }

    public userInfo() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public List<String> getdescription() {
        return description;
    }

    public void setdescription(List<String> description) {
        this.description = description;
    }
}
