package alb4;

import java.util.Comparator;

public class SalaryComparator implements Comparator<AirCrew> {
    @Override
    public int compare(AirCrew firstAir, AirCrew secondAir) {
        return Integer.compare(firstAir.getSalary(), secondAir.getSalary());
    }
}
