package Model;

/**
 * @author Joël Smits
 * Dit programma verandert de kleur van voertuigen naar rood.
 */
public class RedVehicleDecorator extends VehicleDecorator{

    public RedVehicleDecorator(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
    }

    @Override
    public void design() {
         decoratedVehicle.design();
         setColourVehicle(decoratedVehicle);
    }

    public void setColourVehicle(Vehicle decoratedVehicle){
        System.out.println("Now there's a red car");
    }
}
