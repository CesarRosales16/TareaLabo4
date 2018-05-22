/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversion;

/**
 *
 * @author UCA
 */
public class Binario implements Conversion {

    @Override
    public String convertir(int a) {
        String num = "";
        String binario = "";
        while (a >= 2) {
            num = num + Integer.toString(a % 2);
            a = a / 2;
        }
        num = num + Integer.toString(a);
        for (int x = num.length() - 1; x >= 0; x--) {
            binario = binario + num.charAt(x);
        }
        return binario;
    }

}
