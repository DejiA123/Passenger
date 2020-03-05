package ie.gmit;


import static org.junit.jupiter.api.Assertions. *;
import org.junit.jupiter.api.Test;


public class PassengerTest {

    Passenger myPassenger;

    @Test
    void testPassenger(){
        myPassenger = new Passenger("Pilot", "Dave", "123", "0833333333", "30");
    }

    @Test
    void testTitle()
    {
        myPassenger = new Passenger("Pilot", "Dave", "123", "0833333333", "30");
        assertEquals("Tom", myPassenger.getTitle());

    }




}
