public class QuantityMeasurementApp {

    // Main method
    public boolean quantityMeasurementApp(double value1, double value2, String unit1, String unit2) {
        Quantity q1 = new Quantity(value1, LengthUnit.fromString(unit1));
        Quantity q2 = new Quantity(value2, LengthUnit.fromString(unit2));
        return q1.equals(q2);
    }

    // ENUM with extended units
    enum LengthUnit {
        FEET(1.0),
        INCH(1.0 / 12.0),
        YARD(3.0),                 // 1 yard = 3 feet
        CM(0.393701 / 12.0);       // 1 cm = 0.393701 inches → convert to feet

        private final double toFeet;

        LengthUnit(double toFeet) {
            this.toFeet = toFeet;
        }

        public double toBase(double value) {
            return value * toFeet;
        }

        public static LengthUnit fromString(String unit) {
            if (unit == null) throw new IllegalArgumentException("Unit cannot be null");

            switch (unit.toLowerCase()) {
                case "feet":
                    return FEET;
                case "inch":
                case "inches":
                    return INCH;
                case "yard":
                case "yards":
                    return YARD;
                case "cm":
                case "centimeter":
                case "centimeters":
                    return CM;
                default:
                    throw new IllegalArgumentException("Invalid unit: " + unit);
            }
        }
    }

    // Generic Quantity class (unchanged from UC3)
    static class Quantity {
        private final double value;
        private final LengthUnit unit;

        public Quantity(double value, LengthUnit unit) {
            if (unit == null) throw new IllegalArgumentException("Unit cannot be null");
            this.value = value;
            this.unit = unit;
        }

        private double toFeet() {
            return unit.toBase(value);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Quantity other = (Quantity) obj;

            return Double.compare(this.toFeet(), other.toFeet()) == 0;
        }
    }
}