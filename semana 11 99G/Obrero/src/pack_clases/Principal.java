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
public class Principal {
      public static void main(String[] args) {
          Obrero obrero1= new Obrero();
          Fecha fecha=new Fecha(13,8,2013);
          obrero1.setCodigo("abc45rt");
          obrero1.setNombre("Sergio");
          obrero1.setApellido("Ponce");
          obrero1.setCargo("Analista");
          obrero1.setFechaIngreso(fecha);
          obrero1.sueldoBruto();
          double dscto=obrero1.obtenerDescuento();
          obrero1.setSueldoNeto(dscto);
          
          Obrero obrero2=new Obrero("2013434","Juan","Perez","Soporte",22,10,2010);
          obrero2.sueldoBruto();
          double dscto2=obrero2.obtenerDescuento();
          obrero2.setSueldoNeto(dscto);

          Obrero obrero3=new Obrero("2013434","Juan","Perez","Programador");
          Fecha fecha2=new Fecha();
          fecha2.setDia(15);
          fecha2.setMes(11);
          fecha2.setAnho(2005);
          obrero3.setFechaIngreso(fecha2);
          obrero3.sueldoBruto();
          double dscto3=obrero3.obtenerDescuento();
          obrero3.setSueldoNeto(dscto);
          
          InfoObrero.imprimirInfoObrero(obrero1);
          System.out.println("=======================");
          InfoObrero.imprimirInfoObrero(obrero2);
          System.out.println("=======================");
          InfoObrero.imprimirInfoObrero(obrero3);
      }
}
