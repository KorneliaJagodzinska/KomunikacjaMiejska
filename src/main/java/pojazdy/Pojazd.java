package pojazdy;

public abstract class Pojazd {
    protected double predkoscMaksymalna;

    public Pojazd(double predkoscMaksymalna) {
        this.predkoscMaksymalna = predkoscMaksymalna;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "predkoscMaksymalna=" + predkoscMaksymalna +
                '}';
    }
}
