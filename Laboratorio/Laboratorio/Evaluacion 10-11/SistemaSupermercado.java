package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

public class SistemaSupermercado implements SistemaDeVentas{

    private String nombre;
    private HashSet<ProductoDeSuper> productosALaVenta;
    private ArrayList<ProductoDeSuper> productosVendidos;


    public SistemaSupermercado(String nombre) {
        this.nombre = nombre;
        this.productosALaVenta = new HashSet<>();
        this.productosVendidos = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<ProductoDeSuper> getProductosALaVenta() {
        return productosALaVenta;
    }

    public void setProductosALaVenta(HashSet<ProductoDeSuper> productosALaVenta) {
        this.productosALaVenta = productosALaVenta;
    }

    public ArrayList<ProductoDeSuper> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(ArrayList<ProductoDeSuper> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    Scanner stringInput = new Scanner(System.in);
    Scanner intInput = new Scanner(System.in);
    Scanner floatInput = new Scanner(System.in);

    @Override
    public float gananciaTotalObtenida() {
        float gananciaObtenida = 0;

        for (ProductoDeSuper prod : productosVendidos) {
            gananciaObtenida += prod.calcularGananciaObtenida();
        }
        return gananciaObtenida;
    }

    @Override
    public float ingresosTotales() {
        float ingresosTotales = 0;

        for (ProductoDeSuper prod : productosVendidos) {
            ingresosTotales += prod.calcularPrecioFinal();
        }
        return ingresosTotales;
    }

    @Override
    public int cantidadDeProductosVendidos() {
        return productosVendidos.size();
    }


    public void serializar(){

        try{

            ObjectMapper mapper1 = new ObjectMapper();

            HashMap<String, Object> mapASerializar = new HashMap<>();
            ArrayList<ProductoDeSuper> productos = new ArrayList<>();

            ProductoDeSuper prod1 = new ProductoDeCalefaccion("Aire acondicionado", "Argentina", 404043, 50000, 300, 600);

            productos.add(prod1);

            mapASerializar.put("producto", productos);

            String objectoJson = mapper1.writeValueAsString(mapASerializar);
            System.out.println(objectoJson);

            File archivo = new File("src/com/company/productos.json");

            mapper1.writeValue(archivo, mapASerializar);



        }
        catch (JsonProcessingException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

      public void deserializar() {
        serializar();
        File archivo = new File("src/com/company/productos.json");

          try {
             ObjectMapper mapper1 = new ObjectMapper();

             HashMap map1 = mapper1.readValue(archivo, HashMap.class);
             System.out.println(map1);
         }
         catch (JsonProcessingException e){
             e.printStackTrace();
         }
         catch (IOException e) {
             e.printStackTrace();
         }
    }

    public HashSet<String> aptoParaHipertensos(){

        HashSet<String> nombres = new HashSet<>();

        for (ProductoDeSuper prod : productosALaVenta) {
            if (prod.getClass().getName().equals("ProductoNoPerecedero")){

                ProductoNoPerecedero productoNoPerecedero = (ProductoNoPerecedero) prod;
                int mgDeSodio = ((ProductoNoPerecedero) prod).getMgDeSodio();

                if (mgDeSodio <= 1500){
                    String nombre = prod.getNombre();
                    nombres.add(nombre);
                }
            }
        }

        return nombres;
    }


    public HashMap<Integer, Float> productosRefrigerantesConGranCapacidad(){

        HashMap<Integer, Float> refrigerantesConGranCapacidad = new HashMap<>();

        for (ProductoDeSuper prod : productosALaVenta) {

            if(prod.getClass().getName().equals("ProductoDeRefrigeracion")){

                ProductoDeRefrigeracion productoDeRefrigeracion = (ProductoDeRefrigeracion) prod;
                float litrosDeCapacidad = ((ProductoDeRefrigeracion) prod).getLitrosDeCapacidad();
                String origen = prod.getOrigen();


                if((litrosDeCapacidad >= 300) && (origen.equals("argentino"))){

                    int codigo = prod.getCodigo();
                    refrigerantesConGranCapacidad.put(codigo, litrosDeCapacidad);
                }
            }
        }

        return refrigerantesConGranCapacidad;
    }


    public void agregarProductoVendido(){
        System.out.println("---- Agregar Producto Vendido ----");
        System.out.println("\nQue producto quiere agregar:");
        System.out.println("\n1 - ProductoDeCalefaccion");
        System.out.println("2 - ProductoDeRefrigeracion");
        System.out.println("3 - ProdcutoPerecedero");
        System.out.println("4 - ProductoNoPerecedero");
        int input = Scan.obtenerInt();
        boolean bool = true;
        while (true) {
            try {
                switch (input) {

                    case 1: {
                        System.out.println("\n\nIngrese los datos del producto");
                        System.out.println("\nNombre: ");
                        String nombre = Scan.obtenerString();
                        System.out.println("Origen: ");
                        String origen = Scan.obtenerString();
                        System.out.println("Codigo: ");
                        int codigo = Scan.obtenerInt();
                        System.out.println("Costo: ");
                        float costo = Scan.obtenerFLoat();
                        System.out.println("cantDiasDeGarantia: ");
                        int cantDiasDeGarantia = Scan.obtenerInt();
                        System.out.println("wattsDePotenciaMax: ");
                        float wattsDePotenciaMax = Scan.obtenerFLoat();

                        ProductoDeCalefaccion productoDeCalefaccion = new ProductoDeCalefaccion(nombre, origen, codigo, costo, cantDiasDeGarantia, wattsDePotenciaMax);
                        productosVendidos.add(productoDeCalefaccion);
                        bool = false;
                        break;
                    }

                    case 2: {

                        System.out.println("\n\nIngrese los datos del producto");
                        System.out.println("\nNombre: ");
                        String nombre = Scan.obtenerString();
                        System.out.println("Origen: ");
                        String origen = Scan.obtenerString();
                        System.out.println("Codigo: ");
                        int codigo = Scan.obtenerInt();
                        System.out.println("Costo: ");
                        float costo = Scan.obtenerFLoat();
                        System.out.println("cantDiasDeGarantia: ");
                        int cantDiasDeGarantia = Scan.obtenerInt();
                        System.out.println("litrosDeCapacidad: ");
                        float litrosDeCapacidad = Scan.obtenerFLoat();

                        ProductoDeRefrigeracion productoDeRefrigeracion = new ProductoDeRefrigeracion(nombre, origen, codigo, costo, cantDiasDeGarantia, litrosDeCapacidad);
                        productosVendidos.add(productoDeRefrigeracion);
                        bool = false;
                        break;
                    }

                    case 3: {

                        System.out.println("\n\nIngrese los datos del producto");
                        System.out.println("\nNombre: ");
                        String nombre = Scan.obtenerString();
                        System.out.println("Origen: ");
                        String origen = Scan.obtenerString();
                        System.out.println("Codigo: ");
                        int codigo = Scan.obtenerInt();
                        System.out.println("Costo: ");
                        float costo = Scan.obtenerFLoat();
                        System.out.println("cantDiasParaVencerse: ");
                        int cantDiasParaVencerse = Scan.obtenerInt();
                        System.out.println("temperaturaMinimaDeFrio: ");
                        int temperaturaMinimaDeFrio = Scan.obtenerInt();

                        ProductoPerecedero productoPerecedero = new ProductoPerecedero(nombre, origen, codigo, costo, cantDiasParaVencerse, temperaturaMinimaDeFrio);
                        productosVendidos.add(productoPerecedero);
                        bool = false;
                        break;
                    }

                    case 4: {

                        System.out.println("\n\nIngrese los datos del producto");
                        System.out.println("\nNombre: ");
                        String nombre = Scan.obtenerString();
                        System.out.println("Origen: ");
                        String origen = Scan.obtenerString();
                        System.out.println("Codigo: ");
                        int codigo = Scan.obtenerInt();
                        System.out.println("Costo: ");
                        float costo = Scan.obtenerFLoat();
                        System.out.println("cantDiasParaVencerse: ");
                        int cantDiasParaVencerse = Scan.obtenerInt();
                        System.out.println("mgDeSodio: ");
                        int mgDeSodio = Scan.obtenerInt();

                        ProductoNoPerecedero productoNoPerecedero = new ProductoNoPerecedero(nombre, origen, codigo, costo, cantDiasParaVencerse, mgDeSodio);
                        productosVendidos.add(productoNoPerecedero);
                        bool = false;
                        break;
                    }
                }
            } catch (Exception InputMismatchException) {
                System.out.println("Debe ingresar los valores correctamente!!!!");
            }
            if (!bool) break;
        }
    }
}


class Scan {

    public static String obtenerString() {
        Scanner ingreso = new Scanner(System.in);
        String valorIngresado = ingreso.nextLine();
        return valorIngresado;
    }
    public static int obtenerInt() {
        Scanner ingreso = new Scanner(System.in);
        int valorIngresado = ingreso.nextInt();
        return valorIngresado;
    }

    public static float obtenerFLoat(){
        Scanner ingreso = new Scanner(System.in);
        float valorIngresado = ingreso.nextFloat();
        return valorIngresado;
    }
}
