package ShareCar;

public class Bike extends Vehicle {

    public Bike(String id) {
        super(id);
    }

    @Override
    public String showInfo() {
        return "共享单车每小时收费1元";
    }

}