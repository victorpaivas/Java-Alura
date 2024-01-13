public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 +8.0) /3;
        System.out.println(media);

        String sinopse;
        //Text Block
        sinopse = """
                Filme Top Gun
                Filme de aventura com ator dos anos 80
                Muito bom!
                Ano de lançamento
                """;

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}