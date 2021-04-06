package DZ_7;

import DZ_7.Composite.MuscleCar;
import DZ_7.Composite.SportCar;
import DZ_7.facade.Facade;
import DZ_7.facade.ShapeType;
import DZ_7.Composite.Drawing;
import DZ_7.Composite.Car;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.draw(ShapeType.Square);

        Car sportCar = new SportCar();
        Car MuscleCar = new MuscleCar();
        Drawing drawing = new Drawing();
        drawing.add(sportCar);
        drawing.add(MuscleCar);
        drawing.draw("green");
        drawing.clear();
        drawing.add(sportCar);
        drawing.add(MuscleCar);
        drawing.draw("white");
    }
}
