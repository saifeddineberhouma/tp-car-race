package tp;

import tp.car.Car;
import tp.car.CarFactory;
import tp.car.Race;
import tp.car.Track;

public class Program {

    public static void main(String[] args) {
        Track track = new Track();
        Race race = new Race(track);
        CarFactory factory = new CarFactory();
        for (int i = 0; i < 10; i++) {
            Car car = factory.create();
            track.add(car);
        }
        race.start();
    }
}
