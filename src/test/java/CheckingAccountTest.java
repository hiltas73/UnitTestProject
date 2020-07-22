import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {

    CheckingAccount checkingAccount;
    private static int count;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Count:" + count++);
    }

    @BeforeEach
    void setUp() {
        checkingAccount = new CheckingAccount();
        checkingAccount.setInfo(100, 123457L, "Ozzy");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Count:" + count++);
    }

    @AfterAll
    static void afterAll() {
        System.out.println("This executes after any test cases.Count:" + count++);
    }

    @Test
    void deposit() {
        assertEquals(200, checkingAccount.deposit(100));
    }

    @Test
    void withdraw() {
        assertEquals(80, checkingAccount.withdraw(20));
    }
    @Test
    void withdraw_branch(){
        assertThrows(RuntimeException.class,()-> {
            checkingAccount.withdraw_branch(600,false);
        });
    }

    @Test
    void purchase() {
        assertEquals(-65, checkingAccount.purchase("Shoes", 130));
    }
}