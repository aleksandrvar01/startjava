public class Unicode {
    public static void main(String[] args) {
        char symbol;
        int number = 9398;
        int number2 = 10178;
        for (int i = 0; i < 7; i++) {
            int number3 = number + (int) (Math.random() * number2);
            System.out.println(symbol = (char) number3);
        }
    }
}
