package com.example.pacfim;

import com.example.pacfim.Cooperativa;

public class Persona {

    private Cooperativa cooperativa;
    private String nombre;
    private String cedula;
    private double activosEnLaCooperativa;
    private double porcentajeDelFondo;

    public Persona(String nombre, String cedula)
    {
        this.nombre = nombre;
        this.cedula = cedula;
        activosEnLaCooperativa = 0;
        porcentajeDelFondo = 0;
    }

    public String getCedula()
    {
        return cedula;
    }

    public String getNombre()
    {
        return nombre;
    }

    public double getActivosEnLaCooperativa()
    {
        return activosEnLaCooperativa;
    }

    public double getPorcentajeDelFondo()
    {
        return porcentajeDelFondo;
    }

    public void consignarEnElFondo(double dinero)
    {
        activosEnLaCooperativa += dinero;
        cooperativa.consignarEnElFondo(dinero);
    }

    public void retirarDelFondo(double dinero)
    {
        activosEnLaCooperativa -= dinero;
        cooperativa.retirarDelFondo(dinero);
    }

    public void setPorcentajeDelFondo(double porcentaje)
    {
        porcentajeDelFondo = porcentaje;
    }
}
