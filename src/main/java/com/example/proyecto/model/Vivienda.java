package com.example.proyecto.model;

public class Vivienda {
    private String tipo;
    private String codPropiedad;
    private Double superficie;
    private Integer numHabitaciones;
    private Integer costoArriendo;

    public Vivienda(){
    }

    public Vivienda(String tipo, String codPropiedad, Double superficie, Integer numHabitaciones, Integer costoArriendo) {
        this.tipo = tipo;
        this.codPropiedad = codPropiedad;
        this.superficie = superficie;
        this.numHabitaciones = numHabitaciones;
        this.costoArriendo = costoArriendo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodPropiedad() {
        return codPropiedad;
    }

    public void setCodPropiedad(String codPropiedad) {
        this.codPropiedad = codPropiedad;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public Integer getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(Integer numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public Integer getCostoArriendo() {
        return costoArriendo;
    }

    public void setCostoArriendo(Integer costoArriendo) {
        this.costoArriendo = costoArriendo;
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "tipo='" + tipo + '\'' +
                ", codPropiedad=" + codPropiedad +
                ", superficie=" + superficie +
                ", numHabitaciones=" + numHabitaciones +
                ", costoArriendo=" + costoArriendo +
                '}';
    }
}
