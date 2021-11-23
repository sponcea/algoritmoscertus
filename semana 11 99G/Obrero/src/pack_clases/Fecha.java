/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_clases;

/**
 *
 * @author DIA
 */
class Fecha {
    /*atributos*/
    private int dia;
    private int mes;
    private int anho;
    
    /*Constructores*/
    Fecha() {
        
    }
    Fecha(int dia, int mes, int anho) {
        this.dia=dia;
        this.mes=mes;
        this.anho=anho;
    }
    /*operaciones*/
    public String imprimirFechaIngreso() {
        return this.dia+"/"+this.getMes()+"/"+this.getAnho();
    }
    
    public int getDia() {
        return this.dia;
    }
    public void setDia(int dia) {
        this.dia=dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the anho
     */
    public int getAnho() {
        return anho;
    }

    /**
     * @param anho the anho to set
     */
    public void setAnho(int anho) {
        this.anho = anho;
    }
    
}
