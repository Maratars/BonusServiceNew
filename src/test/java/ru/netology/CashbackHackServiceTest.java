package ru.netology;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemainValid() {
        int amount = 500;
        int expected=500;
        CashbackHackService service=new CashbackHackService();
        int actual=service.remain(amount);
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void testRemainOver0() {
        int amount = 1;
        int expected=999;
        CashbackHackService service=new CashbackHackService();
        int actual=service.remain(amount);
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void testRemainUnderValue() {
        int amount = 999;
        int expected=1;
        CashbackHackService service=new CashbackHackService();
        int actual=service.remain(amount);
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void testRemainOverValue() {
        int amount = 1001;
        int expected=999;
        CashbackHackService service=new CashbackHackService();
        int actual=service.remain(amount);
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void testRemainInValue() {
        int amount = 1000;
        int expected=0;
        CashbackHackService service=new CashbackHackService();
        int actual=service.remain(amount);
        assertEquals(actual,expected);
    }
}