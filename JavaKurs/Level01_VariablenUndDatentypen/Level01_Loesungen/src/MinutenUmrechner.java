public class MinutenUmrechner {
    // Rechnet eine Gesamtzahl von Minuten in Stunden und Minuten um
    public static void main(String[] args) {
        int minutenGesamt = 135;
        int stunden = minutenGesamt / 60;
        int minuten = minutenGesamt % 60;

        System.out.println(minutenGesamt + " Minuten entsprechen " + stunden + " Stunden und " + minuten + " Minuten.");
    }
}
