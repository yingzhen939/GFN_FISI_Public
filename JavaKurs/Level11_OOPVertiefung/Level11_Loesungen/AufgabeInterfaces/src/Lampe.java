public class Lampe implements Schaltbar {
    private String name;
    private boolean an = false;

    public Lampe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void schalteAn() {
        an = true;
        System.out.println(name + " eingeschaltet");
    }

    @Override
    public void schalteAus() {
        an = false;
        System.out.println(name + " ausgeschaltet");
    }
}
