public class Produto {

    public static void main(String[] args) {

        // Desafio 4 valor total estoque
        double precoProduto = 5.50;
        int quantidade = 7;

        double valorTotalProduto = (precoProduto * quantidade);
        // O placeholder %.2f exibe sobe duas casas decimais do float
        System.out.println(String.format("O valor total do produto em estoque é de R$%.2f", valorTotalProduto));

        //Desafio 6 desconto
        double precoOriginal = 35.90;
        int percentualDesconto = 10;

        double descontoProduto = (precoOriginal * percentualDesconto) /100;

        double precoFinalComDesconto = precoOriginal - descontoProduto;

        System.out.println(String.format("O valor do produto é de R$%.2f com %d porcento de desconto o produto sai por R$%.2f", precoOriginal, percentualDesconto, precoFinalComDesconto));
    }
}
