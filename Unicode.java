public class Unicode {
    public static void main(String[] args) {
        char symbol;
        int number1 = 33;
        int number2 = 126;
        do {
            System.out.print(symbol = (char) number);
            number += 1;
        } while (number1 <= number2);   
    }
}
