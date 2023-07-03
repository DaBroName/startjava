public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера.");
        byte cpuSeries = 5;
        short cpuModel = 11_300;
        int mbModel = 3_400_300;
        long mbSerialNumber = 2_147_483_648_808L;
        float busSpeed = 99.88F;
        double coreSpeed = 1205.45;
        char cpuPrefix = 'H';
        boolean isActive = true;
        System.out.println("Тип процессора = " + "Intel i" + cpuSeries);
        System.out.println("Модель процессора = " + cpuModel + cpuPrefix);
        System.out.println("Модель материнской платы = " + "ASUS " + mbModel);
        System.out.println("Серийный номер материнской платы = " + mbSerialNumber);
        System.out.println("Текущая скорость шины = " + busSpeed + " MHz");
        System.out.println("Текущая скорость ядра = " + coreSpeed + " MHz");
        System.out.println("Исправна = " + isActive);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        float penCost = 100f;
        float bookCost = 200f;
        float discount = 11f;
        float totalCost = penCost + bookCost;
        float discountAmount = totalCost * (discount / 100);
        float discountPrice = totalCost - discountAmount;
        System.out.println("Общая стоимость товаров без скидки = " + totalCost);
        System.out.println("Сумма скидки = " + discountAmount);
        System.out.println("Общая стоимость товаров со скидкой = " + discountPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   " + "J" + "    " + "a" + "  " + "v" + "     " + "v" + "  " + "a");
        System.out.println("   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807l;
        System.out.println("byte: " + maxByte + ", " + (++maxByte) + ", " + (--maxByte));
        System.out.println("short: " + maxShort + ", " + (++maxShort) + ", " + (--maxShort));
        System.out.println("int: " + maxInt + ", " + (++maxInt) + ", " + (--maxInt));
        System.out.println("long: " + maxLong + ", " + (++maxLong) + ", " + (--maxLong));

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
        char number = '#';
        char ampersand = '&';
        char atSign = '@';
        char caret = '^';
        char underscore = '_';
        System.out.println((int) number + " = " + number);
        System.out.println((int) ampersand + " = " + ampersand);
        System.out.println((int) atSign + " = " + atSign);
        System.out.println((int) caret + " = " + caret);
        System.out.println((int) underscore + " = " + underscore);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char openParenthesis = '(';
        char closingParenthesis = ')';
        System.out.println("     " + slash + backslash);
        System.out.println("    " + slash + "  " + backslash);
        System.out.println("   " + slash + underscore + openParenthesis + closingParenthesis + 
                " " + backslash);
        System.out.println("  " + slash + "      " + backslash);
        System.out.println(" " + slash + underscore + underscore + underscore + underscore + 
                slash + backslash + underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int srcNum = 123;
        int hundred = srcNum / 100;
        int ten = srcNum / 10 % 10;
        int one = srcNum % 10;
        int sum = hundred + ten + one;
        int multiplication = hundred * ten * one;
        System.out.println("Число N содержит:");
        System.out.println(hundred + " сотню");
        System.out.println(ten + " десятка");
        System.out.println(one + " единицы");
        System.out.println("Сумма его цифр = " + sum);
        System.out.println("Произведение = " + multiplication);

        System.out.println("\n9. Вывод времени");
        int allSeconds = 86399;
        int hh = allSeconds / 3600;
        int mm = allSeconds % 3600 / 60;
        int cc = allSeconds % 60;
        System.out.println(hh + ":" + mm + ":" + cc);
    }
}