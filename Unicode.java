public class Unicode {
    public static void main(String[] args) {
        int number1 = 33;
        int number2 = 126;
        for (int i = number1; i <= number2; i++) {
            System.out.print((char) number1 + " ");
            number1 += 1;
        }
    }
}
