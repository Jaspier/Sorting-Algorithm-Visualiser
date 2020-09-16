package visualiser.algorithms;

import visualiser.Sort;

/**
 * Interface for the sorting algorithms
 * @author Jaspier
 */
public interface SortAlgoInterface {
    public String getName();
    public long getDelay();
    public void runSortingAlgo(Sort array);
}
