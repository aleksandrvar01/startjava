<<<<<<< HEAD
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = 38;
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("Угадай число от 0 до 100");
            number = input.nextInt();
            if (a > number) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (a < number) {
                System.out.println("Данное число больше того, что загадал компьютер");
            }
        } while (a != number);
        System.out.println("Поздравляю, число угадано!");
    }
}

