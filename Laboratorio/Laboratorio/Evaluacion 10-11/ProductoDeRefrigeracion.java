package com.company;

public class ProductoDeRefrigeracion extends ProductoElectrico{

    private float litrosDeCapacidad;

    public ProductoDeRefrigeracion(String nombre, String origen, int codigo, float costo, int cantDiasDeGarantia, float litrosDeCapacidad) {
        super(nombre, origen, codigo, costo, cantDiasDeGarantia);
        this.litrosDeCapacidad = litrosDeCapacidad;
    }

    public float getLitrosDeCapacidad() {
        return litrosDeCapacidad;
    }

    public void setLitrosDeCapacidad(float litrosDeCapacidad) {
        this.litrosDeCapacidad = litrosDeCapacidad;
    }
}
