package alb4;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Air {
    private final ArrayList<AirCrew> airList = new ArrayList<>();

    public void addCrew(AirCrew newCrew) {
        airList.add(newCrew);
    }

    public void hoursSort() {
        airList.sort(new HoursComparator());
    }

    public void salarySort() {
        airList.sort(new SalaryComparator().reversed());
    }

    public String getData() {
        return airList.stream().map(AirCrew::toString).collect(Collectors.joining("\n"));
    }
}
