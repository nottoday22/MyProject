package LearnJava.src;

import java.util.Scanner;

public class Main {
    private static int minIncome = 200000; // минимальная сумма на вход
    private static int maxIncome = 900000; //максимальная сумма на вход

    private static int officeRentCharge = 140000; //стоимость аренды офиса
    private static int telephonyCharge = 12000; //стоимость телефонии
    private static int internetAccessCharge = 7200; //стоимость интернета

    private static int assistantSalary = 45000; //зарплата сотрудника
    private static int financeManagerSalary = 90000; //зарплата манагера

    private static double mainTaxPercent = 0.24; //главный налоговый процент
    private static double managerPercent = 0.15; //процент манагера

    private static double minInvestmentsAmount = 100000; //минимальная инвестиция

    public static void main(String[] args) { //объявляем метод мейн
        minIncome =   (int)((minInvestmentsAmount + calculateFixedCharges() * (1 - mainTaxPercent))/ ((1 - mainTaxPercent) * (1 - managerPercent)) + 1);
        System.out.println("Минимальный доход для инвестиций: " + minIncome);

        while (true) { //пока истинно

            System.out.println("Введите сумму доходов компании за месяц " +
                "(от 200 до 900 тысяч рублей): "); // выводим это в консоль
            int income = (new Scanner(System.in)).nextInt(); //вводим число

            if (!checkIncomeRange(income)) { //проверяем число на входе, если оно вне ренжа
                continue;//то продолжаем
            }

            double managerSalary = income * managerPercent; //формула заработка менеджера
            double pureIncome = income - managerSalary -
                calculateFixedCharges(); //чистый доход
            double taxAmount = mainTaxPercent * pureIncome; // сумма налога
            double pureIncomeAfterTax = pureIncome - taxAmount; //чистая прибыль после вычета налога

            boolean canMakeInvestments = pureIncomeAfterTax >=
                minInvestmentsAmount; // булево значение, чистый доход после вычета налогов >= мин. инвест сумме

                    System.out.println("Зарплата менеджера: " + managerSalary);
            System.out.println("Общая сумма налогов: " +
                (taxAmount > 0 ? taxAmount : 0)); // выводим либо налог, либо 0
            System.out.println("Компания может инвестировать: " +
                (canMakeInvestments ? "да" : "нет")); //может ли компания инвестировать?да или нет
            if (pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!"); // если чистый доход меньше нуля, выводим это
            }
        }
    }

    private static boolean checkIncomeRange(int income) { //функция, которая на входе принимает число
        if (income < minIncome) { //если сумма на входе меньше минимальной
            System.out.println("Доход меньше нижней границы"); //пишем доход меньше нижней границы
            return false; //возвращаем ложь
        }
        if (income > maxIncome) { //если сумма больше мах
            System.out.println("Доход выше верхней границы"); // то выводим это
            return false;//возвращаем ложь
        }
        return true; // в остальных случаях возвращаем тру
    }

    private static int calculateFixedCharges() { //считаем фикс платежи по формуле
        return officeRentCharge +
            telephonyCharge +
            internetAccessCharge +
            assistantSalary +
            financeManagerSalary;
    }

}
/*
Оцениваем экономическое состояние компании.
 */
