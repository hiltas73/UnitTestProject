import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add(){
        int actual = Calculator.add(2,8);
        assertEquals(10,actual);
    }

    @Test
    void testCase1() {
        assertEquals(20,20);
    }
    @Test
    void testCase2() {
        boolean result = Calculator.add(2,3)==5;
        assertTrue(result);

        assertTrue(Calculator.operator.equals("add"));
    }
    @Test
    void testCase3() {
        //test will pass
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});
        //test will NOT pass
        assertArrayEquals(new int[]{1,2,3,4}, new int[]{1,2,3});
        //test will NOT pass
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,3,2});
    }
    @Test
    void testCase4() {
        String nullString = null;
        String notNullString = "Cybertek";

        //test will pass
        assertNotNull(notNullString);
        //test will NOT pass
        assertNotNull(nullString);
        //test will NOT pass
        assertNull(notNullString);

    }

    @Test
    void testCase5(){

        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();
        //Test will pass
        assertNotSame(c1,c3);
        //Test will fail
        assertNotSame(c1,c2);
        //Test will pass
        assertSame(c1,c2);
        //Test will fail
        assertSame(c1,c3);
    }

}
