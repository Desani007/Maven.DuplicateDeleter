package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    String [] stringArray;
    public StringDuplicateDeleter(String[] stringArray) {
        super(stringArray);
        this.stringArray=stringArray;
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int  count =0;
        String nonDup="";
        for (String s : stringArray){
            for ( int i =0; i<stringArray.length;i++){
                if (s.equals(stringArray[i])){
                    count++;
                }
            }
            if ((count<maxNumberOfDuplications) ) {
                nonDup += s + ",";
            }
            count=0;

        }
        String [] result = nonDup.split(",");
        if (result[0]==""){
            return new String[0];
        }

        return  result;
    }





    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int  count =0;
        String nonDup="";
        for (String s : stringArray){
            for ( int i =0; i<stringArray.length;i++){
                if (s.equals(stringArray[i])){
                    count++;
                }
            }
            if ((count<exactNumberOfDuplications) ||(count>exactNumberOfDuplications)) {
                nonDup += s + ",";
            }
            count=0;

        }
        String [] result = nonDup.split(",");

        return  result;
    }
}
