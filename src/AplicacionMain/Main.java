package AplicacionMain;

import Controlador.Encriptacion_Asimetrica;
import Controlador.Encriptacion_Simetrica;
import Modelo.Coche;
import Vista.Crypto;
import javax.crypto.SealedObject;

/**
 *
 * @author Gonzalo
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        //////////////
//        byte[] auxb;
//        String auxs;
//        Coche auxc;
//        SealedObject auxS;
        /////////////
        try {
            Crypto c = new Crypto();
            ///////////////////ENCRIPTACIÓN SIMETRICA////////////////////////////
//            String mensaje = "Esto es un mensaje de prueba cualquiera";
//            Coche c = new Coche("045XXY", "Citroen", "C.3.", 20500);
//            ////////////////////////////////////////////////////////////////
//            auxb = Encriptacion_Simetrica.mensajeEncriptado(mensaje);
//            System.out.println("Mensaje encriptado ----> " + auxb + "\n");
//            auxs = Encriptacion_Simetrica.mensajeDesEncriptado(auxb);
//            System.out.println("\nMensaje desencriptado ----> " + auxs + "\n");
//            auxS=Encriptacion_Simetrica.cocheEncriptado(c);
//            System.out.println("Coche encriptado ----> " + auxS + "\n");
//            auxc=Encriptacion_Simetrica.cocheDesEncriptado(auxS);
//            System.out.println("Coche desencriptado ----> " + auxc + "\n");
//            
//            
//             ///////////////////ENCRIPTACIÓN ASIMETRICA////////////////////////////
//            auxb = Encriptacion_Asimetrica.mensajeEncriptado(mensaje);
//            System.out.println("Mensaje encriptado ----> " + auxb + "\n");
//            auxs = Encriptacion_Asimetrica.mensajeDesEncriptado(auxb);
//            System.out.println("\nMensaje desencriptado ----> " + auxs + "\n");
//            auxS=Encriptacion_Asimetrica.cocheEncriptado(c);
//            System.out.println("Coche encriptado ----> " + auxS + "\n");
//            auxc=Encriptacion_Asimetrica.cocheDesEncriptado(auxS);
//            System.out.println("Coche desencriptado ----> " + auxc + "\n");
            
        } catch (Exception e) {
            System.out.println("Error ---> " + e.getLocalizedMessage());
        }

    }

}
