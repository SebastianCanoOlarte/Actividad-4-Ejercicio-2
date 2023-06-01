/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad4ejercicionumero2;


public class Oficina extends Local{
    protected static double ValorArea = 3500000;
    protected boolean EsGobierno;
    
    public Oficina(int IdentificadorInmobiliario, int Area, String Direccion, Tipo TipoLocal, boolean EsGobierno) {
        super(IdentificadorInmobiliario, Area, Direccion, TipoLocal);
        this.EsGobierno = EsGobierno;
    }
    void Print(){
        super.Print();
        System.out.println("Es oficina gubernamental = " + EsGobierno);
        System.out.println();
    }
   
}
