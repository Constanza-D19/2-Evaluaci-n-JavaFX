package com.example.proyecto.model;

public class Departamento extends Vivienda{
    private Integer numPiso;
    private boolean gastoComun;
    private boolean estacionamiento;

    public Departamento(){
    }

    public Departamento(String tipo, String codPropiedad, Double superficie, Integer numHabitaciones, Integer costoArriendo, Integer numPiso, boolean gastoComun, boolean estacionamiento) {
        super(tipo, codPropiedad, superficie, numHabitaciones, costoArriendo);
        this.numPiso = numPiso;
        this.gastoComun = gastoComun;
        this.estacionamiento = estacionamiento;
    }

    public Integer getNumPiso() {
        return numPiso;
    }

    public void setNumPiso(Integer numPiso) {
        this.numPiso = numPiso;
    }

    public boolean isGastoComun() {
        return gastoComun;
    }

    public void setGastoComun(boolean gastoComun) {
        this.gastoComun = gastoComun;
    }

    public boolean isEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(boolean estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    // REVISAR SI ES ASI O DE OTRA FORMA O ELIMINAR.

    @Override
    public String toString() {
        return "Departamento{" +
                "numPiso=" + numPiso +
                ", gastoComun=" + gastoComun +
                ", estacionamiento=" + estacionamiento +
                '}';
    }
}
