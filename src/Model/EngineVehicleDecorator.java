package Model;

/**
 * @author Lars van der Schoor <la.van.der.schoor@st.hanze.nl>
 * <p>
 * [omschrijving van code]
 */
public class EngineVehicleDecorator extends VehicleDecorator {
    private static final String DEFAULT_ENGINE = "diesel";
    private final String engine;

    public EngineVehicleDecorator(Vehicle decoratedVehicle, String engine) {
        super(decoratedVehicle);
        this.engine = engine;
    }

    public EngineVehicleDecorator(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
        this.engine = DEFAULT_ENGINE;
    }

    @Override
    public void design() {
        decoratedVehicle.design();
        setEngineVehicle(decoratedVehicle, DEFAULT_ENGINE);
    }

    public void setEngineVehicle(Vehicle decoratedVehicle, String engine) {
        System.out.printf("Vehicle engine: %s\n", this.engine);
    }


}
