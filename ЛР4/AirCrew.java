package alb4;

public class AirCrew {
    private final String _name, _work, _hobby;
    private final int _whours, _salary;

    public AirCrew(String name, String work, String hobby, int whours, int salary) {
        this._name = name;
        this._work = work;
        this._hobby = hobby;
        this._whours = whours;
        this._salary = salary;
    }

    public String getName() {
        return _name;
    }

    public String getWork() {
        return _work;
    }

    public String getHobby() {
        return _hobby;
    }

    public int getWorkHours() {
        return _whours;
    }

    public int getSalary() {
        return _salary;
    }

    @Override
    public String toString() {
        String crewMateInfo = "%s. Працює на літаку як: %s. Хобі: %s. Робочий день: %d годин. Зарплатня: %d грн.";
        return String.format(crewMateInfo, getName(), getWork(), getHobby(), getWorkHours(), getSalary());
    }
}
