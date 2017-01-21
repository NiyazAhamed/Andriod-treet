package com.niyaz.tweet;

import java.util.Date;

/**
 * Created by a6001811 on 1/4/17.
 */

public class Treet {
    private String mAuthor;
    private String mDescription;
    private Date mCreationDate;

    public Treet(String author,
                 String description,
                 Date creationDate){
        mAuthor = author;
        mDescription = description;
        mCreationDate = creationDate;
    }

    public String[] getWords(){
        return mDescription.split("[^\\w#@']+");
    }

    public String toString(){
        return "Treet :" +
                mDescription + " by " +
                mAuthor + " on " +
                mCreationDate;
    }

}
