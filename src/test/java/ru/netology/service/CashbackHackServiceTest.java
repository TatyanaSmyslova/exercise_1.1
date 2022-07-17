package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain1() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100; // на сколько надо докупить
        int amount = 900; // на сколько купили
        int result = service.remain(amount);

        assertEquals(expected, result);
    }

    @Test
    public void remain2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0; // на сколько надо докупить
        int amount = 1000; // на сколько купили
        int result = service.remain(amount);

        assertEquals(expected, result);
    }
}