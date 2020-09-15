package visualiser;

import visualiser.algorithms.BubbleSort;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Sort extends JPanel {
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    private static final int BAR_WIDTH = 5;
    private static final int NUM_BARS = WIDTH / WIDTH;

    private int[] array;

    public Sort() {
    array = new int[NUM_BARS];
    for (int i = 0; i < NUM_BARS; i++) {
        array[i] = i;
        }
    shuffle();

    setBackground(Color.BLACK);

    new BubbleSort().runSortingAlgo(array);
    }

    private void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < NUM_BARS; i++) {
            int swap = rand.nextInt(NUM_BARS - 1);
            int temp = array[i];
            array[i] = array[swap];
            array[swap] = temp;
        }
    }

    /**
     * Draws array
     * @param g Graphics pointer for drawing
     */
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D graphics = (Graphics2D)g;
        super.paintComponent(graphics);

        graphics.setColor(Color.GREEN);
        for (int i = 0; i < NUM_BARS; i++) {
            int height = array[i] * 3;
            int xStart = i + (BAR_WIDTH - 1) * i;
            int yStart = HEIGHT - height;

            graphics.fillRect(xStart, yStart, BAR_WIDTH, height);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(WIDTH, HEIGHT);
    }
}
