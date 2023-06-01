/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad4ejercicionumero2;


public class Casa extends InmuebleVivienda{
    protected int NumeroPisos;
    
    public Casa(int IdentificadorInmobiliario, int Area, String Direccion,int NumeroHabitaciones, int NumeroBaños, int NumeroPisos) {
        super(IdentificadorInmobiliario, Area, Direccion,NumeroHabitaciones, NumeroBaños);
        this.NumeroPisos = NumeroPisos;
    }
    void Print() {
        super.Print();
        System.out.println("Numero  de pisos = "+NumeroPisos);
    }
}
