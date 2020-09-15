package visualiser;

import javax.swing.JFrame;

/**
 * Visualiser GUI
 * @author Jaspier
 */
public class Visualiser {

    private JFrame display;
    private Sort sort;

    // Gui
    public Visualiser() {
        display = new JFrame("Sorting Algorithm Visualiser");
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        sort = new Sort();
        display.add(sort);
        sort.repaint();
    }

    public static void main(String... args) {
        Visualiser visualiser = new Visualiser();
    }
}
