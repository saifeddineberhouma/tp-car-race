package tp.car;

public class Car {

    private final int id;

    private int kmCounter = 0;

    Car(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getKmCounter() {
        return kmCounter;
    }

    public void drive() {
        kmCounter++;
        System.out.println("Moving forward");
    }

}
