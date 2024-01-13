public class ConversorDeDolarEmReais {

    public static void main(String[] args) {

        double valorEmDolares = 53.30;
        double cambioDeDolarParaReal = (valorEmDolares * 4.85);

        System.out.println(String.format("O valor de %.2f dolares equivale a %.2f reais..", valorEmDolares, cambioDeDolarParaReal));
    }
}
