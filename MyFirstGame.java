import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        int numberComputer = 38;
        Scanner input = new Scanner(System.in);
        int numberPlayer;
        do {
            System.out.println("Угадай число от 0 до 100");
            numberPlayer = input.nextInt();
            if (numberComputer > numberPlayer) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (numberComputer < numberPlayer) {
                System.out.println("Данное число больше того, что загадал компьютер");
            }
        } while (numberComputer != numberPlayer);
        System.out.println("Поздравляю, число угадано!");
    }
}

