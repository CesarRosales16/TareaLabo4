/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Artimetico.Aritmetico;
import Conversion.Conversion;


/**
 *
 * @author UCA
 */
public interface AbstractFactory {
    Aritmetico getAritmetico(String type);
    Conversion getConversion(String type);
    
}
