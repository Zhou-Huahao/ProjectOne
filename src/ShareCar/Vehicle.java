package ShareCar;
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

    public Vehicle(String id){
        this.id = id;
    }

    //租车说明
    public String showInfo(){
        return "";
    }


}
