public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера.");
        byte a = 5;
        short b = 11_300;
        int c = 3_400_300;
        long d = 2_147_483_648_808L;
        float e = 99.88F;
        double f = 1205.45;
        char g = 'H';
        boolean h = true;
        System.out.println("Тип процессора = " + "Intel i" + a);
        System.out.println("Модель процессора = " + b + g);
        System.out.println("Модель материнской платы = " + "Asus " + c);
        System.out.println("Серийный номер материнской платы = " + d);
        System.out.println("Текущая скорость шины = " + e + " MHz");
        System.out.println("Текущая скорость ядра = " + f + " MHz");
        System.out.println("Исправна = " + h);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penCost = 100; // стоимость ручки
        int bookCost = 200; // стоимость книги
        byte discount = 11; // скидка на товары в %
        int totalCost = penCost + bookCost;
        float discountAmount = totalCost * (discount / 100); // сумма скидки
        float discountPrice = totalCost - discountAmount; //цена со скидкой
        System.out.println("Общая стоимость товаров без скидки = " + totalCost);
        System.out.println("Сумма скидки = " + discountAmount);
        System.out.println("Общая стоимость товаров со скидкой = " + discountPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   " + "J" + "    " + "a" + "  " + "v" + "     " + "v" + "  " + "a");
        System.out.println("   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte l = 127;
        short m = 32_767;
        int n = 2_147_483_647;
        long o = 9_223_372_036_854_775_807l;
        System.out.println("byte: " + l + ", " + (l + 1) + ", " + (l - 1));
        System.out.println("short: " + m + ", " + (m + 1) + ", " + (m - 1));
        System.out.println("int: " + n + ", " + (n + 1) + ", " + (n - 1));
        System.out.println("long: " + o + ", " + (o + 1) + ", " + (o - 1));

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int num3;
        System.out.println("Исходные значения переменных: \n" + "Первая переменная = " + num1 + 
            " , " + "вторая переменная = " + num2);
        System.out.println("Перестановка значений с помощью третьей переменной:");
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Первая переменная = " + num1 + " , " + "вторая переменная = " + num2);
        System.out.println("С помощью арифметических операций:");
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Первая переменная = " + num1 + " , " + "вторая переменная = " + num2);
        System.out.println("С помощью побитовой операции:");
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Первая переменная = " + num1 + " , " + "вторая переменная = " + num2);

        System.out.println("\n6. Вывод символов и их кодов.");
        char symbolNumber = '#';
        char symbolAmpersand = '&';
        char symbolAtSign = '@';
        char symbolCaret = '^';
        char symbolUnderscore = '_';
        System.out.println((int) symbolNumber + " = " + symbolNumber);
        System.out.println((int) symbolAmpersand + " = " + symbolAmpersand);
        System.out.println((int) symbolAtSign + " = " + symbolAtSign);
        System.out.println((int) symbolCaret + " = " + symbolCaret);
        System.out.println((int) symbolUnderscore + " = " + symbolUnderscore);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        // символ косой черты, слэш
        char slash = 47;
        // символ косой черты, обратный слэш
        char reverseSlash = 92;
        // символ нижнего подчеркивания
        char underscore = 95;
        // открывающая скобка
        char openParenthesis = 40;
        // закрывающая скобка
        char closingParenthesis = 41;
        System.out.println("     " + slash + reverseSlash);
        System.out.println("    " + slash + "  " + reverseSlash);
        System.out.println("   " + slash + "" + underscore + "" + openParenthesis + " " + 
            closingParenthesis + "" + reverseSlash);
        System.out.println("  " + slash + "      " + reverseSlash);
        System.out.println(" " + slash + underscore + underscore + underscore + underscore + 
            slash + reverseSlash + underscore + underscore + reverseSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int srcNum = 123;
        int x = srcNum / 100;
        int y = srcNum / 10 % 10;
        int z = srcNum % 10;
        int sum = x + y + z;
        int multiply = x * y * z;
        System.out.println("Число N содержит:");
        System.out.println(x + " сотню");
        System.out.println(y + " десятка");
        System.out.println(z + " единицы");
        System.out.println("Сумма его цифр = " + sum);
        System.out.println("Произведение = " + multiply);

        System.out.println("\n9. Вывод времени");
        int allSeconds = 86399;
        int hh = allSeconds / 3600;
        int mm = (allSeconds - (hh * 3600)) / 60;
        int cc = (allSeconds - (hh * 3600)) - (mm * 60);
        System.out.println(hh + ":" + mm + ":" + cc);
    }
}