/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad4ejercicionumero2;


public class InmuebleVivienda extends Inmueble {
    protected int NumeroHabitaciones;
    protected int NumeroBaños;
    
    public InmuebleVivienda(int IdentificadorInmobiliario, int Area, String Direccion, int NumeroHabitaciones, int NumeroBaños) {
        super(IdentificadorInmobiliario, Area, Direccion); 
        this.NumeroHabitaciones = NumeroHabitaciones;
        this.NumeroBaños = NumeroBaños;
    }
    void Print() {
        super.Print(); 
        System.out.println("Número de habitaciones = " + NumeroHabitaciones);
        System.out.println("Número de baños = " + NumeroBaños);
    }
    
}
