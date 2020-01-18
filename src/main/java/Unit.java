abstract public class Unit {
    static final Unit INCH = new UnitInch();
    static final Unit FOOT = new UnitFoot();
    static final Unit YARD = new UnitYard();

    public abstract double rateToInch();

    public double rateTo(Unit unit) {
        return 1.0 * this.rateToInch() / unit.rateToInch();
    }
}
