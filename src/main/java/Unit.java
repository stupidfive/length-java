abstract public class Unit {
    static Unit INCH = new UnitInch();
    static Unit FOOT = new UnitFoot();
    static Unit YARD = new UnitYard();

    public abstract int rateToInch();

    public double rateTo(Unit unit) {
        return 1.0 * this.rateToInch() / unit.rateToInch();
    }
}
