package visualiser.algorithms;

import visualiser.Sort;

/**
 * Selection Sort algorithm
 * @author Jaspier
 */
public class SelectionSort implements SortAlgoInterface{

    @Override
    public void runSortingAlgo(Sort array) {
        int len = array.Size();
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (array.getValue(j) < array.getValue(minIndex)) {
                    minIndex = j;
                }
            }
            array.swap(i, minIndex, 40);
        }
    }

    @Override
    public String getName() {
        return "Selection Sort";
    }

    @Override
    public long getDelay() {
        return 40;
    }
}

