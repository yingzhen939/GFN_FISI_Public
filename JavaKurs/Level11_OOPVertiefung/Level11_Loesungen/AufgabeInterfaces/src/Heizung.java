public class Heizung implements Temperierbar {
    private String name;
    private int temperatur;

    public Heizung(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setzeTemperatur(int t) {
        temperatur = t;
        System.out.println(name + " auf " + temperatur + "°C gesetzt");
    }
}
