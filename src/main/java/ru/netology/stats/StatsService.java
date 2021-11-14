package ru.netology.stats;


public class StatsService {
    public static int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public static int calculateAverageSalePerYear(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public static int calculateNumberOfMonthWithMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public static int calculateNumberOfMonthWithMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public static int calculateMonthsBelowAverage(int[] sales) {
        int counterMonths = 0;
        for (long sale : sales) {
            if (sale < calculateAverageSalePerYear(sales)) {
                counterMonths++;
            }
        }
        return counterMonths;
    }

    public static int calculateMonthsAboveAverage(int[] sales) {
        int counterMonths = 0;
        for (long sale : sales) {
            if (sale > calculateAverageSalePerYear(sales)) {
                counterMonths++;
            }
        }
        return counterMonths;
    }
}
