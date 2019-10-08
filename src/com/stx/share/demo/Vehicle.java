package com.stx.share.demo;

/**
 * 车
 */
public class Vehicle {

    private String id; //车辆编号

    private int status; //是否已租（0可租，1已租）


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public Vehicle() {}

    public Vehicle(String id){
        this.id = id;
    }

    //车辆租车说明，子类进行覆盖
    public String showInfo(){
        return "";
    }


}