package tp.car;

public class Car {

    private final int id;

    private int kmCounter = 0;
    private boolean isEngineStarted = false;

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
        checkEngineStarted();
        kmCounter++;
    }

    private void checkEngineStarted() {
        if (!isEngineStarted)
            throw new EngineNotStartedException();
    }

    public void startEngine() {
        checkEngineNotStarted();
        isEngineStarted = true;
        System.out.println("Car " + id + " : Engine started");
    }

    private void checkEngineNotStarted() {
        if (isEngineStarted)
            throw new EngineAlreadyStartedException();
    }

}
