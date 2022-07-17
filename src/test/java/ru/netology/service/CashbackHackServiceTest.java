package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100; // на сколько надо докупить
        int amount = 900; // на сколько купили
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0; // на сколько надо докупить
        int amount = 1000; // на сколько купили
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}