package airport;

import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(findCountAircraftWithModelAirbus(Airport.getInstance(), "Boeing 737-200")); // 3
    }

    public static long findCountAircraftWithModelAirbus(Airport airport, String model) {
        //TODO Метод должен вернуть количество самолетов указанной модели.
        // подходят те самолеты, у которых name начинается со строки model

        return airport.getAllAircrafts().stream().filter(aircraft -> aircraft.getModel().startsWith(model)).count();

    }

    public static Map<String, Integer> findMapCountParkedAircraftByTerminalName(Airport airport) {
        //TODO Метод должен вернуть словарь с количеством припаркованных самолетов в каждом терминале.
        return airport.getTerminals().stream().collect(Collectors.toMap(Terminal::getName, terminal -> terminal.getParkedAircrafts().size()));
    }

    public static List<Flight> findFlightsLeavingInTheNextHours(Airport airport, int hours) {
        //TODO Метод должен вернуть список отправляющихся рейсов в ближайшее количество часов.

        return airport.getTerminals().stream()
                .flatMap(terminal -> terminal.getFlights().stream()
                        .filter(flight -> flight.getType().equals(Flight.Type.DEPARTURE))
                        .filter(flight -> flight.getDate().isAfter(Instant.now()))
                        .filter(flight -> flight.getDate().isBefore(Instant.now().plus(hours, ChronoUnit.HOURS)))
                ).toList();

    }

    public static Optional<Flight> findFirstFlightArriveToTerminal(Airport airport, String terminalName) {
        //TODO Найти ближайший прилет в указанный терминал.

        return airport.getTerminals().stream()
                .filter(terminal -> terminal.getName().equals(terminalName))
                .flatMap(terminal -> terminal.getFlights().stream()
                        .filter(flight -> flight.getType().equals(Flight.Type.ARRIVAL)))
                .min(Comparator.comparing(Flight::getDate));
    }
}