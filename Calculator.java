public class Calculator {
    public static void main (String [] args) {
        int a = 2;
        int b = 8;
        // Математические операции  +, -, *, /, ^, %
        char symbol = '^';
        if (symbol == '+') {
            int addition = a + b;
            System.out.println(addition);
        } else if (symbol == '-') {
            int subtraction = a - b; 
            System.out.println(subtraction);
        } else if (symbol == '*') {
            int multiplication = a * b;
            System.out.println(multiplication);
        } else if (symbol == '%') {
            int remainderOfDivision = a % b;
            System.out.println(remainderOfDivision);
        } else if (symbol == '/') {
            int division = a / b;
            System.out.println(division);
        } else if (symbol == '^') {
            int exponentiation = 1 ;
            for (int i =0 ; i < b; i ++ ) {
                exponentiation = exponentiation * a;
            }   
            System.out.println(exponentiation);
        }
    }
}
