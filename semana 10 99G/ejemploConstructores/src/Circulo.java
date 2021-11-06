
import static java.lang.Math.pow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIA
 */
public class Circulo {
    private double x;
    private double y;
    private double radio;
    
    /*declaramos la constante PI*/
    public static final double PI=3.1415926536;
    
    /*Constructor en el que se ingresa todos los atributos*/
    Circulo() {
        
    }
    Circulo(double coorX, double coorY, double r) {
        this.radio=r;
        this.x=coorX;
        this.y=coorY;
        
    }
    Circulo(double radio) {
        this.radio=radio;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
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
    
    /*Métodos que permiten hacer operaciones*/
    public double obtenerPerimetro() {
        return 2*getRadio()*PI;
    }
    
    public double obtenerArea() {
        return PI*pow(this.radio,2);
    }
    
}
