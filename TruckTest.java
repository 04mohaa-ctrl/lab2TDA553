import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TruckTest {
    @Test
    public void testDrive() {
        Scania truck = new Scania();
        truck.incAngle(20);
        truck.decAngle(20);
        truck.startEngine();


    }

}
