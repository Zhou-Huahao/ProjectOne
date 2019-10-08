package com.shuangtixi.tianyi.zhh;

public class Memory {
    private String name;
    private String password;
    Memory() {
    }

    Memory(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void show() {
        System.out.println(name);
        System.out.println(password);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }



}
