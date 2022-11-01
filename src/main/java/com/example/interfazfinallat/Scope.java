package com.example.interfazfinallat;

import java.util.HashMap;

public class Scope {
    Scope padre;
    HashMap<String, Double> variables;

    public Scope (Scope padre){
        this.padre=padre;
        this.variables= new HashMap<>();
    }
    //declarar
    public void declarar(String var) {

        if(!buscar(var)) {
            variables.put(var,null);
        }
        else {
            throw new NullPointerException("Variable ya declarada: "+var);
        }
    }
    //asignar
    public void asignar(String var, double value) {
        if(variables.containsKey(var)) {
            variables.replace(var, value);
        }
        else if(padre != null) {
            padre.asignar(var, value);
        } else {
            throw new NullPointerException("Esta variable no existe: "+var);
        }
    }
    //buscar
    public boolean buscar(String var) {
        if(variables.containsKey(var)) {
            return true;
        }
        else if(padre != null) {
            return padre.buscar(var);
        } else {
            return false;
        }
    }

    //regresar
    public double regresar(String var){
        if(variables.containsKey(var)){
            if (variables.get(var)!=null) {
                return variables.get(var);
            }
            else {
                throw new NullPointerException("Variable sin valor: "+var);
            }
        } else if(padre != null) {
            return padre.regresar(var);
        } else {
            throw new NullPointerException("Esta variable no existe: "+var);
        }
    }
}
