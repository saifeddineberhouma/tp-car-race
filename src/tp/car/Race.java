package tp.car;

public class Race {

    private final Track track;

    public Race(Track track) {
        this.track = track;
    }

    public void start() {
        startCarEngines();
        for (int i = 0; i < 20; i++) {
            for (Car car : track.getCars())
                car.drive();
        }
        for (Car car : track.getCars())
            System.out.println(car.getKmCounter());
    }

    private void startCarEngines() {
        for (Car car : track.getCars())
            car.startEngine();
    }
}
