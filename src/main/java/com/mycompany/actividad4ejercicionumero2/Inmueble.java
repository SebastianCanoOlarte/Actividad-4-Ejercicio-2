/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad4ejercicionumero2;


public class Inmueble {
   protected int IdentificadorInmobiliario;
   protected int Area;
   protected String Direccion;
   protected double PrecioVenta;
   
   Inmueble(int IdentificadorInmobiliario, int Area, String Direccion) {
       this.IdentificadorInmobiliario = IdentificadorInmobiliario;
       this.Area = Area;
       this.Direccion = Direccion;
   }
   double CalcularPrecioVenta(double ValorArea) {
       PrecioVenta = Area*ValorArea;
       return PrecioVenta;
   }
   void Print() {
       System.out.println("Identificador inmobiliario = "+IdentificadorInmobiliario);
       System.out.println("Area = " + Area);
       System.out.println("Dirección = " + Direccion);
       System.out.println("Precio de venta = $" + PrecioVenta);
   }
}
