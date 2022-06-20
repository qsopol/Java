package alb4;

public class AirMaker {
    public AirCrew write(String name, String work, String hobby, int whours, int salary) {
        if (whours < 2 || whours > 12) throw new IllegalArgumentException("Людина не може працювати менше 2 або більше 12 годин на добу");
        if (salary < 5000 || salary > 10000) throw new IllegalArgumentException("Зарплатня не може буте менше мінімальної або більше тої, яку платить авікомпанія директору");

        return new AirCrew(name, work, hobby, whours, salary);
    }
}
