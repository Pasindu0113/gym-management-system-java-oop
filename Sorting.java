package sample;

public class Sorting {
    public static <T extends Comparable<T>> void bubbleSort(DefaultMembers[] memberlistarray){
        for(int m =0 ; m < memberlistarray.length - 1;  m++ ){
            for(int n =0 ; n < memberlistarray.length - (m+1); n++){
                    if (memberlistarray[n].getName().compareTo(memberlistarray[n+1].getName()) > 0){
                        DefaultMembers temp = memberlistarray[n];
                        memberlistarray[n] = memberlistarray[n+1];
                        memberlistarray[n+1] = temp;
                    }
                    }
                }
            }
        }
