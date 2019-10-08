package ShareCar;

import java.util.Scanner;

public class VehicleManager {

    private Vehicle[] vehicleList = new Vehicle[10];
    private Scanner scanner = new Scanner(System.in);

    public VehicleManager(){
        //初始化10辆共享车
        for(int i=0; i<5; i++){
            vehicleList[i] = new Bike("V"+(i+1));
        }
        for(int i=5; i<vehicleList.length; i++){
            vehicleList[i] = new ElectricVehicle("V"+(i+1));
        }
    }


    //开始菜单
    public void start(){

        System.out.println("**************************");
        System.out.println("*****共享单车管理系统******");
        System.out.println("**************************");


        boolean isExit = false;
        do{
            System.out.println("---------------------------------------------------------------");
            System.out.println("***请选择操作：");
            System.out.println("***1.查看车辆");
            System.out.println("***2.租赁车辆");
            System.out.println("***3.归还车辆");
            System.out.println("***4.退出");
            String choose = scanner.nextLine();
            System.out.println("---------------------------------------------------------------");
            switch (choose){
                case "1":
                    view();
                    break;
                case "2":
                    rental();
                    break;
                case "3":
                    back();
                    break;
                case "4":
                    isExit = true;
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }

        }while (!isExit);
    }

    private void view(){

        System.out.println("编号\t类型\t\t状态\t\t租车说明");

        for(Vehicle vehicle : vehicleList){
            System.out.print(vehicle.getId()+ "\t\t");
            if(vehicle instanceof Bike){
                System.out.print("单车\t\t");
            }else{
                System.out.print("电动车\t\t");
            }

            if(vehicle.getStatus() == 0){
                System.out.print("未租\t\t");
            }else{
                System.out.print("已租\t\t");
            }
            System.out.println(vehicle.showInfo());
        }
    }

    //租车
    private void rental(){
        System.out.println("请输入租车编号：");
        String id = scanner.nextLine();
        for(Vehicle vehicle : vehicleList){
            if(vehicle.getId().equals(id)){
                if(vehicle.getStatus() == 1){
                    System.out.println("编号为" + id + "的车已被出租，不能再次租赁！");
                    return;
                }
                vehicle.setStatus(1);
                System.out.println("编号为" + id + "的车出租成功！");
                return;
            }
        }
        System.out.println("没有找到该编号的车辆信息，请重新输入！");
    }

    //还车
    private void back(){
        System.out.println("请输入还车编号：");
        String id = scanner.nextLine();
        for(Vehicle vehicle : vehicleList){
            if(vehicle.getId().equals(id)){
                if(vehicle.getStatus() == 0){
                    System.out.println("编号为" + id + "的车未租，不需要归还！");
                    return;
                }
                vehicle.setStatus(0);
                System.out.println("编号为" + id + "的车归还成功！");
                return;
            }
        }
        System.out.println("没有找到该编号的车辆信息，请重新输入！");
    }


    public static void main(String[] args) {
        VehicleManager manager = new VehicleManager();
        manager.start();
    }

}
