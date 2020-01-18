public class Length {
    private final double value;
    private final Unit unit;

    public Length(double val, Unit unit) {
        this.value = val;
        this.unit = unit;
    }

    public Length as(Unit unit) {
        if (this.unit == Unit.FOOT) {
            if (unit == Unit.YARD) {
                return new Length(this.value / 3, unit);
            } else if (unit == Unit.INCH) {
                return new Length(this.value * 12, unit);
            }
        }

        if (this.unit == Unit.YARD) {
            if (unit == Unit.INCH) {
                return new Length(this.value * 36, unit);
            } else if (unit == Unit.FOOT) {
                return new Length(this.value * 3, unit);
            }
        }

        if (this.unit == Unit.INCH) {
            if (unit == Unit.FOOT) {
                return new Length(this.value / 12, unit);
            } else if (unit == Unit.YARD) {
                return new Length(this.value / 36, unit);
            }
        }

        return this;
    }

    public double getValue() {
        return this.value;
    }

    public Unit getUnit() {
        return unit;
    }
}
