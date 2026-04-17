import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    @Test
    void givenSameFeetValues_shouldReturnTrue() {
        QuantityMeasurementApp app = new QuantityMeasurementApp();
        assertTrue(app.quantityMeasurementApp(5.0, 5.0));
    }

    @Test
    void givenDifferentFeetValues_shouldReturnFalse() {
        QuantityMeasurementApp app = new QuantityMeasurementApp();
        assertFalse(app.quantityMeasurementApp(5.0, 6.0));
    }

    @Test
    void givenZeroValues_shouldReturnTrue() {
        QuantityMeasurementApp app = new QuantityMeasurementApp();
        assertTrue(app.quantityMeasurementApp(0.0, 0.0));
    }

    @Test
    void givenNegativeValues_shouldReturnTrue() {
        QuantityMeasurementApp app = new QuantityMeasurementApp();
        assertTrue(app.quantityMeasurementApp(-2.0, -2.0));
    }
}