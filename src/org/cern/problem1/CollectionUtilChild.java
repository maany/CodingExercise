package org.cern.problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/**
 * This class extends functionality of ${@Link CollectionUtil}.
 * The following methods are introduced :
 * <ul>
 * <li> ${@Link CollectionUtilChild.findDuplicatedMethods} </li>
 * </ul>
 **/
public class CollectionUtilChild {
    private final static Logger logger = Logger.getLogger(CollectionUtilChild.class.getName());

    /**
     * Detects duplicate elements in a ${@link java.util.List} containing elements of generic type T.
     * p.s. T should implement the ${@link Comparable} interface and override the ${@link Comparator.equals(Object)} method.
     *
     * @param src ${@Link java.util.List} of objects of type T that contains duplicated elements
     * @returns ${@List java.util.List} of objects of type T containing items that were duplicated in @param src in the order that they first appeared for the first time in @param src.
     **/
    public <T extends Comparable<T>> List<T> findDuplicatedElements(List<T> src) {
        List<T> duplicates = new ArrayList<T>();
        // TODO This algo can be made to operate in nLog(n) if binary search is used instead of inner loop to find the duplicates of an element
        for (T el : src) {
            if(duplicates.contains(el)){
                continue;
            }
            int count=-1; // element is present in the list so it will be found at least once. if found more than once, it means we have a duplicate
            for(T el1:src){
                if(el1.equals(el))
                    count++;
            }
            if(count>0){
                duplicates.add(el);
            }
        if (count > 0 && !duplicates.contains(el)) {
            duplicates.add(el);
           }
        }

        logger.info("found duplicated elements for :" + src.toString());
        return duplicates;
    }
}

