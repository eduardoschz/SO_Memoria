/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.modelo;

import java.util.Random;

/**
 *
 * @author Eduardo Sanchez
 */
public class Dato {

    private String name;
    private Integer accesos;
    private Integer tamano;
    private Integer prioridad;

    public Dato() {
    }

    public Dato(String name) {
        this.name = "Dato " + name;
        this.accesos = new Random().nextInt(39 - 1) + 1;
        this.prioridad = new Random().nextInt(4) + 1;
        int tam = new Random().nextInt(350) + 1;
        this.tamano = tam;
        if (tam > 300) {
            this.tamano = new Random().nextInt(4000 - 300) + 60;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAccesos() {
        return accesos;
    }

    public void setAccesos(Integer accesos) {
        this.accesos = accesos;
    }

    public Integer getTamano() {
        return tamano;
    }

    public void setTamano(Integer tamano) {
        this.tamano = tamano;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Dato{" + "name=" + name + ", accesos=" + accesos + ", tamano=" + tamano + ", prioridad=" + prioridad + "}\n";
    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 40; i++) {
//            Dato d = new Dato("" + i);
//            System.out.println(d.toString());
//        }
//    }
}
