package com.company.Clientes;

import com.company.Clientes.Cliente;

public class Empresa extends Cliente {
    private String nombreFantasia;
    private String direccion;
    private String telefono;
    private final int DESCUENTO_ENVIO=15;

    public Empresa() {
    }

    public Empresa(String nombreFantasia, String direccion, String telefono) {
        this.nombreFantasia = nombreFantasia;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombreFantasia() {
        return nombreFantasia;
    }

    public void setNombreFantasia(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getDESCUENTO_ENVIO() {
        return DESCUENTO_ENVIO;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombreFantasia='" + nombreFantasia + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", DESCUENTO_ENVIO=" + DESCUENTO_ENVIO +
                '}';
    }
}
