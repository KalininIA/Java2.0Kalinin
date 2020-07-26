import java.util.Scanner;

/**
 * @author Ilia
 */

public class Task2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double x = in.nextDouble();
        System.out.print("Введите второе число: ");
        double y = in.nextDouble();
        //Операция сложения двух дробных чисел
        double z = x + y;
        //Вывести результат округленный до 4х знаков после запятой
        System.out.printf("%.4f", z);
    }
}
