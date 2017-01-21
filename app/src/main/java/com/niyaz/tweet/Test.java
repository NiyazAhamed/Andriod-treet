package com.niyaz.tweet;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by a6001811 on 1/4/17.
 */

public class Test {

    public static void main(String args[]){

        Treet one = new Treet("bilal",
                "Wow. That Pep interview after today's #mancity game so patronising",
                new Date(1483797202l));

        Treet two = new Treet("niyaz",
                "Wow. That Pep intrview after today's #my game so patronising",
                new Date(1482149965l));

        Treet three = new Treet("fawaaz",
                "That Pep intrview after today's #my game so patronising",
                new Date(1482143965l));

        Treet[] treets = {one,two,three};

        for(Treet treet: treets){
            System.out.println(treet);
        }

        //Arrays.sort(treets);

        for(Treet treet: treets){
            System.out.println(treet);
            for(String word : treet.getWords()){
                System.out.println(word);
            }
        }




    }
}
