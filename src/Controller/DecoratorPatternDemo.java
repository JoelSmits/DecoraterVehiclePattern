package Controller;

import Model.Bicycle;
import Model.Car;
import Model.ColourVehicleDecorator;
import Model.Vehicle;

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

        System.out.println("Just a normal grey car");
        car.design();

        System.out.println("\nNow there's a red car");

        redCar.design();

        System.out.println("\nNow there's a yellow bicycle");
        yellowBicycle.design();
    }
}
