package visualiser;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JPanel;
import static util.sleep.millisecondsToNano;
import static util.sleep.sleepFor;

public class Sort extends JPanel {
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    private static final int BAR_WIDTH = 5;
    private static final int NUM_BARS = WIDTH / BAR_WIDTH;

    private int[] array;
    private final int[] barColours;

    public Sort() {
        setBackground(Color.PINK);
        array = new int[NUM_BARS];
        barColours = new int[NUM_BARS];
    for (int i = 0; i < NUM_BARS; i++) {
        array[i] = i;
        barColours[i] = 0;
        }
    }

    public int Size() {return array.length;}

    public int getValue(int index) {return array[index];}

    public void swap(int firstIndex, int secondIndex, long milliSecDelay) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;

        barColours[firstIndex] = 100;
        barColours[secondIndex] = 100;

        repaint();
        sleepFor(millisecondsToNano(milliSecDelay));
    }

    public void updateSingle(int index, int value, long millisecondDelay) {
        array[index] = value;
        barColours[index] = 100;
        repaint();
        sleepFor(millisecondsToNano(millisecondDelay));
    }

    public void randomiseArray() {
        Random rand = new Random();
        for (int i = 0; i < Size(); i++) {
            int swapWithIndex = rand.nextInt(Size() - 1);
            swap(i, swapWithIndex, 5);
        }
    }

    public void highlightArray() {
        for (int i = 0; i < Size(); i++) {
            updateSingle(i, getValue(i), 5);
        }
    }

    /**
     * returns canvas Size
     * @return Size
     */
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(WIDTH, HEIGHT);
    }

    public void resetColours() {
        for (int i = 0; i < NUM_BARS; i++) {
            barColours[i] = 0;
        }
        repaint();
    }

    /**
     * Draws array
     * @param g The graphics pointer for drawing
     */
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D graphics = (Graphics2D)g;
        super.paintComponent(graphics);

        graphics.setColor(Color.WHITE);
        for (int x = 0; x < NUM_BARS; x++) {
            int height = getValue(x) * 2;
            int xStart = x + (BAR_WIDTH - 1) * x;
            int yStart = HEIGHT - height;

            int val = barColours[x] * 2;
            graphics.setColor(new Color(255, 255 - val, 255 - val));
            graphics.fillRect(xStart, yStart, BAR_WIDTH, height);
            if (barColours[x] > 0) {
                barColours[x]-= 10;
            }
        }
    }
}
