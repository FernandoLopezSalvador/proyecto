package entity;

import java.util.List;
/*
    Autor: Fernando Lopez
    Fecha Creación : 7 mar 2022, 10:26:30
    Fecha Actualización:8 mar 2022, 09:00:00
    Descripción:clase java principal
 */
public class Main {

    public static void main(String[] args) {
        Producto p1 = new Producto("04253", "Barritas", "Barritas fresa/piña", 12.5);
        Producto p2 = new Producto("84535", "Chokis", "galletas con chocolate", 14.0);
        Producto p3 = new Producto("85396", "Polvorones", "Galletas sabor naranja", 12.5);
        Producto p4 = new Producto("74364", "Gansito", "pastelito de chocolate con mermelada de fresa", 11.5);
        Usuario u1 = new Usuario("Juan","Masculino" , 16, 15,"hola123");
        Usuario u2 = new Usuario("Juan2","Masculino" , 26, 19,"hola1234");
        Usuario u3 = new Usuario("Juan3","Masculino" , 19, 110,"hola1235");
        Usuario u4 = new Usuario("Juan4","Masculino" , 25, 1,"hola1236");

        List<Usuario> lista = new Arraylist<Usuario>();
        lista.add(u1);
        lista.add(u2);
        lista.add(u3);
        lista.add(u4);
        for (Usuario i : lista) {
            System.out.println("" + i.getCodigo());
            System.out.println("" + i.getNombre());
            System.out.println("" + i.getContraseña());
            System.out.println("" + i.getSexo());
            System.out.println("" + i.getEdad());
        }
        List<Producto> lista2 = new Arraylist<Producto>();
        lista2.add(p1);
        lista2.add(p2);
        lista2.add(p3);
        lista2.add(p4);
        for (Producto i : lista2) {
            System.out.println("" + i.getCodigo());
            System.out.println("" + i.getNombre());
            System.out.println("" + i.getDescripcion());
            System.out.println("" + i.getPrecio());

        }
    }
}
