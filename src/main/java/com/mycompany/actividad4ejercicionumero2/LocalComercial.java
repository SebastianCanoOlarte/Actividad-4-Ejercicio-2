/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad4ejercicionumero2;


public class LocalComercial extends Local {
    protected static double ValorArea = 3000000;
    protected String CentroComercial;
    
    public LocalComercial(int IdentificadorInmobiliario, int Area, String Direccion, Tipo TipoLocal, String CentroComercial) {
        super(IdentificadorInmobiliario, Area, Direccion, TipoLocal);
        this.CentroComercial = CentroComercial;
    }
    void Print() {
        super.Print();
        System.out.println("Centro comercial = "+CentroComercial);
        System.out.println();
    }
}
