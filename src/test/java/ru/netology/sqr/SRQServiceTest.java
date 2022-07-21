package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SRQServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'number in range from 100 to 300',100,300,8",
            "'number in range from 200 to 300',200,300,3",
            "'number in range from 100 to 200',100,200,5"})
    void shouldNumberSQRForNumbersFromRange(String testSRQ, int min, int max, int expected) {
        SQRService service = new SQRService();

        // вызываем целевой метод:
        int actual = service.numberSQR(min, max);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
        System.out.println(actual);
    }

}