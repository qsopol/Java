package alb1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zal = 1323;
        int[] C = {zal % 2, zal % 3, zal % 5, zal % 7};
        System.out.printf("C2: %d (-) C3: %d C5: %d (+) C7: %d (byte)\n", C[0], C[1], C[2], C[3]);

        Map<String, Byte> valuedict = new HashMap<>();
        String[] valkeys = {"a", "n", "b", "m"};

        for (String in : valkeys) {
            System.out.printf("Введіть число %s: \n", in);
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("Потрібне число");
            }
            valuedict.put(in, (byte) scanner.nextInt());
        }
        valuedict.put("C", (byte) 0);
        if (valuedict.get("a") > valuedict.get("n") || valuedict.get("b") > valuedict.get("m")) {
            throw new IllegalArgumentException("Останнє менше ніж перше");
        }
        if (valuedict.get("a") <= -valuedict.get("C") && -valuedict.get("C") <= valuedict.get("n") || valuedict.get("b") <= 0 && 0 <= valuedict.get("m"))  {
            throw new IllegalArgumentException("Функція не існує в даному проміжку");
        }

        float all = 0;
        for (byte i = valuedict.get("a"); i <= valuedict.get("n"); i++) {
            for (byte j = valuedict.get("b"); j <= valuedict.get("m"); j++) {
                all += (float) (i + j) / (i - valuedict.get("C"));
            }
        }
        System.out.printf("Результат обчислення: %f", all);
    }
}