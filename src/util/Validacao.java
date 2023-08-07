package util;

public class Validacao {

    public static void validarSomenteLetrasEEspaco(String texto){
        if(!texto.matches("[a-zA-Z\\s]+")){
          throw new RuntimeException("Somente pode conter letras e espaço.");
        }
    }

}
