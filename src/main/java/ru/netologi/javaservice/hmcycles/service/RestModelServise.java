package ru.netologi.javaservice.hmcycles.service;
public class RestModelServise {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                count++;
                money = ((money - expenses) / 3);

            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}