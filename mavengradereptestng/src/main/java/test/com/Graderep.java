/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

/**
 *
 * @author ShraddhaGanesh
 */
public class Graderep {
    private int num1;
 private int num2;
// private int num3;
    public Graderep(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;        
    }

    Graderep() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
    public int getTotal()
    {
    return num1+num2;
    }

    public int getAvg()
    {
        return (num1+num2)/2;
        
    }

}


