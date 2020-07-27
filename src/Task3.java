import java.util.Scanner;

public class Task3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 для запуска калькулятора, 2 для поиска максимального слова в массиве.");
        System.out.print("Введите значение: ");
        int a = in.nextInt();
        if (a == 1) {
            System.out.print("Введите первое число: ");
            double x = in.nextDouble();
            System.out.print("Введите второе число: ");
            double y = in.nextDouble();
            System.out.println("Выберите действие. 1 Сложение, 2 Вычитание, 3 Умножение, 4 Деление. ");
            int b = in.nextInt();
            if (b == 1) {
                double z = x + y;
                System.out.printf("%.2f", z);
            } else if (b == 2) {
                double z = x - y;
                System.out.printf("%.2f", z);
            } else if (b == 3) {
                double z = x * y;
                System.out.printf("%.2f", z);
            } else if (b == 4) {
                double z = x / y;
                System.out.printf("%.2f", z);
            } else {
                System.out.print("Вы выбрали некорректное действие: ");
            }
        }
        else if (a == 2) {
            System.out.print("Сколько слов нужно сравнить?:");
            in = new Scanner(System.in);
            int dlina = in.nextInt();
            String nums[] = new String[dlina];
            if (dlina <= 0) {
                System.out.print("Нечего сравнивать. Запустите программу заново.");
                System.exit(0);}
            else {
                System.out.print ("Введите " + (dlina) + " слов через Enter: ");
                for (int i = 0; i < dlina; i++) {
                    nums[i] = in.next();
                }
                System.out.print ("Данные массива:");
                for (int i = 0; i < dlina; i++) {
                    System.out.print(" " + nums[i]);
                }
                System.out.println();
            }
        } else {
            System.out.print("Вы ввели некорректное значение.");
        }
    }
}
