package visualiser.algorithms;

import visualiser.Sort;

/**
 * Insertion Sort algorithm
 * @author Jaspier
 */
public class InsertionSort implements SortAlgoInterface {

    @Override
    public void runSortingAlgo(Sort array) {
        for (int i = 0; i < array.Size(); i++) {
            int key = array.getValue(i);
            int j = i - 1;
            while (j >= 0 && array.getValue(j) > key) {
                array.updateSingle(j + 1, array.getValue(j), 5);
                j--;
            }
            array.updateSingle(j + 1, key, 2);
        }
    }

    @Override
    public String getName() {
        return "Insertion Sort";
    }

    @Override
    public long getDelay() {
        return 2;
    }
}
