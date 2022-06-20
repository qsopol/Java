package alb4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AirCrew> airmemList = new ArrayList<>();
        AirMaker take = new AirMaker();

        airmemList.add(take.write("Сахіл", "Льотчик", "Робити смертельну петлю, керуючи пасажирським літаком", 10, 42000));
        airmemList.add(take.write("Іван", "Помічник льотчика", "Співати пасажирам", 9, 20000));
        airmemList.add(take.write("Олексій", "Повар", "Ремонт велосипедів", 5, 25000));
        airmemList.add(take.write("Аліна", "Стюардреса", "Кошки", 8, 15000));

        Air AirLine = new Air();
        for (AirCrew airmmbr : airmemList) {
            AirLine.addCrew(airmmbr);
        }

        AirLine.hoursSort();
        System.out.println("Відсортуємо за годинами роботи по зростанню:\n\n" + AirLine.getData());

        AirLine.salarySort();
        System.out.println("\nВідсортуємо за зарплатнею по спаданню:\n\n" + AirLine.getData());
    }
}
