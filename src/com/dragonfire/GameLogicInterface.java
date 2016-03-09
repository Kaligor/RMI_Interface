package com.dragonfire;

import java.rmi.*;

public interface GameLogicInterface extends Remote
{
    /**
     * Send Player Value
     * @param Player
     * @throws RemoteException 
     */
    public void increaseValue(int Player) throws RemoteException;
    
    /**
     * Send Player Value
     * @param Player
     * @return
     * @throws RemoteException 
     */
    public int getValue(int Player) throws RemoteException;
    
    public int assignPlayer() throws RemoteException;
    
    /**
     * Send Player Value
     * @param Player
     * @return
     * @throws RemoteException 
     */
    public boolean getPlayerStatus(int Player) throws RemoteException;
    
    public boolean getReady() throws RemoteException;
    
    
    //New Functions
    
    public int getPlayerHandSize() throws RemoteException;
    
    /**
     * Send Player Value
     * @param Player
     * @return
     * @throws RemoteException 
     */
    public Card drawCardFromDeck(int Player) throws RemoteException;
    
    public void shuffleDeck() throws RemoteException;
            
}
