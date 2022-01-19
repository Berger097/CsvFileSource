package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.bonus.BonusService;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv",delimiter = '|')
    void test(long expected, long amount ,boolean registred) {

        assertEquals(expected, BonusService.calculate(amount, registred));
    }




}