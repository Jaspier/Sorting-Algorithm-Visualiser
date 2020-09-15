package visualiser.algorithms;

/**
 * Insertion Sort algorithm
 * @author Jaspier
 */
public class InsertionSort implements SortAlgoInterface {

    @Override
    public void runSortingAlgo(int[] array) {
        int key, value;

        for (int i = 1; i < array.length; i++) {
            key = i;
            value = array[key];

            while (key > 0 && value < array[key - 1]) {
                array[key] = array[key - 1]; // Larger value moves to the right
                key--;
            }
            array[key] = value;
        }
    }
}
