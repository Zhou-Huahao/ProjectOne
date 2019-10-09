package com.shuangtixi.tianyi.zhh;

public class user {

    private String name;
    private String password;

    user(){};

    user(String name, String password){
        this.name=name;
        this.password=password;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
