/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
/**
 *
 * @author Iho
 */
public class PruebaEnvoltorios {

    public static void main (String[] Args){
        int i1=5,i2=5;
        //AUTOBOXING INNECESARIO. SE PUEDE HACER: Integer i3=i1; Integer i4=5;
        Integer i3=new Integer(i1);
        Integer i4=new Integer(i1);
        if (i1==i2) {
            System.out.println("i1 e i2 son iguales");
        }
        if (i3 == i4) {
            System.out.println("i3 e i4 son iguales al compararlos con ==");
        } else {
            System.err.println("i3 e i4 no son iguales al compararlos con ==");
        }
        if (i3.equals(i4)) {
            System.out.println("i3 e i4 son iguales al compararlos como objetos con equals");
        } else {
            System.err.println("i3 e i4 no son iguales al compararlos como objetos con equals");
        }
    }
}
