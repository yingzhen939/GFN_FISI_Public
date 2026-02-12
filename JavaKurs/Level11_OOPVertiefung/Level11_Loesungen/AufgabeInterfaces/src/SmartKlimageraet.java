public class SmartKlimageraet implements Schaltbar, Temperierbar {
    private String name;
    private boolean an = false;
    private int temperatur;

    public SmartKlimageraet(String name) {
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

    @Override
    public void setzeTemperatur(int t) {
        temperatur = t;
        System.out.println(name + " Temperatur auf " + temperatur + "°C gesetzt");
    }
}
