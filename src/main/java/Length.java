public class Length {
    private final double value;
    private final String unit;

    public Length(double val, String unit) {
        this.value = val;
        this.unit = unit;
    }

    public Length as(String u) {
        Unit unit = stringToUnit(u);
        return temp_as(u, unit);
    }

    private Unit stringToUnit(String u) {
        if (isInch(u)) {
            return Unit.INCH;
        } else if (isFoot(u)) {
            return Unit.FOOT;
        } else if (isYard(u)) {
            return Unit.YARD;
        }
        return null;
    }

    public Length temp_as(String u, Unit unit) {
        if (isFoot(this.unit)) {
            if (unit == Unit.YARD) {
                return new Length(this.value / 3, u);
            } else if (unit == Unit.INCH) {
                return new Length(this.value * 12, u);
            }
        }

        if (isYard(this.unit)) {
            if (unit == Unit.INCH) {
                return new Length(this.value * 36, u);
            } else if (unit == Unit.FOOT) {
                return new Length(this.value * 3, u);
            }
        }

        if (isInch(this.unit)) {
            if (unit == Unit.FOOT) {
                return new Length(this.value / 12, u);
            } else if (unit == Unit.YARD) {
                return new Length(this.value / 36, u);
            }
        }

        return this;
    }

    private boolean isYard(String u) {
        return u.equals("yard");
    }

    private boolean isFoot(String u) {
        return u.equals("f");
    }

    private boolean isInch(String u) {
        return u.equals("inch");
    }

    public double getValue() {
        return this.value;
    }

    public String getUnit() {
        return this.unit;
    }
}
