package com.company;

import com.company.Clientes.Cliente;
import com.company.Clientes.Empresa;
import com.company.Clientes.Particular;
import com.company.Empresa.Pedido;
import com.company.Empresa.Producto;


import java.util.ArrayList;
import java.util.List;

public class EmpresaEnvios {
    List<Cliente>clienteList = new ArrayList<>();
    List<Producto>productoList = new ArrayList<>();
    List<Pedido>pedidoList = new ArrayList<>();

    public EmpresaEnvios() {
    }

    public EmpresaEnvios(List<Cliente> clienteList, List<Producto> productoList, List<Pedido> pedidoList) {
        this.clienteList = clienteList;
        this.productoList = productoList;
        this.pedidoList = pedidoList;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }
    public void setClienteList(Cliente cliente){
        this.clienteList.add(cliente);
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }
    public void setProductoListt(Producto producto){
        this.productoList.add(producto);
    }

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    public void setPedidoList(Pedido pedido){
        this.pedidoList.add(pedido);
    }

    @Override
    public String toString() {
        return "EmpresaEnvios{" +
                ", pedidoList=" + pedidoList +
                '}';
    }

    public void realizarPedido(Cliente cliente, Producto producto, int km){

        if(cliente instanceof Particular){
            Particular particular = (Particular) cliente;
            Pedido pedido = new Pedido(particular,producto,km);
            pedido.costoEnvio();
            this.pedidoList.add(pedido);
            producto.restarStock();
           // System.out.println(pedido.toString());

        }else{
            Empresa empresa = (Empresa) cliente;
            Pedido pedido = new Pedido(empresa,producto,km);
            pedido.costoEnvioEmpresa();
            this.pedidoList.add(pedido);
            producto.restarStock();
        }

    }

    public void promedioPedido(){
        double total=0; int aux=0;
        for(Pedido p:pedidoList){
            total+=(p.getProducto().getPrecio()+p.costoEnvio());
            aux++;
        }
        total=total/aux;
        System.out.println(total);
    }
}
