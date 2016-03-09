package com.dragonfire;

import java.io.Serializable;

public class Card implements Serializable
{

    static final String HEART = "Hearts";
    static final String DIAMOND = "Diamonds";
    static final String SPADE = "Spades";
    static final String CLUB = "Clubs";

    String face;       //Heart, Diamond, Spade, Club
    int value;      //Ace to King - 1 to 13
    boolean isRed;
    String imageName;

    public Card(String face, int value, String imageName)
    {
        this.face = face;
        this.value = value;
        this.imageName = imageName;

        if (face.equals(HEART) || face.equals(DIAMOND))
        {
            isRed = true;
        } else if (face.equals(SPADE) || face.equals(CLUB))
        {
            isRed = false;
        }
    }

    @Override
    public String toString()
    {

        switch (value)
        {
            case 1:
                return "Ace of " + face;         
            case 11:
                return "Jack of " + face;
            case 12:
                return "Queen of " + face ;
            case 13:
                return "King of " + face;
            default:
                return value + " of " + face;
        }
    }

}
