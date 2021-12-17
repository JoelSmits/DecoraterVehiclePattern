package Controller;

import Model.Bicycle;
import Model.Car;
import Model.RedVehicleDecorator;
import Model.Vehicle;

/**
 * @author Annemiek Blaauwgeers <a.blaauwgeers@st.hanze.nl>
 * <p>
 * Dit is wat het programma doet.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle redCar = new RedVehicleDecorator(new Car());
        Vehicle redBicycle = new RedVehicleDecorator(new Bicycle());

        System.out.println("Just a normal car");
        car.design();

        System.out.println("\nNow there's a red car");
        redCar.design();

        System.out.println("\nNow there's a red bicycle");
        redBicycle.design();
    }
}
