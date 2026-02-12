public class Motorrad extends Fahrzeug {
    private boolean hatBeiwagen;

    public Motorrad(String marke, int baujahr, boolean hatBeiwagen) {
        super(marke, baujahr);
        this.hatBeiwagen = hatBeiwagen;
    }

    public boolean isHatBeiwagen() {
        return hatBeiwagen;
    }

    @Override
    public void starten() {
        System.out.println("Das Motorrad startet mit einem Knopfdruck");
    }

    @Override
    public String toString() {
        return "Motorrad{" +
                super.toString() +
                "hatBeiwagen=" + hatBeiwagen +
                '}';
    }
}
