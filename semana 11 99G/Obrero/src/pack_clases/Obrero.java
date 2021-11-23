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
public class Obrero {
    /*Definimos constante*/
    private static final double descuento=0.21;
    
    /*Atributos*/
    private String codigo;
    private String nombre;
    private String apellido;
    private String cargo;
    private double sueldoBruto;
    private double sueldoNeto;
    /*Fecha: día/mes/año*/
    private Fecha fechaIngreso=new Fecha();

    /*Constructores*/
    Obrero() {
        
    }
    
    Obrero(String codigo, String nombre, String apellido, String cargo) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.cargo=cargo;
    }
    
    Obrero(String codigo, String nombre, String apellido, String cargo, int dia, int mes, int anho ) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.cargo=cargo;
        this.fechaIngreso.setDia(dia);
        this.fechaIngreso.setMes(mes);
        this.fechaIngreso.setAnho(anho);
    }
    /*Métodos*/
   public void sueldoBruto(){
       if (this.getCargo()=="Jefe") {
           this.setSueldoBruto(5000);
       } else if (this.getCargo()=="Analista") {
           this.setSueldoBruto(4000);
       } else if (this.getCargo()=="Programador") {
           this.setSueldoBruto(3000);
       } else if (this.getCargo()=="Soporte") {
           this.setSueldoBruto(2000);
       } else {
           this.setSueldoBruto(0);
       }
   }
   
   public double obtenerDescuento() {
       return this.getSueldoBruto()*this.descuento;
   }
   
   public void setSueldoNeto(double descuento) {
       this.sueldoNeto=this.getSueldoBruto()-descuento;
   }
   public double getSueldoNeto(){
       return this.sueldoNeto;
   }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the sueldoBruto
     */
    public double getSueldoBruto() {
        return sueldoBruto;
    }

    /**
     * @param sueldoBruto the sueldoBruto to set
     */
    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    /**
     * @return the fechaIngreso
     */
    public Fecha getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(Fecha fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
