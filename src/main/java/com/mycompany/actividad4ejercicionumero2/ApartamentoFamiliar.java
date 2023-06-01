/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad4ejercicionumero2;


public class ApartamentoFamiliar extends Apartamento {
    protected static double ValorArea = 2000000;
    protected int ValorAdministracion;
    
    public ApartamentoFamiliar(int IdentificadorInmobiliario, int Area,String Direccion, int NumeroHabitaciones, int NumeroBaños, int ValorAdministracion) {
        super(IdentificadorInmobiliario, Area, Direccion,NumeroHabitaciones, NumeroBaños);
        this.ValorAdministracion = ValorAdministracion;
    }
    void Print() {
        super.Print(); 
        System.out.println("Valor de la administración = $" +ValorAdministracion);
        System.out.println();
    } 
}
