import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Form> formen = new ArrayList<>();
        formen.add(new Rechteck(4, 5));
        formen.add(new Kreis(3));

        for (Form f : formen) {
            System.out.println(f.getName() + " Fläche: " + f.berechneFlaeche());
        }
    }
}
