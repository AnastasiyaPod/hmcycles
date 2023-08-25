package ru.netologi.javaservice.hmcycles.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestModelServiseTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/money.csv")
    public void numberOfMonth(int income, int expenses, int threshold) {
        RestModelServise service = new RestModelServise();
        int numberOfMonth = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(income, expenses, threshold);
    }
}
