package org.cern.problem1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Mayank on 4/21/2017.
 */
public class CollectionUtilChildTest {
    CollectionUtilChild collectionUtilChild=null;
    public CollectionUtilChildTest(){
        collectionUtilChild=new CollectionUtilChild();
    }

    /**
     * @see CollectionUtilChild#findDuplicatedElements(List<T>)
     * @verifies utility method returns List of items that were duplicated in the source list, in the order they appeared in the source list.
     **/
    @Test
    public void findDuplicatedElementsTest(){
        //Check for List<String>
        List<String> src = new ArrayList<String>();
        String[] srcArray = {"b", "a", "c", "c", "e", "a", "c", "d", "c", "d"};
        src.addAll(Arrays.asList(srcArray));
        List<String> duplicates = collectionUtilChild.findDuplicatedElements(src);
        String[] ansArray = {"a","c","d"};
        List<String> ans = new ArrayList<String>();
        ans.addAll(Arrays.asList(ansArray));
        Assert.assertEquals(duplicates,ans);

        // Check for List<Integer>
        List<Integer> srcInt = new ArrayList<Integer>();
        Integer[] srcIntArray = {1,2,2,3,2,4,1,1,3};
        src.addAll(Arrays.asList(srcArray));
        List<Integer> duplicatesInt = collectionUtilChild.findDuplicatedElements(srcInt);
        Integer[] ansIntArray = {1,2,3};
        List<Integer> ansInt = new ArrayList<Integer>();
        ansInt.addAll(Arrays.asList(ansIntArray));
        Assert.assertEquals(duplicates,ans);
    }

}
