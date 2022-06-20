package alb3;

import java.util.Scanner;
import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] Ci = {1323 % 3, 1323 % 17};
        System.out.printf("C3: %d (StringBuilder), C17: %d ()\n", Ci[0], Ci[1]);

        System.out.println("Введіть текст");
        StringBuilder text = new StringBuilder(scanner.nextLine());

        int from = 0, to;
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || i==text.length()-1) {
                to = i;
                words.add(text.substring(from, to+1));
                from = i + 1;
            }
        }
        int k = 0;
        for (String word : words) {
            char a = word.charAt(0);
            for(int i = 1; i<word.length(); i++){
                if (word.charAt(i) == a){
                    word = word.substring(0,i)+word.substring(i+1);
                }
            }
            System.out.print(word + " ");
        }
    }
}