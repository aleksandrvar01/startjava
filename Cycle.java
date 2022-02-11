public class Cycle {
    public static void main(String[] args) {
    for (int i = 0; i <= 20; i++) {
        System.out.print(i + " ");
    }

    System.out.println("\n");
    
    int num = 6;
    while( num >= -6) {
        System.out.print(num + " ");
        num = num - 2;
    }

    }
}
