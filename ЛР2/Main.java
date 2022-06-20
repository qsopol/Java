package alb2;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        Main.scanner = new Scanner(System.in);

        int[] Ci = {1323 % 5, 1323 % 7, 1323 % 11};
        System.out.printf("C5: %d (C=A⊕B), C7: %d (double), C11: %d (сума найбільших кожного рядка)\n", Ci[0], Ci[1], Ci[2]);

        System.out.println("Розмір матриці:");
        if (!scanner.hasNextInt()) {
            System.out.println("Потрібні числа");
            return;
        }
        final int N = scanner.nextInt();
        if (N < 0) {
            System.out.println("Натуральні числа");
            return;
        }

        System.out.println("Введіть матрицю А:");
        final double[][] A = entermatrix(N);
        System.out.println("Введіть матрицю B:");
        final double[][] B = entermatrix(N);
        final double[][] C = new double[2*N][2*N];
        for (int i = 0; i < 2*N; i++) {
            for (int j = 0; j < 2*N; j++) {
                C[i][j] = 0;
            }
        }
        for (int i = 0; i < N; i++) {
            System.arraycopy(A[i], 0, C[i], 0, N);
        }
        for (int i = N; i < 2*N; i++) {
            if (2 * N - N >= 0) System.arraycopy(B[i - N], 0, C[i], N, 2 * N - N);
        }

        double summax = 0;
        for (int i = 1; i <= 2*N; i++) {
            double max = Double.NEGATIVE_INFINITY;
            for (int j = 1; j <= 2*N; j++) {
                if (C[i - 1][j - 1] > max) {
                    max = C[i - 1][j - 1];
                }
                System.out.printf("%s\s", C[i - 1][j - 1]);
            }
            summax += max;
            System.out.println();
        }

        System.out.printf("Сума найбільших елементів кожного рядка: %s\s\n", summax);
    }

    public static double[][] entermatrix(int N) {
        double[][] matrix = new double[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!Main.scanner.hasNextDouble()) {
                    throw new IllegalArgumentException("Потрібні числа double");
                }
                matrix[i][j] = Main.scanner.nextFloat();
            }
        }
        return matrix;
    }
}
