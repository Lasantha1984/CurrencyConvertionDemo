/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconvertiondemo;

import java.util.Locale;

/**
 *
 * @author user
 */
public class CustomLocaleDemo {
    public static void main(String[] args) {
        //Following locale is to create Indian rupees
        Locale indian = new Locale("EN","in");
        System.out.println(indian);
    }
}
