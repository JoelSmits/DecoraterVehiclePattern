package Model;

/**
 * @author Joël Smits
 * Dit is wat het programma doet
 */
public class WheelVehicleDecorator extends VehicleDecorator{

    private int wheelAmount;

    public WheelVehicleDecorator(Vehicle decoratedVehicle, int wheelAmount) {
        super(decoratedVehicle);
        this.wheelAmount = wheelAmount;
    }

    @Override
    public void design() {
        decoratedVehicle.design();
        setWheelAmount(decoratedVehicle);
    }

    public void setWheelAmount(Vehicle decoratedVehicle) {
        System.out.printf("Wheels: %d\n", this.wheelAmount);
    }
}
