package visualiser;

import visualiser.algorithms.*;

import javax.swing.JFrame;
import java.util.ArrayList;
import static util.sleep.secondsToNano;
import static util.sleep.sleepFor;

/**
 * Visualiser GUI
 * @author Jaspier
 */
public class Visualiser {
    private JFrame display;
    private Sort sort;
    private final ArrayList<SortAlgoInterface> sortingStack;

    // Gui
    public Visualiser() {
        display = new JFrame("Sorting Algorithm Visualiser");
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        sort = new Sort();
        display.add(sort);
        display.pack();
        display.setVisible(true);

        sortingStack = new ArrayList<>();
        sortingStack.add(new BubbleSort());
        sortingStack.add(new InsertionSort());
        sortingStack.add(new SelectionSort());
    }

    private void shuffle_then_sleep() {
        sort.randomiseArray();
        sort.resetColours();
        sleepFor(secondsToNano(2));
    }

    public void run() {
        for (SortAlgoInterface algo : sortingStack) {
            sleepFor(secondsToNano(1));
            shuffle_then_sleep();
            algo.runSortingAlgo(sort);
            System.out.println("ARRAY IS SORTED");
            sort.resetColours();
            sort.highlightArray();
            sort.resetColours();
        }
    }

    public static void main(String... args) {
        Visualiser visualiser = new Visualiser();
        visualiser.run();
    }
}
