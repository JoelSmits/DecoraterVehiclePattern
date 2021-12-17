package Controller;

import Model.*;

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


        System.out.println("Just a normal grey car");
        car.design();

        System.out.println("\nNow there's a red car");

        redCar.design();

        System.out.println("\nNow there's a yellow bicycle");
        yellowBicycle.design();

        System.out.println("Boat");
        boat.design();
    }
}
