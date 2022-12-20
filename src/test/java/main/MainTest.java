package main;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void test1() {
        Main main1 = new Main();
        int actual = main1.calculate(5);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void test2() {
        Main main2 = new Main();
        int actual = main2.calculate(4);
        int expected = 16;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void test3() {
        Main main3 = new Main();
        int actual = main3.calculate(2);
        int expected = 4;
        assertEquals(expected, actual);
    }
}