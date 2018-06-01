
import Datos.Danioaca;
import Logica.Lanioaca;

public class test {
    public static void main(String[] args) {
        Lanioaca oLanioaca = new Lanioaca();
        Danioaca oDanioaca = new Danioaca();
//        oDanioaca.setIdanio(1);
        oDanioaca.setAnioactual("2019");
        oDanioaca.setFechin("01/03/2019");
        oDanioaca.setFechfin("01/12/2019");
        oLanioaca.insertar(oDanioaca);
        System.out.println("Registro Correcto");
}
}
