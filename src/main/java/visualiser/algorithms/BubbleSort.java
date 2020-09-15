package visualiser.algorithms;

/**
 * Bubble Sort algorithm
 * @author Jaspier
 */
public class BubbleSort implements SortAlgoInterface{

    @Override
    public void runSortingAlgo(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j+1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
