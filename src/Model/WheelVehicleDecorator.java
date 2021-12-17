package Model;

/**
 * @author Joël Smits
 * Dit is wat het programma doet
 */
public class WheelVehicleDecorator extends VehicleDecorator{

    public static final int DEFAULT_WHEEL_AMOUNT = 0;
    private int wheelAmount;

    public WheelVehicleDecorator(Vehicle decoratedVehicle, int wheelAmount) {
        super(decoratedVehicle);
        this.wheelAmount = wheelAmount;
    }

    public WheelVehicleDecorator(int wheelAmount) {
        this.wheelAmount = DEFAULT_WHEEL_AMOUNT;
    }

    @Override
    public void design() {
        decoratedVehicle.design();
        setWheelAmount(decoratedVehicle);
    }

    public void setWheelAmount(Vehicle decoratedVehicle) {
        System.out.printf("This vehicle has %d wheels\n", this.wheelAmount);
    }
}
