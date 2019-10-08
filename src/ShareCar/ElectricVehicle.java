package ShareCar;

public class ElectricVehicle extends Vehicle {

    public ElectricVehicle(String id) {
        super(id);
    }

    @Override
    public String showInfo() {
        return "共享电动车每小时收费5元";
    }
}