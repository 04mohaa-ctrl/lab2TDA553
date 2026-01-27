import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {
@Test
public void testContstructor(){
    Car car = new Saab95();
    assertEquals(2,car.nrDoors);
    assertEquals(125,car.enginePower);
    assertEquals("Saab95",car.modelName);
    assertEquals(2,car.nrDoors);


    }
    @Test
    public void testCurrentSpeed(){
        Car car = new Saab95();
        car.stopEngine();
        assertEquals(0,car.getCurrentSpeed());
        car.startEngine();
        assertEquals(0.1,car.getCurrentSpeed());


    }
    @ParameterizedTest
    @CsvSource({
            "NORTH, LEFT, WEST",
            "WEST, LEFT, SOUTH",
            "SOUTH, LEFT, EAST",
            "EAST, LEFT, NORTH",
            "NORTH, RIGHT, EAST",
            "EAST, RIGHT, SOUTH",
            "SOUTH, RIGHT, WEST",
            "WEST, RIGHT, NORTH"
    })
    void turnLeftRightWorks(String startDirection, String turn, String expectedDirection) {
        Car car = new Saab95();
        car.direction = startDirection;

        if (turn.equals("LEFT")) {
            car.turnLeft();
        } else {
            car.turnRight();
        }
        assertEquals(expectedDirection, car.direction);
    }
    @Test
    public void gasTest(){
        Car car = new Saab95();
        double speed_before = car.getCurrentSpeed();
        car.gas(1);
        assertTrue(car.getCurrentSpeed() >= speed_before);
    }
    @Test
    public void breakTest(){
        Car car = new Saab95();
        car.gas(1);
        car.gas(1);
        double speed_before = car.getCurrentSpeed();
        car.brake(0.5);
        assertTrue(car.getCurrentSpeed() <= speed_before);
    }






}
