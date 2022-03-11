package com.company;

public class ProductoNoPerecedero extends ProductoAlimenticio{

    private int mgDeSodio;

    public ProductoNoPerecedero(String nombre, String origen, int codigo, float costo, int cantDiasParaVencerse, int mgDeSodio) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
        this.mgDeSodio = mgDeSodio;
    }

    public int getMgDeSodio() {
        return mgDeSodio;
    }

    public void setMgDeSodio(int mgDeSodio) {
        this.mgDeSodio = mgDeSodio;
    }
}
