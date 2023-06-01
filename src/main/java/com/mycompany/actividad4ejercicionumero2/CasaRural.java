/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad4ejercicionumero2;

/**
 *
 * @author Knoknozo
 */
public class CasaRural extends Casa{
    protected static double ValorArea = 1500000;
    protected int DistanciaCabera;
    protected int Altitud;
    
    public CasaRural(int IdentificadorInmobiliario, int Area, String Direccion, int NumeroHabitaciones, int NumeroBaños, int NumeroPisos, int DistanciaCabera, int Altitud) {
        super(IdentificadorInmobiliario, Area, Direccion,NumeroHabitaciones, NumeroBaños, NumeroPisos);
        this.DistanciaCabera = DistanciaCabera;
        this.Altitud = Altitud;
    }
    void Print() {
        super.Print();
        System.out.println("Distancia la cabecera municipal = " + NumeroHabitaciones + " km.");
        System.out.println("Altitud sobre el nivel del mar = " + Altitud +" metros.");
        System.out.println();
    }
    
}
