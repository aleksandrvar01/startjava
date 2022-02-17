public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        // Математические операции  +, -, *, /, ^, %
        char sing = '^';
        if (sing == '+') {
            System.out.println(a + b);
        } else if (sing == '-') {
            System.out.println(a - b);
        } else if (sing == '*') {
            System.out.println(a * b);
        } else if (sing == '%') {
            System.out.println(a * b);
        } else if (sing == '/') {
            System.out.println(a / b);
        } else if (sing == '^') {
            int expResult = 1 ;
            for (int i = 0; i < b; i++) {
                expResult *= a;
            }   
            System.out.println(expResult);
        }
    }
}
