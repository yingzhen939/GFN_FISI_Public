public class Wellensittich extends Tier implements Fliegen {
    private String farbe;

    public Wellensittich(String name, String farbe) {
        super(name);
        this.farbe = farbe;
    }

    @Override
    public void geraeuschMachen() {
        System.out.println(getName() + " zwitschert: Chirp Chirp");
    }

    @Override
    public void fliegen(int meter) {
        System.out.println("Der Wellensittich fliegt " + meter + " Meter um den Park herum");
    }

    @Override
    public void stoppen() {
        Fliegen.super.stoppen();
    }
}
