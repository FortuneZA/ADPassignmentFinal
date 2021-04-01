package za.ac.cput.ADPassignmentFinal;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

/* Author: Mathew Fortuin - 219069514
This class is used for testing my methods

 */
class AppTest {

    private App person1;
    private App person2;
    private App person3;

    @BeforeEach
    void setUp()
    {
        person1 = new App();
        person2 = new App();
        person3 = person1;

    }

    //1) ObjectEquality

    @Test


    public void testObjectEquality()  // == Shallow Comparison
    {
        assertSame(person1,person3);
    }

    //2) ObjectIdentity

    @Test
    public void testObjectIdentity()
    {
        assertEquals(person1,person3); // .equals Deep comparison
    }

    //3) FailingTest
    @Test
    public void failingTest()
    {
        assertSame(person1,person2);
    }

    //4)Timeout

    @Test
    @Timeout(10)
    public void timeOut()
    {
        while(person1 == person3);

    }

    //5 Disabling Test
//
    @Disabled("Review Parameters")
    @Test
    public void failingTest2()
    {
        assertSame(person2,person3);
    }
}