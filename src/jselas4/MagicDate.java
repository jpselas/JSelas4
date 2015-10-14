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
public class MagicDate {
    private int month;
    private int day;
    private int year;
    public MagicDate(int month,int day,int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public boolean isMagic(){
        if(month * day == year){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
