/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Artimetico.Aritmetico;
import Conversion.Binario;
import Conversion.Conversion;

/**
 *
 * @author UCA
 */
public class FactoryConversion implements AbstractFactory{

    @Override
    public Aritmetico getAritmetico(String type) {
        return null;
    }

    @Override
    public Conversion getConversion(String type) {
        switch(type) {
            case "binario":
                return new Binario();
        }
        return null;
    }
    
}
