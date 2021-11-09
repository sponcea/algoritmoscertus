/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import static java.lang.Math.pow;


/**
 *
 * @author DIA
 */
public class Circulo {
    /*Atributos*/
    private int identificador;
    private double x;
    private double y;
    private double radio;
    
    /*CONSTANTE*/
    public static final double PI=3.1415926536;
    /*Constructores*/
    public Circulo() {
        
    }
    public Circulo(int identificador , double x, double y, double radio) {
        this.identificador=identificador;
        this.x=x;
        this.y=y;
        this.radio=radio;
    }
    public Circulo(double radio) {
        this.radio=radio;
    }
    public Circulo(int id) {
        this.identificador=id;
    }
    
    public String toString(){
        return "Circulo"+this.getIdentificador();
    }
    
    /*Ejemplo de GET y SET para el atributo x*/
    public double getX() {
        return this.x;
    }
    public void setX(double x ) {
        this.x=x;
    }
    
    /*Operaciones*/
    public double calcularPerimetro() {
        return 2*this.getRadio()*PI;
    }
    
    public double calcularArea() {
        return PI*pow(this.getRadio(),2);
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @return the identificador
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
}
