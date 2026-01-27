import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {
@ParameterizedTest
@ValueSource(doubles = {})
    void test(){
    Car car = new Car();
    car.move();
    ;
    assertEquals(1, car.getX());

    }
}