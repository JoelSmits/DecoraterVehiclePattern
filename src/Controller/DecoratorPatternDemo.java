package Controller;

import Model.*;

import java.sql.SQLOutput;

/**
 * @author Annemiek Blaauwgeers <a.blaauwgeers@st.hanze.nl>
 * <p>
 * Dit is wat het programma doet.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle redCar = new ColourVehicleDecorator(new Car(), "Red");
        Vehicle yellowBicycle = new ColourVehicleDecorator(new Bicycle(), "Yellow");
        Vehicle boat = new EngineVehicleDecorator(new Boat(), "diesel");
        Vehicle boat2 = new EngineVehicleDecorator(new Boat(), "diesel");


        System.out.println("Just a normal grey car");
        car.design();

        System.out.println("\nNow there's a red car");

        redCar.design();

        System.out.println("\nNow there's a yellow bicycle");
        yellowBicycle.design();

        System.out.println("\nNext up, a boat!");
        boat.design();

        System.out.println("\nrow row row your boat.....");
        boat2.design();

        Vehicle carWithDigitalGPS = new GPSVehicleDecorator(new Car(), "TomTom");
        Vehicle bicycleWithMap = new GPSVehicleDecorator(new Bicycle(), "Paper map");

        System.out.println("\nNormal grey car with a built in GPS system");
        carWithDigitalGPS.design();

        System.out.println("\nNormal grey bicycle with a paper map");
        bicycleWithMap.design();

        carWithDigitalGPS = new ColourVehicleDecorator(carWithDigitalGPS, "Blue");
        bicycleWithMap = new ColourVehicleDecorator(bicycleWithMap, "Pink");

        System.out.println("\nNow the car with GPS is blue");
        carWithDigitalGPS.design();

        System.out.println("\nNow the bicycle with paper map is pink");
        bicycleWithMap.design();

        Vehicle carWithSixWheels = new WheelVehicleDecorator(new Car(), 6);
        Vehicle bicycleWithThreeWheels = new WheelVehicleDecorator(new Bicycle(), 3);

        System.out.println("\nNow the car has 6 wheels");
        carWithSixWheels.design();

        System.out.println("\nNow the bicycle has 3 wheels");
        bicycleWithThreeWheels.design();
    }
}
