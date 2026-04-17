import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    @Test
    void givenSameFeetValues_shouldReturnTrue() {
        QuantityMeasurementApp app = new QuantityMeasurementApp();
        assertTrue(app.quantityMeasurementApp(5.0, 5.0, "feet"));
    }

    @Test
    void givenDifferentFeetValues_shouldReturnFalse() {
        QuantityMeasurementApp app = new QuantityMeasurementApp();
        assertFalse(app.quantityMeasurementApp(5.0, 6.0, "feet"));
    }

    @Test
    void givenSameInchesValues_shouldReturnTrue() {
        QuantityMeasurementApp app = new QuantityMeasurementApp();
        assertTrue(app.quantityMeasurementApp(10.0, 10.0, "inches"));
    }

    @Test
    void givenDifferentInchesValues_shouldReturnFalse() {
        QuantityMeasurementApp app = new QuantityMeasurementApp();
        assertFalse(app.quantityMeasurementApp(10.0, 12.0, "inches"));
    }
}