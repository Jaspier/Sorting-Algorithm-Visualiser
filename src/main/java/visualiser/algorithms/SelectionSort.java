package visualiser.algorithms;

/**
 * Selection Sort algorithm
 * @author Jaspier
 */
public class SelectionSort implements SortAlgoInterface{

    @Override
    public void runSortingAlgo(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int min_index = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min_index])
                    min_index = j;
            }
            //swap
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;

        }
    }
}
