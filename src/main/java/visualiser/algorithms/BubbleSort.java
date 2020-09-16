package visualiser.algorithms;

import visualiser.Sort;

/**
 * Bubble Sort algorithm
 * @author Jaspier
 */
public class BubbleSort implements SortAlgoInterface{

    @Override
    public void runSortingAlgo(Sort array) {
        for (int i = 0; i < array.Size()-1; i++) {
            for (int j = 0; j < array.Size() - i - 1; j++) {
                if (array.getValue(j) > array.getValue(j + 1)) {
                    array.swap(j, j + 1, 2);
                }
            }
        }
    }

    @Override
    public String getName() {return "Bubble Sort";}

    @Override
    public long getDelay() {return 2;}
}
