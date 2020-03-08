package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    Integer[] intArray;

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
        this.intArray = intArray;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int count = 0;
        String nonDup = "";
        int i = 0;
        Integer[] result;


        for (Integer f : intArray) {
            for (int j = 0; j < intArray.length; j++) {
                if ((f == intArray[j])) {
                    count++;
                }
            }
            if (count < maxNumberOfDuplications) {
                nonDup += f;


            }
            count = 0;

        }
        result = new Integer[nonDup.length()];
        for ( int h=0; h<nonDup.toCharArray().length;h++){
            Integer chars = Integer.parseInt(String.valueOf(nonDup.charAt(h)));
            result[h] = chars;
            i++;

        }
        return result;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int count = 0;
        String nonDup = "";
        int i = 0;
        Integer[] result;


        for (Integer f : intArray) {
            for (int j = 0; j < intArray.length; j++) {
                if ((f == intArray[j])) {
                    count++;
                }
            }
            if (count != exactNumberOfDuplications) {
                nonDup += f;


            }
            count = 0;

        }
        result = new Integer[nonDup.length()];
       for ( int h=0; h<nonDup.toCharArray().length;h++){
            Integer chars = Integer.parseInt(String.valueOf(nonDup.charAt(h)));
            result[h] = chars;
            i++;

        }
        return result;
    }
}
