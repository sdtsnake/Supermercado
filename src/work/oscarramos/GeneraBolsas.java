package work.oscarramos;

import work.oscarramos.modelo.Fruta;
import work.oscarramos.modelo.Lacteo;
import work.oscarramos.modelo.Limpieza;
import work.oscarramos.modelo.NoPerecible;
import work.oscarramos.repositorio.BolsaSupermercado;

public class GeneraBolsas
{
    public static void main(String[] args) {
        boolean siTitulo = true;

        BolsaSupermercado<Lacteo> bolsaLacteo = new BolsaSupermercado<>();
        BolsaSupermercado<Fruta> bolsaFruta = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPrecible = new BolsaSupermercado<>();

        //Lacteos
        bolsaLacteo.addProducto(new Lacteo("Queso Costeño",12000.00,1,100));
        bolsaLacteo.addProducto(new Lacteo("Postre tres leches",5000.00,5,50));
        bolsaLacteo.addProducto(new Lacteo("Flan",2500.00,10,25));
        bolsaLacteo.addProducto(new Lacteo("Queso Campesino",7500.00,2,45));
        bolsaLacteo.addProducto(new Lacteo("Leche liquida",2800.00,3,15));

        for(Lacteo lacteo : bolsaLacteo.getProductos()){
            if(siTitulo){
                System.out.println("===============================");
                System.out.println("Contenio de la bolsa de lacteos");
                System.out.println("===============================");
                siTitulo = false;
            }

            System.out.println("Nombre           : " + lacteo.getNombre());
            System.out.println("Precio           : " + lacteo.getPrecio());
            System.out.println("Cantidad         : " + lacteo.getCantidad());
            System.out.println("Gramos protenias : " + lacteo.getProtenias());
            System.out.println("===============================");
        }

        //frutas
        siTitulo = true;
        bolsaFruta.addProducto(new Fruta("Guayaba Manzana",500.00,90.00,"verde"));
        bolsaFruta.addProducto(new Fruta("Mago",800.00,65.00,"Amarillo"));
        bolsaFruta.addProducto(new Fruta("Mandarina",785.00,30.00,"Sapote"));
        bolsaFruta.addProducto(new Fruta("Banano",1200.00,98.00,"Amarillo"));
        bolsaFruta.addProducto(new Fruta("Sandia",4500.00,320.00,"verde"));

        for(Fruta fruta : bolsaFruta.getProductos()){
            if(siTitulo){
                System.out.println("Contenio de la bolsa de Furtas");
                System.out.println("===============================");
                siTitulo = false;
            }

            System.out.println("Nombre           : " + fruta.getNombre());
            System.out.println("Precio           : " + fruta.getPrecio());
            System.out.println("Peso en gramos   : " + fruta.getPeso());
            System.out.println("Color            : " + fruta.getColor());
            System.out.println("===============================");
        }
        //limpieza
        siTitulo = true;
        bolsaLimpieza.addProducto(new Limpieza("Limpido patogito",7500.00,"Legia",1));
        bolsaLimpieza.addProducto(new Limpieza("Detergente liquido",5000.00,"Hidroxido de sodio",5));
        bolsaLimpieza.addProducto(new Limpieza("Desmanchador",13000.00,"Peroxido de hidrogeno",3));
        bolsaLimpieza.addProducto(new Limpieza("Aromatizador de pisos",18000.00,"Fragacia de lavanda",4));
        bolsaLimpieza.addProducto(new Limpieza("Ajax",5500.00,"Sulfato de sodio",2));
        for(Limpieza limpieza : bolsaLimpieza.getProductos()){
            if(siTitulo){
                System.out.println("Contenio de la bolsa Limpieza");
                System.out.println("===============================");
                siTitulo = false;
            }

            System.out.println("Nombre           : " + limpieza.getNombre());
            System.out.println("Precio           : " + limpieza.getPrecio());
            System.out.println("Componentes      : " + limpieza.getComponentes());
            System.out.println("Cantidad litros  : " + limpieza.getLitros());
            System.out.println("===============================");
        }
        //no perecederos
        siTitulo = true;
        bolsaNoPrecible.addProducto(new NoPerecible("Fideos la muñeca",2500.00,250,300));
        bolsaNoPrecible.addProducto(new NoPerecible("Sandinas",8000.00,350,1200));
        bolsaNoPrecible.addProducto(new NoPerecible("Malones enlatados",3000.00,150,250));
        bolsaNoPrecible.addProducto(new NoPerecible("Sal",800.00,500,35));
        bolsaNoPrecible.addProducto(new NoPerecible("Frijoles enlatados",4500.00,400,2500));
        for(NoPerecible noPerecible : bolsaNoPrecible.getProductos()){
            if(siTitulo){
                System.out.println("Contenio de la bolsa No perecederos");
                System.out.println("===============================");
                siTitulo = false;
            }

            System.out.println("Nombre           : " + noPerecible.getNombre());
            System.out.println("Precio           : " + noPerecible.getPrecio());
            System.out.println("contenido en gr  : " + noPerecible.getContenido());
            System.out.println("calorias         : " + noPerecible.getCalorias());
            System.out.println("===============================");
        }




    }
}
