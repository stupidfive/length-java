public enum Unit {
    INCH(1.0),
    FOOT(12.0),
    YARD(36.0),
    ;

    public final double rateToInch;

    Unit(double rateToInch) {
        this.rateToInch = rateToInch;
    }

    public double rateTo(Unit unit) {
        return 1.0 * rateToInch / unit.rateToInch;
    }
}
