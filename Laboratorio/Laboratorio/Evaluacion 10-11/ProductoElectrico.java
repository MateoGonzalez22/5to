package com.company;

public abstract class ProductoElectrico extends ProductoDeSuper{

    private int cantDiasDeGarantia;
    public static float recargoPorEnvio;

    public ProductoElectrico(String nombre, String origen, int codigo, float costo, int cantDiasDeGarantia) {
        super(nombre, origen, codigo, costo);
        this.cantDiasDeGarantia = cantDiasDeGarantia;
    }


    public int getCantDiasDeGarantia() {
        return cantDiasDeGarantia;
    }

    public void setCantDiasDeGarantia(int cantDiasDeGarantia) {
        this.cantDiasDeGarantia = cantDiasDeGarantia;
    }

    public static float getRecargoPorEnvio() {
        return recargoPorEnvio;
    }

    public static void setRecargoPorEnvio(float recargoPorEnvio) {
        ProductoElectrico.recargoPorEnvio = recargoPorEnvio;
    }

    @Override
    public float calcularGananciaObtenida(){

        if (getCantDiasDeGarantia() == 365){
            float ganancia = 45 * getCosto() / 100;
            return ganancia;
        }
        if (getCantDiasDeGarantia() <= 60){
            float ganancia = 15 * getCosto() / 100;
            return ganancia;
        }
        else{
            return 0;
        }
    }

    @Override
    public float calcularPrecioFinal(){
        float ganancia = this.calcularGananciaObtenida();
        float costo = getCosto();

        return costo + ganancia + recargoPorEnvio;

    }

    @Override
    public String tipoDeProducto(){
        return "Producto Electrico";
    }
}
