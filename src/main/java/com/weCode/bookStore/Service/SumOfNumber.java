package com.weCode.bookStore.Service;

import java.util.HashSet;

public class SumOfNumber {
    public boolean SumPairExists(int[] arrayValues, int key) {
        HashSet set = new HashSet();
        for(int i =0; i< arrayValues.length; i++){
            set.add(key - arrayValues[i]);
        }
        for(int i=0; i< arrayValues.length; i++){
            if(set.contains(arrayValues[i])){
                return true;
            }
        }
        return false;
    }
}
