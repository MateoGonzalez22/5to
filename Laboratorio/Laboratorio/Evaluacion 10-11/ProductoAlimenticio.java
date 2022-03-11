package com.company;

public abstract class ProductoAlimenticio extends ProductoDeSuper {

    private int cantDiasParaVencerse;
    public static float descuento = 30;

    public ProductoAlimenticio(String nombre, String origen, int codigo, float costo, int cantDiasParaVencerse){
        super(nombre, origen, codigo, costo);
        this.cantDiasParaVencerse = cantDiasParaVencerse;
    }

    public int getCantDiasParaVencerse() {
        return cantDiasParaVencerse;
    }

    public static float getDescuento() {
        return descuento;
    }

    public void setCantDiasParaVencerse(int cantDiasParaVencerse) {
        this.cantDiasParaVencerse = cantDiasParaVencerse;
    }

    public static void setDescuento(float descuento) {
        ProductoAlimenticio.descuento = descuento;
    }


    @Override
    public float calcularGananciaObtenida(){

        if (getCantDiasParaVencerse() <= 90){

            float ganancia = 10 * getCosto() / 100;
            return ganancia;
        }
        else{
            float ganancia = 25 * getCosto() / 100;
            return ganancia;
        }
    }
    @Override
    public float calcularPrecioFinal(){
        float costo = getCosto();
        float ganancia = this.calcularGananciaObtenida();
        float precioFinal = costo + ganancia - descuento;
        System.out.println(precioFinal);
        return precioFinal;
    }

    @Override
    public String tipoDeProducto(){
        return "Producto Alimenticio";
    }

}



