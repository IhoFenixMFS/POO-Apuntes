/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.pruebacomplejo;

/**
 *
 * @author Iho
 */
public class PruebaComplejos {

    public static void main(String[] args) {
        Complejos c1 = new Complejos(18, 6.0827689);
        Complejos c2 = new Complejos(6.0827689, 18);
        System.out.println("Primer complejo: \n"+c1+"\n Módulo c1: " + c1.module());
        System.err.println("Segundo complejo: \n"+c2+"\n Módulo c2: " + c2.module());
        System.err.println("\n \n Suma c1 + c2: " + c1.suma(c2));
    }
}
