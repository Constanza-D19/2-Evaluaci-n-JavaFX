package com.example.proyecto.model;

public class Casa extends Vivienda{
    private boolean patio;

    public Casa(){
    }

    public Casa(String tipo, String codPropiedad, Double superficie, Integer numHabitaciones, Integer costoArriendo, boolean patio) {
        super(tipo, codPropiedad, superficie, numHabitaciones, costoArriendo);
        this.patio = patio;
    }

    public boolean isPatio() {
        return patio;
    }

    public void setPatio(boolean patio) {
        this.patio = patio;
    }

    // REVISAR SI ES ASI O DE OTRA FORMA O ELIMINAR.
    @Override
    public String toString() {
        return "Casa{" +
                "patio=" + patio +
                '}';
    }
}
