public class Length {
    private final double value;
    private final Unit temp_unit;

    public Length(double val, Unit unit) {
        this.value = val;
        this.temp_unit = unit;
    }

    public Length as(Unit unit) {
        if (this.temp_unit == Unit.FOOT) {
            if (unit == Unit.YARD) {
                return new Length(this.value / 3, unit);
            } else if (unit == Unit.INCH) {
                return new Length(this.value * 12, unit);
            }
        }

        if (this.temp_unit == Unit.YARD) {
            if (unit == Unit.INCH) {
                return new Length(this.value * 36, unit);
            } else if (unit == Unit.FOOT) {
                return new Length(this.value * 3, unit);
            }
        }

        if (this.temp_unit == Unit.INCH) {
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

    public Unit getTempUnit() {
        return temp_unit;
    }
}
