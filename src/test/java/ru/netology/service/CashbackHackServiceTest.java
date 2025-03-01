package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {



    @Test
    public void remain(){
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(expected,actual);
    }


    @Test
    public void remain2(){
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected,actual);
    }


    @Test
    public void remain3(){
        CashbackHackService service = new CashbackHackService();

        int expected = 900;
        int actual = service.remain(1100);

        Assert.assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    public void JUnit5remainTest(){
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    public void JUnit5remainTest2(){
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    public void JUnit5remainTest3(){
        CashbackHackService service = new CashbackHackService();

        int expected = 900;
        int actual = service.remain(1100);

        Assert.assertEquals(expected,actual);
    }
}