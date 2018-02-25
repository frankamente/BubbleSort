import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void bubbleSortShouldSortIfThereIsOnlyNumbers(){
        int[] messyList = new int[]{6,5,3,1,8,7,2,4};
        BubbleSort bubbleSort = new BubbleSort(messyList);

        int[] sortedListResult = bubbleSort.sort();
        int[] sortedListExpected = new int[]{1,2,3,4,5,6,7,8};

        Assert.assertArrayEquals(sortedListExpected, sortedListResult);
    }
}