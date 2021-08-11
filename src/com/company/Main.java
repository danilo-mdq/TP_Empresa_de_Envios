package com.company;

import com.company.Clientes.Empresa;
import com.company.Clientes.Particular;
import com.company.Empresa.Pedido;
import com.company.Empresa.Producto;

public class Main {

    public static void main(String[] args) {

        EmpresaEnvios danilo = new EmpresaEnvios();

        Producto arroz=new Producto(10,"Arroz",150);
        Producto fideos=new Producto(10,"Fideos",115);
        Producto papa=new Producto(10,"Papa",96);
        Producto lechuga=new Producto(10,"Lechuga",75);

        danilo.setProductoListt(arroz);
        danilo.setProductoListt(fideos);
        danilo.setProductoListt(papa);
        danilo.setProductoListt(lechuga);

        Particular juan = new Particular("Danilo","Funes33","223765789");
        Particular pedro = new Particular("Pedro","san Juan 933","223765459");
        Empresa losAmigos = new Empresa("Los amigos","olazabal 344","223876678");
        Empresa autoYa = new Empresa("Auto Ya","olavarria 1344","223343678");

        danilo.setClienteList(juan);
        danilo.setClienteList(pedro);
        danilo.setClienteList(losAmigos);
        danilo.setClienteList(autoYa);

        danilo.realizarPedido(juan,papa,300);
        danilo.realizarPedido(losAmigos,fideos,300);
        danilo.realizarPedido(autoYa,lechuga,200);
        danilo.realizarPedido(pedro,arroz,150);

        System.out.println(danilo.getPedidoList());

        danilo.promedioPedido();

    }
}
