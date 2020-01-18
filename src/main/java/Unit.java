public class Unit {
    static final Unit INCH = new Unit(1.0);
    static final Unit FOOT = new Unit(12.0);
    static final Unit YARD = new Unit(36.0);

    public final double rateToInch;

    public Unit(double rateToInch) {
        this.rateToInch = rateToInch;
    }

    public double rateTo(Unit unit) {
        return 1.0 * rateToInch / unit.rateToInch;
    }
}
