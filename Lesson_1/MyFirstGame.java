import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        int computerNumber = 38;
        Scanner input = new Scanner(System.in);
        int playerNumber;
        do {
            System.out.println("Угадай число от 0 до 100");
            playerNumber = input.nextInt();
            if (computerNumber > playerNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (computerNumber < playerNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            }
        } while (computerNumber != playerNumber);
        System.out.println("Поздравляю, число угадано!");
    }
}

