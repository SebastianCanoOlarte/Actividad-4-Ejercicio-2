/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad4ejercicionumero2;


public class Apartaestudio extends Apartamento {
    protected static double ValorArea = 1500000;
    
    public Apartaestudio(int IdentificadorInmobiliario, int Area, String Direccion, int NumeroHabitaciones, int NumeroBaños) {
        super(IdentificadorInmobiliario, Area, Direccion, 1, 1);
    }
    void Print() {
        super.Print();
        System.out.println();
    }
    
}
