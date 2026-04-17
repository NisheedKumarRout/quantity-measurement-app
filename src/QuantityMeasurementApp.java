public class QuantityMeasurementApp {

    // Method for Feet equality
    public boolean quantityMeasurementApp(double value1, double value2, String unit) {
        if (unit.equalsIgnoreCase("feet")) {
            Feet f1 = new Feet(value1);
            Feet f2 = new Feet(value2);
            return f1.equals(f2);
        } else if (unit.equalsIgnoreCase("inches")) {
            Inches i1 = new Inches(value1);
            Inches i2 = new Inches(value2);
            return i1.equals(i2);
        }
        return false;
    }

    // Inner class for Feet
    static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Feet feet = (Feet) obj;
            return Double.compare(feet.value, value) == 0;
        }
    }

    // Inner class for Inches
    static class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Inches inches = (Inches) obj;
            return Double.compare(inches.value, value) == 0;
        }
    }
}