/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconvertiondemo;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author user
 */
public class CurrencyConvertionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        Locale inLo = new Locale("En", "in");
        NumberFormat in = NumberFormat.getCurrencyInstance(inLo);
        System.out.println("US is "+us.format(1000.89));
        System.out.println("France is :"+fr.format(1000.89));
        System.out.println("China is :"+ch.format(1000.89));
        System.out.println("India is :"+in.format(1000.89));
    }
    
}
