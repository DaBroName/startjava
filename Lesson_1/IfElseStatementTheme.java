public class IfElseStatementTheme {
    public static void main (String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java.");
        int age = 22;
        boolean isMale = true;
        float heights = 1.54f;
        char firstLetterOfName;
        if (age > 20) {
            System.out.println("Твой возраст соответствует требованиям:");
        } else {
            System.out.println("Ты еще слишком юн...");
        }
        if (!isMale) {
            System.out.println("Вход запрещен. Только для мужчин.");
        } else {
            System.out.println("Вход разрешен. Проходи!");
        }
        if (heights < 1.80) {
            System.out.println("Спокойно проходи!!");
        } else {
            System.out.println("Пригнитесь!!");
        }
        firstLetterOfName = "Михаил".charAt(0);
        if (firstLetterOfName == 'М') {
            System.out.println("Михаил, мы тебя ждали!");
        } else if (firstLetterOfName == 'I') {
            System.out.println(".вызываю охрану.");
        } else {
            System.out.println("ERROR");
        }

        System.out.println("\n2. Поиск max и min числа.");
        int num1 = 28_384;
        int num2 = 145;
        if (num1 == num2) {
            System.out.println("Числа равны.");
        } else if (num1 > num2) {
            System.out.println("Первое число больше второго. Это число: " + num1);
        } else {
            System.out.println("Второе число больше первого. Это число: " + num2);
        }

        System.out.println("\n3. Проверка числа.");
        int num3 = -12_456;
        if ( num3 != 0) {
            if (num3 > 0) {
                System.out.println("Число положительное.");
            } if (num3 < 0) {
                System.out.println("Число отрицательное.");
            } if (num3 % 2 == 0) {
                System.out.println("Число четное.");
            } if (num3 % 2 != 0) {
                System.out.println("Число нечетное");
            }
        } else {
            System.out.println("Число равно нулю.");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num4 = 357;
        int num5 = 254;
        int num4_hundred = num4 / 100;
        int num5_hundred = num5 / 100;
        int num4_ten = num4 / 10 % 10;
        int num5_ten = num5 / 10 % 10;
        int num4_one = num4 % 10;
        int num5_one = num5 % 10;
        boolean identicalHundreds = (num4_hundred == num5_hundred);
        boolean identicalTens = (num4_ten == num5_ten);
        boolean identicalOnes = (num4_one == num5_one);
        if (identicalHundreds || identicalTens || identicalOnes) {
            System.out.println("Исходные числа: " + num4 + " и " + num5);
            if (identicalHundreds) {
                System.out.print("Одинаковые цифры в разрядах: ");
                System.out.println(num4_hundred + " и " + num5_hundred);
                System.out.println("Номер разряда: 3");
            }
            if (identicalTens) {
                System.out.print("Одинаковые цифры в разрядах: ");
                System.out.println(num4_ten + " и " + num5_ten);
                System.out.println("Номер разряда: 2");
            }
            if (identicalOnes) {
                System.out.print("Одинаковые цифры в разрядах: ");
                System.out.println(num4_one + " и " + num5_one);
                System.out.println("Номер разряда: 1");
            }
        } else {
            System.out.println("Равных цифр нет.");
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbolW = '\u0057';
        if (((int) symbolW >= 65 & (int) symbolW <= 90) || ((int) symbolW >= 97 & 
                (int) symbolW <= 122)) {
            System.out.println("Этот символ - код буквы");
        } else if ((int) symbolW >= 48 & (int) symbolW <= 57) {
            System.out.println("Этот символ - код цифры");
        } else {
            System.out.println("Этот символ - другой код");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        double depositAmount = 301_000;
        double totalSum = 0;
        double accruedExpense = 0;
        if (depositAmount < 100_000) {
            totalSum = depositAmount * 1.05;
        }
        else if (depositAmount > 100_000 && depositAmount < 300_000) {
            totalSum = depositAmount * 1.07;
        }
        else if (depositAmount > 300_000) {
            totalSum = depositAmount * 1.1;
        }
        accruedExpense = totalSum - depositAmount;
        System.out.println("Сумма вклада: " + depositAmount);
        System.out.println("Начисленный %: " + accruedExpense);
        System.out.println("Итоговая сумму с %: " + totalSum);

        System.out.println("\n7. Определение оценки по предметам");
        double rateHistory = 0; // оценка по истории
        double rateCoding = 0; // оценка по программированию
        double finalPercentageHistory = 59; // % по предмету
        double finalPercentageCoding = 92;
        if (finalPercentageHistory <= 60) {
            rateHistory = 2;
        } else if (finalPercentageHistory > 60 && finalPercentageHistory <= 73) {
            rateHistory = 3;
        } else if (finalPercentageHistory > 73 && finalPercentageHistory <= 91) {
            rateHistory = 4;
        } else if (finalPercentageHistory > 91) {
            rateHistory = 5;
        }
        if (finalPercentageCoding <= 60) {
            rateCoding = 2;
        } else if (finalPercentageCoding > 60 && finalPercentageCoding <= 73) {
            rateCoding = 3;
        } else if (finalPercentageCoding > 73 && finalPercentageCoding <= 91) {
            rateCoding = 4;
        } else if (finalPercentageCoding > 91) {
            rateCoding = 5;
        }
        System.out.println("История, оценка: " + (int) rateHistory);
        System.out.println("Программирование, оценка: " + (int) rateCoding);
        System.out.println("Средний балл оценок по предметам: " + (rateHistory + rateCoding) / 2);
        System.out.println("Средний % по предметам: " + (finalPercentageHistory + finalPercentageCoding) / 2);

        System.out.println("\n8. Расчет прибыли за год");
        int roomRental = 5_000;
        int goodsSold = 13_000;
        int productionCost = 9_000;
        int annualProfit = 0;
        annualProfit = ((goodsSold - roomRental - productionCost) * 12) / 1000;
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit + " 000 руб.");
        } else if (annualProfit < 0) {
            System.out.println("Прибыль за год: " + annualProfit + " 000 руб.");
        } else {
            System.out.println("Прибыль за год: 0 руб.");
        }
    }
}