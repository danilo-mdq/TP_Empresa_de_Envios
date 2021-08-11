package com.company.Empresa;

import com.company.Clientes.Cliente;
import com.company.Clientes.Empresa;
import com.company.Clientes.Particular;

public class Pedido {
        private Particular particular;
        private Empresa empresa;
        private Producto producto;
        private  int km;
        private double costoEnvio;

    public Pedido() {
    }


    public Pedido(Particular particular, Producto producto, int km) {
        this.particular = particular;
        this.producto = producto;
        this.km = km;
        this.costoEnvio = costoEnvio();
    }

    public Pedido(Empresa empresa, Producto producto, int km) {
        this.empresa = empresa;
        this.producto = producto;
        this.km = km;
        this.costoEnvio = costoEnvioEmpresa();
    }

    public Particular getParticular() {
        return particular;
    }

    public void setParticular(Particular particular) {
        this.particular = particular;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    public double costoEnvio(){
        return this.costoEnvio=this.km*5;
    }

    public double costoEnvioEmpresa(){
        return this.costoEnvio=(costoEnvio*15)/100;
    }




    @Override
    public String toString() {
        return "Pedido{" +
                "particular=" + particular +
                ", empresa=" + empresa +
                ", producto=" + producto +
                ", km=" + km +
                ", costoEnvio=" + costoEnvio +
                '}';
    }
}




