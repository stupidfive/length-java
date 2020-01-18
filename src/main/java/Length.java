public class Length {
    private final double value;
    private final String unit;

    public Length(double val, String unit) {
        this.value = val;
        this.unit = unit;
    }

    public Length as(String u) {
        if (this.unit.equals("f")) {
            if (u.equals("yard")) {
                return new Length(this.value / 3, u);
            } else if (u.equals("inch")) {
                return new Length(this.value * 12, u);
            }
        }

        if (this.unit.equals("yard")) {
            if (u.equals("inch")) {
                return new Length(this.value * 36, u);
            } else if (u.equals("f")){
                return new Length(this.value * 3, u);
            }
        }

        if (this.unit.equals("inch")) {
            if (u.equals("f")) {
                return new Length(this.value / 12, u);
            } else if (u.equals("yard")) {
                return new Length(this.value / 36, u);
            }
        }

        return this;
    }

    public double getValue() {
        return this.value;
    }

    public String getUnit() {
        return this.unit;
    }
}
