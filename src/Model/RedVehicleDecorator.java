package Model;

/**
 * @author Annemiek Blaauwgeers <a.blaauwgeers@st.hanze.nl>
 * <p>
 * Dit is wat het programma doet.
 */
public class RedVehicleDecorator extends VehicleDecorator {

    public RedVehicleDecorator(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
    }

    @Override
    public void design() {
        decoratedVehicle.design();
        setColourVehicle(decoratedVehicle);
    }

    public void setColourVehicle(Vehicle decoratedVehicle) {
        System.out.println("Vehicle Colour: Red");
    }
}
