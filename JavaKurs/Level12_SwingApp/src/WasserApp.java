import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * SWING – EINFÜHRUNG IN GRAFISCHE BENUTZEROBERFLÄCHEN
 * ====================================================
 * - Swing ist ein GUI-Framework, das Teil der Java Standardbibliothek ist.
 * - Damit können Fenster, Buttons, Textfelder, Labels usw. erstellt werden.
 *
 * Aufbau einer einfachen Swing-Anwendung:
 * ---------------------------------------
 * JFrame  → das Hauptfenster
 * JPanel  → enthält und organisiert die Komponenten
 * JComponent (z. B. JButton, JLabel, JTextField) → die einzelnen Steuerelemente
 * Event Listener → reagieren auf Benutzereingaben (z. B. Mausklicks)
 */

public class WasserApp {
    public static void main(String[] args) {

        // ======== 1. Fenster/Rahmen (JFrame) ==========
        // JFrame ist das hauptfenster der Anwendung
        // Es stellt die Titelleiste bereit, den Rahmen und die Schließen-Funktion
        JFrame rahmen = new JFrame("Wasserrechner");
        rahmen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rahmen.setSize(400,180);
        rahmen.setLayout(new BorderLayout());

        //rahmen.setResizable(false);
        //rahmen.setExtendedState(JFrame.MAXIMIZED_BOTH);

        /*
         *  BORDER LAYOUT
         *
         * +-----------------------------+
         * |            NORTH            |
         * +-----------------------------+
         * | WEST |    CENTER     | EAST |
         * |      |               |      |
         * |      |               |      |
         * +-----------------------------+
         * |            SOUTH            |
         * +-----------------------------+
         *  * Erklärung:
         * - NORTH: oben, gesamte Breite
         * - SOUTH: unten, gesamte Breite
         * - WEST: links, volle Höhe zwischen NORTH und SOUTH
         * - EAST: rechts, volle Höhe zwischen NORTH und SOUTH
         * - CENTER: füllt den Raum zwischen WEST und EAST
         */


        // ======== 2. Panel (JPanel) ===========
        // JPanel ist ein Container, das Komponenten aufnehmen und anordnen kann
        // Hier wird ein Flowlayout verwendet, um Elemente nebeneinander anzuordnen
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.WHITE);

        /*
         * Komponenten werden von links nach rechts angeordnet, und brechen automatisch um, wenn kein Platz mehr ist:
         * [Label1] [Label2] [Textfeld] [Button]
         */

        // ========== 3. Komponenten ==============
        // JLabel: Anzeige von Text, nicht editierbar
        JLabel labelInfo = new JLabel("Wie viel Wasser sollte ich trinken?");
        JLabel labelWeight = new JLabel("Mein Gewicht (kg):");

        // JTextField: Eingabe zur Eingabe von Zahlen oder Text
        JTextField textfieldWeight = new JTextField(5);

        // JButton: Klickbarer Button, der Aktionen auslösen kann
        JButton buttonCalculate = new JButton("Berechnen");

        // ========= 4. Ereignisbehandlung ===========
        /*
         * ActionListener ist ein Interface, das vorschreibt, dass die Methode
         * actionPerformed(ActionEvent e) implementiert werden muss.
         *
         * Jede Klasse, die ActionListener implementiert, muss also mindestens
         * diese eine Methode bereitstellen.
         *
         * Hier wird direkt eine kleine Klasse an dieser Stelle erstellt,
         * die nur diese Methode enthält, um den Code beim Button zu belassen.
         *
         * Swing ruft actionPerformed automatisch auf, sobald der Button geklickt wird.
         */
//        KlasseMitActionListener klasse = new KlasseMitActionListener();
//        buttonCalculate.addActionListener(klasse);



        buttonCalculate.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    // Gewicht aus dem Textfeld auslesen
                    double weight = Double.parseDouble(textfieldWeight.getText());

                    // Einfache Berechnung des Wasserbedarfs
                    double waterAmount = (weight / 10) * 0.4;

                    // Nachricht für das Dialogfenster
                    String message = String.format("Kollege, du solltest heute %.1f Liter Wasser trinken!", waterAmount);

                    // JOptionPane: zeigt ein Pop-up-Fenster mit Informationen
                    // fenster -> über welchem Fenster das Dialogfeld erscheint
                    // message -> Text im Dialog
                    // Titel -> Name des Dialogfensters
                    // Typ -> Art des Dialogs (Information oder Fehler)
                    JOptionPane.showMessageDialog(rahmen, message, "Wassertipp", JOptionPane.INFORMATION_MESSAGE);

                } catch (NumberFormatException ex) {
                    // Fehlermeldung bei ungültiger Eingabe
                    JOptionPane.showMessageDialog(rahmen, "Bitte gib eine gültige Zahl ein!", "Eingabfehler", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        buttonCalculate.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    buttonCalculate.doClick();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        // ======= 5. Komponenten hinzufügen ========
        panel.add(labelInfo);
        panel.add(labelWeight);
        panel.add(textfieldWeight);
        panel.add(buttonCalculate);

        // ========== 6. Panel zum Fenster/Rahmen hinzufügen
        rahmen.add(panel, BorderLayout.CENTER);

        // ========== 7. Fenster/Rahmen anzeigen ===========
        rahmen.setVisible(true);
    }
}
