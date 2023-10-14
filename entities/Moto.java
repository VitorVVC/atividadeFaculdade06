package entities;

public class Moto extends Veiculo {
    // Criar a variavel numCilindradas para moto
    private int numCilindradas;
    // Construtor de moto herdando no super o construtor de veiculo e também o numCilindradas da moto
    public Moto(int quantidadeRodas, double valorCompra, int anoCompra,int anoAtual,int numCilindradas) {
        super(quantidadeRodas, valorCompra, anoCompra,anoAtual);
        this.numCilindradas = numCilindradas;
    }
    // Método sobrescrito de valorVenda
    @Override
    public double valorVenda() {
        double valorVenda = 0;
        if (anoAtual - this.anoCompra > 5) {
            valorVenda = valorCompra * 0.7;
        } else {
            valorVenda = valorCompra * 0.3;
        }
        return valorVenda;
    }
    @Override
    public String toString() {
        return String.format("Informacões da moto: %n"
                +"Quantidade de rodas: %d%n"
                +"Valor de Compra: %.3f%n"
                +"Ano de compra: %d%n"
                +"Numero de cilindradas: %d%n"
                +"Valor de venda: %.3f%n",quantidadeRodas,valorCompra,anoCompra,numCilindradas,valorVenda());
    }
    // Apenas um get para retornar o valor de numCilindradas
    public int getNumCilindradas() {
        return numCilindradas;
    }
}
