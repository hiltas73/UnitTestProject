import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class CalculatorParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"Java","Ruby","C#"})
    void testCase1(String arg){
        Assertions.assertTrue(!arg.isEmpty());
    }

    @ParameterizedTest
    @ValueSource(ints = {3,6,9})
    void testCase2(int number){
        Assertions.assertEquals(0,number%3);
    }

    @ParameterizedTest
    @EmptySource
    @NullSource
    @ValueSource(strings = {"Java","Gherkin"})
    void testCase3(String input){
        Assertions.assertTrue(input.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testCase4(String arg){
        Assertions.assertNotNull(arg);
    }

    static  String[] stringProvider(){   //method has to be static and array, iterable or Stream
        String arr[] = {"Java","JS","TS"};
        return arr;
    }

    @ParameterizedTest
    @CsvSource({
            "10,20,30",
            "20,30,50",
            "40,50,90"
    })
    void testCase5(int num1, int num2, int expected){
        Assertions.assertEquals(expected, Calculator.add(num1,num2));
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/sample-data.csv",numLinesToSkip = 1)
    void testCase6(int num1, int num2, int expected){
        Assertions.assertEquals(expected,Calculator.add(num1,num2));
        System.out.println("total = " + num1 + " + " + num2 + " = " + expected);
    }
}
