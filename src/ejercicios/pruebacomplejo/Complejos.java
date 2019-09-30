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
public class Complejos {

    private double real;
    private double imag;

    public Complejos(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double module() {
        return Math.pow((Math.pow(real, 2) + Math.pow(imag, 2)), 0.5);
    }
    public Complejos suma (Complejos c){
        return new Complejos(this.real+c.real,this.imag+c.imag);
    }

    @Override
    public String toString() {
        return "Complejo{" + "real=" + real + ", imag=" + imag + '}';
    }
}
