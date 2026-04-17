@Test
void testYardToFeet() {
    QuantityMeasurementApp app = new QuantityMeasurementApp();
    assertTrue(app.quantityMeasurementApp(1.0, 3.0, "yard", "feet"));
}

@Test
void testYardToInches() {
    QuantityMeasurementApp app = new QuantityMeasurementApp();
    assertTrue(app.quantityMeasurementApp(1.0, 36.0, "yard", "inch"));
}

@Test
void testCmToInches() {
    QuantityMeasurementApp app = new QuantityMeasurementApp();
    assertTrue(app.quantityMeasurementApp(1.0, 0.393701, "cm", "inch"));
}

@Test
void testCmToFeetFalse() {
    QuantityMeasurementApp app = new QuantityMeasurementApp();
    assertFalse(app.quantityMeasurementApp(1.0, 1.0, "cm", "feet"));
}

@Test
void testMultiUnitTransitive() {
    QuantityMeasurementApp app = new QuantityMeasurementApp();
    assertTrue(app.quantityMeasurementApp(2.0, 6.0, "yard", "feet"));
    assertTrue(app.quantityMeasurementApp(6.0, 72.0, "feet", "inch"));
}