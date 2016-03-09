package com.dragonfire;

public class Card
{

    static final String HEART = "Heart";
    static final String DIAMOND = "Diamond";
    static final String SPADE = "Spade";
    static final String CLUB = "Club";

    static int nextID = 0;
    int id;
    String face;       //Heart, Diamond, Spade, Club
    int value;      //Ace to King - 1 to 13
    boolean isBlack;

    public Card(String face, int value)
    {
        this.face = face;
        this.value = value;
        id = nextID;
        nextID++;

        if (face.equals(HEART) || face.equals(DIAMOND))
        {
            isBlack = false;
        } else if (face.equals(SPADE) || face.equals(CLUB))
        {
            isBlack = true;
        }
    }

    @Override
    public String toString()
    {

        switch (value)
        {
            case 1:
                return face + " " + "Ace";         
            case 11:
                return face + " " + "Knight";
            case 12:
                return face + " " + "Queen";
            case 13:
                return face + " " + "King";
            default:
                return face + " " + value;
        }
    }

}
