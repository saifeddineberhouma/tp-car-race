package tp.car;

public class CarFactory implements Factory<Car> {

    private int idCounter = 0;

    public Car create() {
        return new Car(idCounter++);
    }

}
