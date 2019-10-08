package com.shuangtixi.tianyi.zhh;

import java.util.Scanner;

//登录注册系统界面
public class Menu {

    public void User() {
        VehicleManager vm = new VehicleManager();
        Memory use = new Memory();
        Memory[] users = new Memory[20];
        Scanner sc = new Scanner(System.in);
        boolean canContinue = true;
        int index = 0;
        String name, password;
        while (canContinue) {
            System.out.println("1.登录\t2.注册\t3.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("请输入您的用户名：");
                    name = sc.next();
                    for (index = 0; index < users.length; index++) {
                        if ((users[index] != null && name.equals(users[index].getName()))) {
                            System.out.println("请输入您的密码：");
                            password = sc.next();
                            if (users[index] != null && password.equals(users[index].getPassword()) ) {
                                System.out.println("登陆成功");
                               vm.start();
                            } else{
                                System.out.println("密码输入错误");
                            break;}
                        }
                        if (users[index] == null || index == users.length - 1) {
                            System.out.println("用户名输入错误");
                            break;
                        }
                    }
                    break;
                case "2":
                    if (index < users.length) {
                        System.out.println("请输入您的用户名：");
                        name = sc.next();
                        System.out.println("请输入您的密码：");
                        password = sc.next();
                        Memory user = new Memory(name, password);
                        users[index] = user;
                        System.out.println("注册成功");
                        index++;
                        break;
                    } else
                        System.out.println("注册已达上限");
                    break;
                case "3":
                    canContinue = false;
                    System.out.println("您已经成功退出");
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }
    }
}


