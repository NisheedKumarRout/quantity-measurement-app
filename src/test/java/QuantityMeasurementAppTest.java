import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    @Test
    void testFeetToFeet_sameValue() {
        QuantityMeasurementApp app = new QuantityMeasurementApp();
        assertTrue(app.quantityMeasurementApp(1.0, 1.0, "feet", "feet"));
    }

    @Test
    void testInchToInch_sameValue() {
        QuantityMeasurementApp app = new QuantityMeasurementApp();
        assertTrue(app.quantityMeasurementApp(12.0, 12.0, "inch", "inch"));
    }

    @Test
    void testFeetToInch_equivalent() {
        QuantityMeasurementApp app = new QuantityMeasurementApp();
        assertTrue(app.quantityMeasurementApp(1.0, 12.0, "feet", "inch"));
    }

    @Test
    void testInchToFeet_equivalent() {
        QuantityMeasurementApp app = new QuantityMeasurementApp();
        assertTrue(app.quantityMeasurementApp(12.0, 1.0, "inch", "feet"));
    }

    @Test
    void testDifferentValues() {
        QuantityMeasurementApp app = new QuantityMeasurementApp();
        assertFalse(app.quantityMeasurementApp(1.0, 2.0, "feet", "feet"));
    }

    @Test
    void testNullComparison() {
        QuantityMeasurementApp app = new QuantityMeasurementApp();
        assertFalse(new QuantityMeasurementApp().new Quantity(1.0,
                QuantityMeasurementApp.LengthUnit.FEET).equals(null));
    }
}