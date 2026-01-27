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
    @CsvSource({"EAST", "NORTH", "WEST", "SOUTH"})
    public void testMove(){
        Car car = new Saab95();
        car.turnLeft();
        car.turnLeft();
        assertEquals("NORTH",car.direction);
    }
}
