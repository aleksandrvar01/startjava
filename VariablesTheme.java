public class  VariablesTheme {
    public static void main(String []args) {
//1. Создание переменных и вывод их значений на консоль
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte core = 4;
        short rum = 8;
        int mhz = 3500;
        long assemblyVersion = 19041;
        float smbios = 3.2f;
        double eСontVersion = 255.255d;
        char aType = 'X';
        boolean isTrue = true ; 
        System.out.println("core = " + core + "\nrum = " + rum + "\nmhz = " + mhz + "\nassemblyVersion = "+ assemblyVersion
        + "\nsmbios = " + smbios + "\neСontVersion = " + eСontVersion + "\naType = " + aType + "\nisTrue = " + isTrue+"\n" );

//2. Расчет стоимости товара со скидкой
        System.out.println("2. Расчет стоимости товара со скидкой");
        int x = 100;
        int y = 200;
        int sumDiscount = ((x+y)/100)*11;
        int sum =(x+y)- sumDiscount;
        System.out.println("Итоговая сумма товаров со скидкой равна " + sum +"руб." );
        System.out.println("Сумма скидки равна "+ sumDiscount + " руб.\n");
        
        

//3. Вывод на консоль слова JAVA 
        System.out.println("3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a"   );
        System.out.println("J  J  aaaaa  V V  aaaaa"  );
        System.out.println(" JJ  a     a  V  a     a\n");

//4. Отображение min и max значений числовых типов данных
        System.out.println("4. Отображение min и max значений числовых типов данных");
        byte num_1 = 127;
        short num_2 = 32767;
        int num_3 = 2147483647;
        long num_4 = 9223372036854775807L;
        char num_5 =(char)-1;

        System.out.println("byte = " + num_1 + "\nshort = " + num_2 + "\nint = " + num_3 + "\nlong = " + num_4 + "\nchar = "
        + (int)num_5 +"\n");
        num_1++;
        num_2++;
        num_3++;
        num_4++;
        num_5++;
        
        System.out.println("byte = " + num_1 + "\nshort = " + num_2 + "\nint = " + num_3 + "\nlong = " + num_4 + "\nchar = "
        + (int)num_5 + "\n");
        num_1--;
        num_2--;
        num_3--;
        num_4--;
        num_5--;
        
        System.out.println("byte = " + num_1 + "\nshort = " + num_2 + "\nint = " + num_3 + "\nlong = " + num_4 + "\nchar = "
        + (int)num_5 + "\n");
        
//5. Перестановка значений переменных
        System.out.println("5. Перестановка значений переменных");
        double num1 =5;
        double num2 = 9;
        double num3;
        System.out.println("num1 = "+ num1 + " " + "num2 = " + num2);
        num3=num1;
        num1=num2;
        num2=num3;
        System.out.println("num1 = "+ num1 + " " + "num2 = " + num2 + "\n");

//6. Вывод ASCII-символов и их кодов  
        System.out.println("6. Вывод ASCII-символов и их кодов"); 
        char a = 35;
        char b = 38;
        char c = 64;
        char d = 94;
        char e = 95;
        System.out.println("Десятичное значение 35 = " + a + "\nДесятичное значение 38 = " + b + "\nДесятичное значение 64 = " + c + "\nДесятичное значение 94 = " + d
        + "\nДесятичное значение 95 = " + e );

//7.Произведение и сумма цифр числа
        System.out.println("7. Произведение и сумма цифр числа");
        int number = 345;
        int number1 = number / 100;
        int number2 =(number / 10) % 10;
        int number3 = number % 10;
        System.out.println("Произведение: " + number1 * number2 * number3);
        System.out.println("Сумма: " + ( number1 + number2 + number3) + "\n");

//8.Вывод на консоль ASCII-арт Дюка
        System.out.println("8.Вывод на консоль ASCII-арт Дюка");
        char sym_1 = 47;
        char sym_2 = 92;
        char sym_3 = 95;
        char sym_4 = 40;
        char sym_5 = 41;
        System.out.println("    " + sym_1 + sym_2);
        System.out.println("   " + sym_1 + "  " + sym_2);
        System.out.println("  " + sym_1 + sym_3 + sym_4 + " " + sym_5 + sym_2);
        System.out.println(" " + sym_1 + "      " + sym_2);
        System.out.println( sym_1 + "" + sym_3 + sym_3 + sym_3 + sym_3 + sym_1 + sym_2 + sym_3  +sym_3 + sym_2);

//9. Отображение сотен, десятков, единиц числа
        System.out.println("9. Отображение сотен, десятков, единиц числа");
        int chislo = 123;
        int hundreds = chislo  / 100;
        int dozens =(chislo  / 10) % 10;
        int units = chislo  % 10;
        System.out.println("сотен = " + hundreds+ " " + "десятков = " + dozens +" " + "единиц =  " + units + "\n");

//10.Преобразование секунд
        System.out.println("10.Преобразование секунд");
        long second = 86399;
        long hours = (second -second % 3600)/3600;
        long minutes = (second % 3600 - second % 3600 % 60) / 60;
        long seconds = second % 3600 % 60;
    
        if (hours > 24) {
        System.out.print(hours % 24); 
        } else {
        System.out.print(hours);
        }
    
        System.out.print(":" + minutes);  
    
        if (seconds < 10) {
        System.out.println(":" + "0" +seconds);
        } else {
        System.out.println(":" + seconds);
        }
    }
 }
