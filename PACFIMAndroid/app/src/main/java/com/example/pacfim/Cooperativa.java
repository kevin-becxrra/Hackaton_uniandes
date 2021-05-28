package com.example.pacfim;

import java.util.ArrayList;

public class Cooperativa {
    private ArrayList<Persona> personas;

    private double dineroEnLaCooperativa;

    public Cooperativa()
    {
        personas = new ArrayList<Persona>();
        dineroEnLaCooperativa = 0;
    }

    public void agregarPersona(String nombre, String cedula)
    {
        personas.add(new Persona(nombre, cedula));
    }

    public void consignarEnElFondo(double dinero)
    {
        dineroEnLaCooperativa += dinero;
        reasignarPorcentajes();
    }

    public void retirarDelFondo(double dinero)
    {
        dineroEnLaCooperativa -= dinero;
        reasignarPorcentajes();
    }

    public void reasignarPorcentajes()
    {
        for(Persona actual : personas)
        {
            double porcentajeDeLaPersona = (actual.getActivosEnLaCooperativa() * 100)/dineroEnLaCooperativa;
            actual.setPorcentajeDelFondo(porcentajeDeLaPersona);
        }
    }

    public Persona buscarPersona(String cedula)
    {
        Persona buscada = null;
        for(int i = 0; i < personas.size() && buscada == null; i++)
        {
            if(personas.get(i).getCedula().equals(cedula))
                buscada = personas.get(i);
        }

        return buscada;
    }

    public double darPorcentajePersona(String cedula)
    {
        return buscarPersona(cedula).getPorcentajeDelFondo();
    }
}