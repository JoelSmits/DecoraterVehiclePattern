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
        Vehicle boat = new Boat();
        Vehicle boat2 = new EngineVehicleDecorator(new Boat(), "diesel");
        Vehicle roeiboot = new EngineVehicleDecorator(new Boat(), "muscles");

        System.out.println("Just a normal grey car");
        car.design();

        System.out.println("\nNow there's a red car");

        redCar.design();

        System.out.println("\nNow there's a yellow bicycle");
        yellowBicycle.design();

        boat.design();

        System.out.println("\nA boat running on diesel");
        boat2.design();

        System.out.println("\nrow row row your boat....");
        roeiboot.design();
    }
}
