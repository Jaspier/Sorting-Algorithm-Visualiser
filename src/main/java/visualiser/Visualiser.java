package visualiser;

import javax.swing.JFrame;

/**
 * Visualiser GUI
 * @author Jaspier
 */
public class Visualiser {
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 720;

    private final JFrame display;

    // Gui
    public Visualiser() {
        display = new JFrame("Sorting Algorithm Visualiser");
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.setSize(WIDTH, HEIGHT);
        display.setVisible(true);
    }

    public static void main(String[] args) {
        Visualiser visualiser = new Visualiser();
    }
}
