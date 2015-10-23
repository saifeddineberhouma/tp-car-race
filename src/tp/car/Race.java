package tp.car;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Race {

    private final Track track;

    public Race(Track track) {
        this.track = track;
    }

    public void start() {
        track.getCars().stream()
                .map(Car::getId)
                .forEach(System.out::print);
    }
}
