package Model;

/**
 * @author Annemiek Blaauwgeers <a.blaauwgeers@st.hanze.nl>
 * <p>
 * Dit is wat het programma doet.
 */
public class ColourVehicleDecorator extends VehicleDecorator {

    private static final String DEFAULT_COLOUR = "Grey";
    private final String colour;

    public ColourVehicleDecorator(Vehicle decoratedVehicle, String colour) {
        super(decoratedVehicle);
        this.colour = colour;
    }

    public ColourVehicleDecorator(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
        this.colour = DEFAULT_COLOUR;
    }

    @Override
    public void design() {
        decoratedVehicle.design();
        setColourVehicle(decoratedVehicle, DEFAULT_COLOUR);
    }

    public void setColourVehicle(Vehicle decoratedVehicle, String colour) {
        System.out.printf("Vehicle Colour: %s\n", this.colour);
    }
}


