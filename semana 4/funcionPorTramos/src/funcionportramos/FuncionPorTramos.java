/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionportramos;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class FuncionPorTramos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int N;
      do {
             System.out.print("Introduce un número entre 1 y 3999: ");
             N = sc.nextInt();
      } while (N < 1 || N > 3999);
      System.out.println(N + " en numeros romanos -> " + convertirANumerosRomanos(N));                            
  }

  //método para pasar a números romanos
  public static String convertirANumerosRomanos(int numero) {
      int i, miles, centenas, decenas, unidades;
      String romano = "";
      
      //obtenemos cada cifra del número
      miles = numero / 1000;
      centenas = numero / 100 % 10;
      decenas = numero / 10 % 10;
      unidades = numero % 10;

      //millar
      for (i = 1; i <= miles; i++) {
             romano = romano + "M";
      }

      //centenas
      if (centenas == 9) {
          romano = romano + "CM";
      } else if (centenas >= 5) {
                 romano = romano + "D";
                 for (i = 6; i <= centenas; i++) {
                      romano = romano + "C";
                 }
      } else if (centenas == 4) {
                 romano = romano + "CD";
      } else {
                 for (i = 1; i <= centenas; i++) {
                      romano = romano + "C";
             }
      }

      //decenas
      if (decenas == 9) {
          romano = romano + "XC";
      } else if (decenas >= 5) {
                 romano = romano + "L";
                 for (i = 6; i <= decenas; i++) {
                      romano = romano + "X";
                 }
      } else if (decenas == 4) {
                 romano = romano + "XL";
      } else {
                 for (i = 1; i <= decenas; i++) {
                      romano = romano + "X";
                 }
      }

      //unidades
      if (unidades == 9) {
          romano = romano + "IX";
      } else if (unidades >= 5) {
                 romano = romano + "V";
                 for (i = 6; i <= unidades; i++) {                                                           
                      romano = romano + "I";
                 }
      } else if (unidades == 4) {
                 romano = romano + "IV";
      } else {
                 for (i = 1; i <= unidades; i++) {
                      romano = romano + "I";
                 }
      }
      return romano;
  }
        
    
    
}
