/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artimetico;

/**
 *
 * @author UCA
 */
public class Division implements Aritmetico{

    @Override
    public float operar(int a, int b) {
        return (float)a/b;
    }
    
}
