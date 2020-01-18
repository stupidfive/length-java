public class Length {
    private final double value;
    private final Unit unit;

    public Length(double val, Unit unit) {
        this.value = val;
        this.unit = unit;
    }

    public Length as(Unit unit) {
        return new Length(value * this.unit.rateTo(unit), unit);
    }

    public double getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }
}
