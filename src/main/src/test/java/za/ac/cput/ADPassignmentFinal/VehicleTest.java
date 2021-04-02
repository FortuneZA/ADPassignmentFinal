package za.ac.cput.ADPassignmentFinal;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Vehicle object1;
    private Vehicle object2;
    private Vehicle object3;

    @BeforeEach
    void setUp() {
        object1 = new Vehicle("sedan","suv");
        object2 = new Vehicle("sedan","suv");
        object3 = object2;
    }
    @Test()
    void testIdentify (){
        assertSame(object3, object2); //expecting a true value. If objects arent the same then the test has failed

    }

    @Test
    void testEquality(){
        assertEquals(object2,object3);
    }
    @Test

    void testToFail(){

        if(object3 != object2) {
            fail("test has been failed.");
        }else
        {
            assertEquals(object2,object3);
        }
    }

    @Test
    void testDisable(){
        Assumptions.assumeFalse(object3 == object2);
    }
}