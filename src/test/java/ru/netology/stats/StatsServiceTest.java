package ru.netology.stats;


import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void calculateSum() {
        StatsService calculateSum = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = StatsService.calculateSum(managerSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void averageSalesPerYear() {
        StatsService calculateAverageSalePerYear = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = StatsService.calculateAverageSalePerYear(managerSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void numberOfMonthWithMinSales() {
        StatsService calculateNumberOfMonthWithMinSales = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = StatsService.calculateNumberOfMonthWithMinSales(managerSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void numberOfMonthWithMaxSales() {
        StatsService calculateNumberOfMonthWithMaxSales = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = StatsService.calculateNumberOfMonthWithMaxSales(managerSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void counterMonthsBelowAverage() {
        StatsService calculateMonthsBelowAverage = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = StatsService.calculateMonthsBelowAverage(managerSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void counterMonthsAboveAverage() {
        StatsService calculateMonthsAboveAverage = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = StatsService.calculateMonthsAboveAverage(managerSales);

        assertEquals(expected, actual);
    }
}