/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jselas4;

/**
 *
 * @author John
 */
public class Die {
    private int roll;
    public void setRoll(){
        roll = (int)(Math.random()*6+1);
    }
    public int getRoll(){
        return roll;
    }
    
}
