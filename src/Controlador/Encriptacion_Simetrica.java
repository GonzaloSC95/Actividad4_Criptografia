package Controlador;

import Modelo.Coche;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SealedObject;
import javax.crypto.SecretKey;

/**
 *
 * @author Gonzalo
 */
public class Encriptacion_Simetrica {

    private static KeyGenerator keygenerator;
    private static SecretKey secretKey;
    private static Cipher cifrador;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Método para encriptar un mensaje
     *
     * @param mensajeOriginal
     * @return byte[]
     * @throws Exception
     */
    public static byte[] mensajeEncriptado(String mensajeOriginal) throws Exception {
        System.out.println("1.Generador de claves creado");
        keygenerator = KeyGenerator.getInstance("AES");
        /////////////////////////----------------------------------
        System.out.println("2.Generando la clave simétrica");
        secretKey = keygenerator.generateKey();
        /////////////////////////----------------------------------
        System.out.println("3.Creando el cifrador/descifrador");
        cifrador = Cipher.getInstance("AES");
        /////////////////////////---------------------------------
        System.out.println("4.Configuramos el cifrador");
        cifrador.init(Cipher.ENCRYPT_MODE, secretKey);
        ///---------------------------------------------------------
        System.out.println("5.Ciframos el mensaje original");
        byte[] mensajeOriginalenBytes = mensajeOriginal.getBytes();
        //--------------------------------------------------------
        System.out.println("6.Mensaje cifrado");
        byte[] mensajeCifradoEnBytes = cifrador.doFinal(mensajeOriginalenBytes);
        String mensajeCirado = new String(mensajeCifradoEnBytes);
        System.out.println(mensajeCirado + "\n");
        ///----------------------------------------------------------------
        return mensajeCifradoEnBytes;
    }

    /////////////////////////////////////////////////////////////////////////////////
    /**
     * Método para desencriptar un mensaje
     *
     * @param mensajeEncriptado
     * @return String
     * @throws Exception
     */
    public static String mensajeDesEncriptado(byte[] mensajeEncriptado) throws Exception {
        System.out.println("1.Desciframos el criptograma");
        cifrador.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] mensajeDesencriptado = cifrador.doFinal(mensajeEncriptado);
        String mensajeDesEncriptado = new String(mensajeDesencriptado);
        System.out.println("Mensaje desencriptado: " + mensajeDesEncriptado + "\n");
        return mensajeDesEncriptado;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Método para encriptar un Coche
     *
     * @param c
     * @return SealedObject
     * @throws Exception
     */
    public static SealedObject cocheEncriptado(Coche c) throws Exception {
        System.out.println("1.Generador de claves creado");
        keygenerator = KeyGenerator.getInstance("AES");
        ////////////////////////////////////////////
        System.out.println("2.Generando la clave simetrica");
        secretKey = keygenerator.generateKey();
        ///////////////////////////////////////////////////
        System.out.println("3.Creando el cifrador/descifrador");
        cifrador = Cipher.getInstance("AES");
        //////////////////////////////////////////////////////
        System.out.println("4.Configurando el cifrador");
        cifrador.init(Cipher.ENCRYPT_MODE, secretKey);
        ////////////////////////////////////////////////////
        System.out.println("5.Cifrando el coche");
        SealedObject cocheCifrado = new SealedObject(c, cifrador);
        System.out.println("Coche original --> " + c);
        System.out.println("Coche cifrado --> " + cocheCifrado + "\n");
        ///////////////////////////////////////////////////////////////////////////////
        return cocheCifrado;
    }

    /**
     * Método para desencriptar un Coche
     *
     * @param cocheEncriptado
     * @return Coche
     * @throws Exception
     */
    public static Coche cocheDesEncriptado(SealedObject cocheEncriptado) throws Exception {
        System.out.println("1. Desencriptando coche");
        cifrador.init(Cipher.DECRYPT_MODE, secretKey);
        Coche cocheDesEncriptado = (Coche) cocheEncriptado.getObject(cifrador);
        System.out.println("Coche desencriptado: " + cocheDesEncriptado + "\n");
        return cocheDesEncriptado;
    }

}
