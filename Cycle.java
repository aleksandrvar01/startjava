public class Cycle {
    public static void main(String[] args) {
    //Выведите на консоль с помощью цикла for все числа от [0, 20]
    System.out.println("Выведите на консоль с помощью цикла for все числа от [0, 20]");  
    for (int i = 0; i <= 20; i++) {
        System.out.print(i + " ");
    }

    //Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)
    System.out.println("\nВыведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)");
    int num = 6;
    while( num >= -6) {
        System.out.print(num + " ");
        num = num - 2;
    }

    //Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль
    System.out.println("\nПодсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль");
    int sum = 0;
    int number = 10;
    do{
        if (number % 2 != 0) {
            number++;
        } else { 
            number++;
            sum = number + sum ;
        }
        } while(number < 19);
      System.out.println(sum);
    }
}