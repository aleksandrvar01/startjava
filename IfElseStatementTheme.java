public class IfElseStatementTheme {
    public static void main (String [] args) {
        //1. Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 17;
        if(age > 20) {
            System.out.println("Входите пожалуйста");
        } else {
            System.out.println("Вход для достигших 20 лет.");
        }
        boolean maleGender = false ;
        if(!maleGender) {
            System.out.println("Вход только для девушек.");
        }
        double growth = 1.70;
        if(growth < 1.80) {
            System.out.println("Вам на первый ряд");
        } else {
            System.out.println("Вам на второй ряд");
        }

        char firstLetterName = "Mary".charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("Возможно её имя Mary");
        } else if (firstLetterName == 'I') {
            System.out.println("Возможно её имя Irina");
        } else {
             System.out.println("Я не угадал.");
        } 

        //2. Поиск максимального и минимального числа
        System.out.println("\n2. Поиск максимального и минимального числа.");
        int number_1 = 5;
        int number_2 = 18;
        if (number_1 > number_2) {
            System.out.println("Число_1 является максимальным = " + number_1 + "\nЧисло_2 является минимальным = " + number_2);
        } else {
            System.out.println("Число_2 является максимальным = " + number_2 + "\nЧисло_1 является минимальным =  " + number_1);
        }

        //3.Работа с числом
        System.out.println("\n3. Работа с числом.");
        int number = 18;
        if (number % 2 == 0) {
            System.out.println("Число является четным.");
        } else {
            System.out.println("Число является нечетным.");
        }
        if (number > 0) {
            System.out.println("Число является положительным.");
        } else {
            System.out.println("Число является отрицательным.");
        }
        if (number == 0) {
            System.out.println("Число является нулём.");
        } else {
            System.out.println("Число не является нулём.");
        }    

        //4.Поиск общей цифры в числах
        System.out.println("\n4. Поиск общей цифры в числах.");
        int a = 759;
        int b = 353;
        int c;
        int d;
        int e;
        if ((d = ((a / 100) % 10)) == ((b / 100) % 10)) {
            System.out.println("Цифры из разряда сотен одинаковые равны " + d);
        }    
        if ((c = ((a / 10) % 10)) == ((b / 10) %10)){
            System.out.println("Цифры из разряда десятков одинаковые равны " + c);
        }     
        if ((e = a % 10) == (b % 10)) {
            System.out.println("Цифры из разряда единиц одинаковые равны " + e + "\n");
        }

        //5.Определение буквы или символа по их коду
        System.out.println("\n5. Определение буквы или символа по их коду.");
        char element = '\u005A';
        element = (char)'\u005A';
        System.out.println("В таблице символов unicode \'\\u005A\' является буквой " + element + "\n");

       //6.Определение суммы вклада и начисленных банком %
        System.out.println("\n6. Определение суммы вклада и начисленных банком %.");
        int interestRate; // процентная ставка (% годовых)
        int depositAmount = 300000; // сумма вклада
        int accruedInterestPerYear; // доход % по вкладу за год
        int accruedInterestTotal; // суммарный доход по вкладу
        if (depositAmount < 100000){
            interestRate = 5;
            accruedInterestPerYear = ((depositAmount * interestRate) / 100);
            accruedInterestTotal = depositAmount + accruedInterestPerYear; 
            System.out.println("Cумму вклада = " + depositAmount + "\nHачисленные % = " + accruedInterestPerYear
                    + "\nИтоговая сумму с % = " + accruedInterestTotal);
        }
        if (depositAmount <= 300000) {
            interestRate = 7;
            accruedInterestPerYear = ((depositAmount * interestRate) / 100);
            accruedInterestTotal = depositAmount + accruedInterestPerYear;
            System.out.println("Cумму вклада = " + depositAmount + "\nHачисленные % = " + accruedInterestPerYear
                    + "\nИтоговая сумму с % = " + accruedInterestTotal);
        }
        if ( depositAmount > 300000){
            interestRate = 10;
            accruedInterestPerYear = ((depositAmount * interestRate) / 100);
            accruedInterestTotal = depositAmount + accruedInterestPerYear;
            System.out.println("Cумму вклада = " + depositAmount + "\nHачисленные % = " + accruedInterestPerYear
                    + "\nИтоговая сумму с % = " + accruedInterestTotal );
        }  
        
        //7.Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам.");
        int interestOnHistory = 59;
        int interestOnProgramming = 91;
        if (interestOnHistory > 91 ){
            System.out.println("5 оценка по истории");
        } else if (interestOnHistory > 73 ){
            System.out.println("4 оценка по истории");
        } else if (interestOnHistory > 60 ){
            System.out.println("3 оценка по истории");
        } else {
            System.out.println("Студент не сдал историю");
        }
        if (interestOnProgramming > 91){
            System.out.println("5 оценка по программированию");
        } else if (interestOnProgramming> 73){
            System.out.println("4 оценка по программированию");
        } else if (interestOnProgramming > 60){
            System.out.println("3 оценка по программированию");
        } else {
            System.out.println("Студент не сдал программирование");
        }
        System.out.println("Средний бал по предмету равен " + (4 / 1));
        System.out.println("Средний % по предмету равен " + (91 / 4));
        
        //8.Расчет прибыли (убытка)
        System.out.println("\n8. Расчет прибыли (убытка).");
        final int year = 12; // в году 12 месяцев
        int rentalRoomMonth = 5000; //аренда помещения в месяц
        int salesPerMonth = 15000; // продажа товара в месяц
        int costOfGoodsMonth  = 9000; //себестоимость товара в месяц
        int profit = (salesPerMonth - costOfGoodsMonth - rentalRoomMonth) * year ;
        if (profit > 0) {
        System.out.println("+ " + profit);
        } else {
        System.out.println("- " + profit);
        }

        //9.Определение существования треугольника
        System.out.println("\n9. Определение существования треугольника.");
        int sideA = 5;
        int sideB = 5;
        int sideC = 7;
        if (sideC * sideC == sideA * sideA + sideB * sideB) {
           System.out.println("Треугольник существует");   
        } else {
           System.out.println("Треугольника с углом 90' и сторонами 5, 5 и 9 не существует");
        }

        //10.Подсчет количества банкнот
        System.out.println("\n10. Подсчет количества банкнот.");
        int amountBanknotes = 567; 
        int banknoteDenomination_50 = amountBanknotes / 50;
        int banknoteDenomination_10 = (amountBanknotes - banknoteDenomination_50 * 50) / 10;
        int banknoteDenomination_1 = (amountBanknotes - (banknoteDenomination_50 * 50) - banknoteDenomination_10 * 10);
        System.out.println("купюры наминалом по 50 - " + banknoteDenomination_50 + "шт" + "\nкупюры наминалом по 10 - " + banknoteDenomination_10 + "шт"
                + "\nкупюры по наминалом 1 - " + banknoteDenomination_1 + "шт");
        System.out.println("Сумма банкнот = " + (banknoteDenomination_50 * 50 + banknoteDenomination_10 * 10 + banknoteDenomination_1));
    }
}
