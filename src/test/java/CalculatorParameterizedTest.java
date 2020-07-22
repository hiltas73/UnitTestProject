import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

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
}
