public class esercizio34di1 {
    public static void main(String[] args) {
        System.out.println(checkString("esto es un String"));
    }

    private static String checkString(String valor) {
        String resultado = valor.length() >= 10 ? "Largo mayor o igual de 10" : "Largo menor de 10";
        return resultado;
    }
}
