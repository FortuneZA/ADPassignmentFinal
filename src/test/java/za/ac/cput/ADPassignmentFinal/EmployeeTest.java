package za.ac.cput.ADPassignmentFinal;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private Employee employee1;
    private Employee employee2;
    private Employee employee3;

    @BeforeEach
    public void setUp() {
        employee1 = new Employee();
        employee2 = new Employee();
        employee3 = employee1;

    }
    @Test
    void testEquality(){
        assertEquals(employee1,employee3);
    }
    @Test
    void testIdentity(){
        assertSame(employee1,employee3);
    }
    @Test
    void testFail(){
        if (employee1.equals(employee2)){
            Assertions.fail("fail test");
            System.out.println("fail test");
        }
    }

    @Test
    void testTimeouts(){

        assertTimeout(Duration.ofMillis(10), () -> Thread.sleep(100));
    }

    @Test
    void timeoutNotExceeded()
    {
        assertTimeout(ofMinutes(2), () -> {
        });
    }
    @Test
    void disableTest(){
        Assumptions.assumeFalse(employee1 == employee2);
    }
}