/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_main;

import pack_clases.Paciente;

/**
 *
 * @author DIA
 */
public class Principal {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        paciente1.setPeso(30);
        paciente1.setImc(15);
        System.out.println(paciente1.calcularIMC());
    }
}
