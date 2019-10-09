package oracle;
import java.util.Scanner;
public class tuser {
user[] us=new user[20];
Scanner sc=new Scanner(System.in);

public  static void main(String[] args) {
    tuser ub=new tuser();
        boolean con=true;
        while (con){
            System.out.println("1.登录 2.注册 3.退出");
            Scanner sc=new Scanner(System.in);
            int choose=sc.nextInt();
            switch (choose){
                case 1:
                    ub.login();
                    break;
                case 2:
                    ub.regist();
                    break;
                case 3:
                    con=false;
                    System.out.println("您已退出，下次见！");
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");
                    break;
            }

    }
    }

     private void login() {
         System.out.println("请输入用户名");
         String name=sc.next();
         System.out.println("请输入密码");
         String password=sc.next();
         for (int i = 0; i<us.length; i++){
             if (us[i]!=null&&us[i].getName().equals(name)&&us[i].getPassword().equals(password)){
                 System.out.println("登陆成功");
                 break;}
             if (us[i]==null||i==us.length-1){
                 System.out.println("登陆失败");
             break;
             }
             }
             }


     private void regist(){

         System.out.println("请输入用户名");
         String name=sc.next();

         for (int i = 0; i<us.length; i++){
             if (us[i]!=null&&us[i].getName().equals(name)){
                 System.out.println("用户名已注册");
                 break;
             }
             if(us[i]==null){
                 System.out.println("请输入密码");
                 String password=sc.next();
                 us[i]=new user(name,password);
                 System.out.println("注册成功");
             break;
             }
             if (i==us.length-1){
                 System.out.println("用户空间已满，错误");
             break;
             }
         }

}}
