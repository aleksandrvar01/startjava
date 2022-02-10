public class IfElseStatementTheme {
    public static void main (String [] args) {
    	//"1. Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 18;
        if(age > 20) {
            System.out.println("Входите пожалуйста\n");
        } else {
            System.out.println("Вход для достигших 20 лет.\n");
        }
        boolean maleGender = false;
        if(!maleGender) {
            System.out.println("Вход только для девушек.\n");
        }
        double manHeight = 1.70;
        if(manHeight < 1.80) {
            System.out.println("Вам на первый ряд\n");
        } else {
            System.out.println("Вам на второй ряд\n");
        }

        char firstLetterName = "Mary".charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("Возможно её имя Mary\n");
        } else if (firstLetterName == 'I') {
            System.out.println("Возможно её имя Irina\n");
        } else {
             System.out.println("Я не угадал.\n");
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
        if (number %2 == 0) {
            System.out.println("Число является четным.");
        } else {
            System.out.println("Число является нечетным.");
        }
        if (number > 0) {
            System.out.println("Число является положительным.");
        } else if (number < 0) {
            System.out.println("Число является отрицательным.");
        } else {
            System.out.println("Число является нулём.");
        }

        //4.Поиск общей цифры в числах
        System.out.println("\n4. Поиск общей цифры в числах.");
        int a = 759;
        int b = 353;
        int c;
        if ((c = (a / 100)) == (b / 100)) {
            System.out.println("Цифры из разряда сотен одинаковые равны " + c);
        }    
        if ((c = ((a / 10) %10)) == ((b / 10) %10)) {
            System.out.println("Цифры из разряда десятков одинаковые равны " + c);
        }     
        if ((c = a %10) == (b %10)) {
            System.out.println("Цифры из разряда единиц одинаковые равны " + c);
        }

        //5.Определение буквы или символа по их коду
        System.out.println("\n5. Определение буквы или символа по их коду.");
        char symbol = '\u005A';
        if (symbol >= 'a' && symbol <= 'z' || symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Код \'\\u005A' является буквой " + symbol);
        } else if (symbol >= '0' & symbol <= '9') {
            System.out.println("Код \'\\u005A' является цифрой " + symbol);
        } else {    
            System.out.println("Код \'\\u005A' не является ни цифрой ни буквой " + symbol);
        }

       //6.Определение суммы вклада и начисленных банком %
        System.out.println("\n6. Определение суммы вклада и начисленных банком %.");
        int interestRate;
        int depositAmount = 300000;
        int accruedInterestPerYear = (depositAmount / 100);
        if (depositAmount < 100000) {
            int a1 = accruedInterestPerYear * (interestRate = 5) ;
            System.out.println("Cумму вклада = " + depositAmount + "\nHачисленные % = " +  a1
                     + "\nИтоговая сумму с % = " + (depositAmount + a1));
        }
        if (depositAmount >= 100000 & depositAmount <= 300000) {
            int a1 = accruedInterestPerYear * (interestRate = 7);
             System.out.println("Cумму вклада = " + depositAmount + "\nHачисленные % = " +  a1
                      + "\nИтоговая сумму с % = " + (depositAmount + a1));
        }
        if ( depositAmount > 300000) {
            int a1 = accruedInterestPerYear * (interestRate = 10);
            System.out.println("Cумму вклада = " + depositAmount + "\nHачисленные % = " +  a1
                     + "\nИтоговая сумму с % = " + (depositAmount + a1));
        } 
        
        //7.Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам.");
        int interestOnHistory = 59;
        int interestOnProgramming = 91;
        if (interestOnHistory > 91 ) {
            System.out.println("5 оценка по истории");
        } else if (interestOnHistory > 73 ) {
            System.out.println("4 оценка по истории");
        } else if (interestOnHistory > 60 ) {
            System.out.println("3 оценка по истории");
        } else {
            System.out.println("Студент не сдал историю");
        }
        if (interestOnProgramming > 91) {
            System.out.println("5 оценка по программированию");
        } else if (interestOnProgramming > 73) {
            System.out.println("4 оценка по программированию");
        } else if (interestOnProgramming > 60) {
            System.out.println("3 оценка по программированию");
        } else {
            System.out.println("Студент не сдал программирование");
        }
        System.out.println("Средний бал по предмету равен " + (4 / 1));
        System.out.println("Средний % по предмету равен " + (91 / 4));
        
        //8.Расчет прибыли (убытка)
        System.out.println("\n8. Расчет прибыли (убытка).");
        int year = 12;
        int rentalRoomMonth = 5000;
        int salesPerMonth = 15000;
        int costOfGoodsMonth  = 9000;
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
        int sideC = 9;
        //Формула полупериметра
        double p = (sideA + sideB + sideC) / 2;
        //Формула Герона
        double areaTriangle = (Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)));
        if (areaTriangle > 0) {
            System.out.println("Треугольник существует");   
        } else {
            System.out.println("Треугольник не существует");
        }
        
        System.out.println("|" + "\\");
        System.out.println("|" + " " + "\\");
        System.out.println("|" + "  " + "\\");
        System.out.println("|" + "   " + "\\");
        System.out.println("|" + "____" + "\\" + "_____");
        
        //10.Подсчет количества банкнот
        System.out.println("\n10. Подсчет количества банкнот.");
        int amountMoney = 567; 
        int banknoteDenomination_50 = amountMoney / 50;
        int sumBanknote50 = banknoteDenomination_50 * 50;
        int banknoteDenomination_10 = (amountMoney - sumBanknote50) / 10;
        int sumBanknote10 = banknoteDenomination_10 * 10;
        int banknoteDenomination_1 = (amountMoney - sumBanknote50 - sumBanknote10);
        System.out.println("купюры наминалом по 50 - " + banknoteDenomination_50 + "шт" + "\nкупюры наминалом по 10 -"+ banknoteDenomination_10 + "шт"
                + "\nкупюры по наминалом 1 - " + banknoteDenomination_1 + "шт");
        System.out.println("Сумма банкнот = " + (sumBanknote50 + sumBanknote10 + banknoteDenomination_1));    
    }
}