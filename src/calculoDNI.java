public class calculoDNI {
    public static char calculoDNI (int numero) {

        int restoDNI;

        restoDNI = numero % 23;
   
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra;
        letra = letras.charAt(restoDNI);
       return letra;
    }
}



