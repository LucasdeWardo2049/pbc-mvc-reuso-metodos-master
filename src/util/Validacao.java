package util;

public class Validacao {

    public static void validarSomenteLetrasEEspaco(String texto) {
        if (!texto.matches("[a-zA-Z\\s]+")) {
            throw new RuntimeException("Somente pode conter letras e espaço.");
        }
    }

    public static void validarTamanhoMinimo(String texto, int tamanhoMinimo) {
        if (texto.length() < tamanhoMinimo) {
            throw new RuntimeException("O texto deve ter no mínimo " + tamanhoMinimo + " caracteres.");
        }
    }

    public static void validarTamanhoMaximo(String texto, int tamanhoMaximo) {
        if (texto.length() > tamanhoMaximo) {
            throw new RuntimeException("O texto deve ter no máximo " + tamanhoMaximo + " caracteres.");
        }
    }

    public static void validarEmail(String email) {
        if (!email.matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b")) {
            throw new RuntimeException("Email inválido.");
        }
    }

    public static void validarTelefone(String telefone) {

        String numeroTelefone = telefone.replaceAll("[^0-9]", "");

        validarTamanhoMaximo(numeroTelefone, 8);

        if (!numeroTelefone.matches("\\d+")) {
            throw new RuntimeException("Telefone inválido.");
        }
    }

}
