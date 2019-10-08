package com.stx.share.demo;

import java.util.Scanner;

public class VehicleManager {

    private Vehicle[] vehicleList = new Vehicle[10];
    private Scanner scanner = new Scanner(System.in);

    /**
    * VehicleManager()中完成往vehicleList数组中费别放5辆单车和5辆电动车的数据
    */
    public VehicleManager() {
        // to-do: 放5辆单车和5辆电动车对象到vehicleList中
        for (int index = 0; index < 5; index++) {
            vehicleList[index] = new Bike("v" + (index + 1));
        }
        for (int index = 5; index < vehicleList.length; index++) {
        vehicleList[index] = new ElectricVehicle("v" + index);
    }
    }




    //开始菜单
    public void start(){
        System.out.println("**************************");
        System.out.println("*******享车管理系统********");
        System.out.println("**************************");
        
        boolean canContinue = true;
        while (canContinue) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("***请选择操作：");
            System.out.println("***1.查看车辆");
            System.out.println("***2.租赁车辆");
            System.out.println("***3.归还车辆");
            System.out.println("***4.退出");
            // to-do：完成系统菜单控制功能，根据用户的菜单选择，调用对应的方法流程实现
            String choose=scanner.next();
            switch (choose){
               case "1":
                   view();
                   break;
               case"2":
                   rental();
                   break;
               case"3":
                   back();
                   break;
               case"4":
                   canContinue=false;
                   System.out.println("退出成功，再见");
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break ;
            }}
        }


    /**
     * 查看车辆功能流程实现
     */
    private void view(){
        System.out.println("编号\t类型\t\t状态\t\t租车说明");
        // to-do：完成查看车辆功能
        for (int i=0;i<vehicleList.length;i++){
            System.out.print(vehicleList[i].getId()+ "\t\t");
            if(vehicleList[i] instanceof Bike){
                System.out.print("单车\t\t");
            }else{
                System.out.print("电动车\t\t");
            }

            if(vehicleList[i].getStatus() == 0){
                System.out.print("未租\t\t");
            }else{
                System.out.print("已租\t\t");
            }
            System.out.println(vehicleList[i].showInfo());
        }
        // 提示：遍历vehicleList数组时，可以通过instanceof判断当前对象为单车还是电动车，以此输出类型那一列数据；租车说明直接调用showInfo，感受多态的应用
        
    }

    /**
     * 租赁车辆功能流程实现，将租赁成功的车辆状态修改为1；租赁已被借出的车辆和不存在的车辆情况给出错误信息
     */
    private void rental(){
        System.out.println("请输入租车编号：");
        String id = scanner.next();
        for (int i=0;i<vehicleList.length;i++){
            if (vehicleList[i].getId().equals(id)) {
                if (vehicleList[i].getStatus()==1){
                    System.out.println("该车已被出租");
                }else{
                    System.out.println("成功租车");
                    vehicleList[i].setStatus(1);
                    return;
                }
            }
        }
        // to-do：完成车辆租赁功能
    }

    /**
     * 归还车辆功能流程实现，将可以归还的车辆状态修改为0；不需要归还和归还不存在的车辆情况给出错误信息
     */
    private void back(){
        System.out.println("请输入还车编号：");
        String id=scanner.next();
        // to-do：完成车辆归还功能
        for (int i=0;i<vehicleList.length;i++){
            if (vehicleList[i].getId().equals(id)){
                if (vehicleList[i].getStatus()==0){
                    System.out.println("此车未出租");
                }else{
                    System.out.println("还车成功");
                    vehicleList[i].setStatus(0);
                }
            }
        }

    }


    public static void main(String[] args) {
    	// to-do: 创建VehicleManager对象，调用start方法开始系统



        VehicleManager manager = new VehicleManager();
        manager.start();

    }

}
