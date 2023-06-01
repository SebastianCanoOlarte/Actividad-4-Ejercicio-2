/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad4ejercicionumero2;


public class Local extends Inmueble {
    enum Tipo {Interno,Calle};
    protected Tipo TipoLocal;
    
    public Local(int IdentificadorInmobiliario, int Area, String Direccion,Tipo TipoLocal) {
        super(IdentificadorInmobiliario, Area, Direccion);
        this.TipoLocal = TipoLocal;
    }
    void Print() {
        super.Print();
        System.out.println("Tipo dde local = "+TipoLocal);
    }
}
