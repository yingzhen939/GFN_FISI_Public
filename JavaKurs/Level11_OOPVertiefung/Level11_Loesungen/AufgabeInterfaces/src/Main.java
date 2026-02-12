import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Schaltbare Geräte
        List<Schaltbar> schaltbareGeraete = new ArrayList<>();
        schaltbareGeraete.add(new Lampe("Schreibtischlampe"));
        schaltbareGeraete.add(new SmartKlimageraet("Klimagerät Wohnzimmer"));

        System.out.println("=== Schaltbare Geräte ===");
        for (Schaltbar g : schaltbareGeraete) {
            g.schalteAn();
            g.schalteAus();
        }

        // Temperierbare Geräte
        List<Temperierbar> temperierbareGeraete = new ArrayList<>();
        temperierbareGeraete.add(new Heizung("Heizung Schlafzimmer"));
        temperierbareGeraete.add(new SmartKlimageraet("Klimagerät Wohnzimmer"));

        System.out.println("=== Temperierbare Geräte ===");
        for (Temperierbar g : temperierbareGeraete) {
            g.setzeTemperatur(22);
        }
    }
}
