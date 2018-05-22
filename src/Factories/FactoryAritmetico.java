/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Artimetico.Aritmetico;
import Artimetico.Division;
import Artimetico.Multiplicacion;
import Artimetico.Resta;
import Artimetico.Suma;
import Conversion.Conversion;

/**
 *
 * @author UCA
 */
public class FactoryAritmetico implements AbstractFactory {

    @Override
    public Aritmetico getAritmetico(String type) {
        switch (type) {
            case "suma":
                return new Suma();
            case "resta":
                return new Resta();
            case "multiplicacion":
                return new Multiplicacion();
            case "division":
                return new Division();
        }
        return null;
    }

    @Override
    public Conversion getConversion(String type) {
        return null;
    }

}
