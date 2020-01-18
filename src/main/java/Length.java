public class Length {
    private final double value;
    private final String unit;
    private final Unit temp_unit;

    public Length(double val, Unit unit) {
        this.value = val;
        this.unit = unitToString(unit);
        this.temp_unit = unit;
    }

    private String unitToString(Unit unit) {
        if (unit == Unit.INCH) {
            return "inch";
        } else if (unit == Unit.FOOT) {
            return "f";
        } else if (unit == Unit.YARD) {
            return "yard";
        }
        return "";
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
