package Model;

/**
 * @author Annemiek Blaauwgeers <a.blaauwgeers@st.hanze.nl>
 * <p>
 * Dit is wat het programma doet.
 */
public class GPSVehicleDecorator extends VehicleDecorator {

    private static final String DEFAULT_GPSTYPE = "not included";
    private final String typeGPS;

    public GPSVehicleDecorator(Vehicle decoratedVehicle, String typeGPS) {
        super(decoratedVehicle);
        this.typeGPS = typeGPS;
    }

    public GPSVehicleDecorator(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
        this.typeGPS = DEFAULT_GPSTYPE;
    }

    @Override
    public void design() {
        decoratedVehicle.design();
        setGPSVehicle(decoratedVehicle, DEFAULT_GPSTYPE);
    }

    public void setGPSVehicle(Vehicle decoratedVehicle, String typeGPS) {
        System.out.printf("Vehicle GPS: %s\n", this.typeGPS);
    }
}
