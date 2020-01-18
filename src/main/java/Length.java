public class Length {
    private final double value;
    private final String unit;

    public Length(double val, String u) {
        this.value = val;
        this.unit = u;
    }

    public Length(double val, Unit unit) {
        this.value = val;
        this.unit = unitToString(unit);
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
        if (isFoot(this.unit)) {
            if (unit == Unit.YARD) {
                return new Length(this.value / 3, unit);
            } else if (unit == Unit.INCH) {
                return new Length(this.value * 12, unit);
            }
        }

        if (isYard(this.unit)) {
            if (unit == Unit.INCH) {
                return new Length(this.value * 36, unit);
            } else if (unit == Unit.FOOT) {
                return new Length(this.value * 3, unit);
            }
        }

        if (isInch(this.unit)) {
            if (unit == Unit.FOOT) {
                return new Length(this.value / 12, unit);
            } else if (unit == Unit.YARD) {
                return new Length(this.value / 36, unit);
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
