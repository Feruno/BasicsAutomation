package org.junit.TestJ4;

import ru.netology.CashbackHackService;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemainJ4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainZeroJ4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainJ() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainZeroJ() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
}