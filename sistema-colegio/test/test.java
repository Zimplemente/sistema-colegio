
import Datos.Danioaca;
import Logica.Lanioaca;

public class test {
    public static void main(String[] args) {
//        Lanioaca oLanioaca = new Lanioaca();
//        Danioaca oDanioaca = new Danioaca();
////        oDanioaca.setIdanio(1);
//        oDanioaca.setAnioactual("2019");
//        oDanioaca.setFechin("01/03/2019");
//        oDanioaca.setFechfin("01/12/2019");
//        oLanioaca.insertar(oDanioaca);
//        System.out.println("Registro Correcto");
    String nombre = "JOSE ALEXANDER";
        System.out.println(nombre.length());
        String pnombre = "";
        String snombre = "";
        
//        if(nombre.indexOf(" ")!=-1){
            pnombre = nombre.substring(0,nombre.indexOf(" "));
            snombre = nombre.substring(nombre.indexOf(" "));
            snombre = snombre.trim().substring(0,2);
//            System.out.println(nombre.substring(0,nombre.indexOf(" ")));
//        }
//        if(nombre.lastIndexOf(" ")!=-1){
//            snombre = nombre.substring(nombre.lastIndexOf(nombre));
//            snombre = snombre.substring(0,2);
////            System.out.println(nombre.substring(nombre.indexOf(" "),nombre.indexOf(" ")+3));
//        }
        nombre = pnombre + snombre;
        System.out.println(nombre);
    }
}
