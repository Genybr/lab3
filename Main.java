/* Вариант 3
        В одномерном массиве, состоящем из n целых элементов, вычислить:
        1) произведение элементов массива с четными номерами;
        2) сумму элементов массива, расположенных между первым и последним
*/

import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();

        double[] a = new double[n];
        double p = 1, sum = 0;

        System.out.println("Enter elements of the array: ");

        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
            if (a[i] % 2 == 0) {
                p *= a[i];
            }
            if (i+1 < n && i != 0) {
                sum = sum + a[i];
            }
        }


        System.out.println("task 1: " + p);
        System.out.println("Sum: " + sum);

        /*  Вариант 3
            Дана целочисленная прямоугольная матрица. Определить:
            1) количество столбцов, содержащих хотя бы один нулевой элемент;
            2) номера строк, содержащих  максимальные элементы.
         */

        System.out.println("Enter the size of the matrix: ");
        int k = scanner.nextInt();
        int j = scanner.nextInt();
        double[][] mx = new double [k][j];
        double max = mx[0][0];
        double[] m = new double [k];
        int h = 0;

        System.out.println("Input elements: ");
        for (int i = 0; i < k; i++) {
            for (int l = 0; l < j; l++) {
                mx[i][l] = scanner.nextInt();
            }

        }
        for (int i = 0; i < k; i++) {
            for (int l = 0; l < j; l++) {
                if(mx[i][l] == 0) {h++; break;}
                if(mx[i][l] > max) {max = mx[i][l];}
            }

        }
        for (int i = 0; i < k; i++) {
            for (int l = 0; l < j; l++) {
                if(mx[i][l] == max) {m[i] = i+1;} else m[i] = 0;
            }
        }
        System.out.println("task 1: " + h);
        System.out.println("task 2:");
        for (int i = 0; i < k; i++) {
            System.out.print(m[i] + "  ");

        }

    }

}