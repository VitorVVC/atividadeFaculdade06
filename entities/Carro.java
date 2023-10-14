package entities;

public class Carro extends Veiculo {
    // Cria a as variaveis de carro
    private int quantidadePortas;
    // Construtor herdando no super as variaveis de Veiculo e incluindo a quantidadePortas da classe carro
    public Carro(int quantidadeRodas, double valorCompra, int anoCompra,int anoAtual,int quantidadePortas) {
        super(quantidadeRodas, valorCompra, anoCompra,anoAtual);
        this.quantidadePortas = quantidadePortas;
    }
    // Sobrescrita do método valorVenda herdado por veiculo
    @Override
    public double valorVenda() {
        double valorVenda = 0;
        if(anoAtual - this.anoCompra > 5){
            valorVenda = valorCompra * 0.3;
        }else{
            valorVenda = valorCompra * 0.7;
        }
        return valorVenda;
    }
    // Apenas um get par aretornar o valor de quantidade de portas
    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    @Override
    public String toString() {
        return String.format("Informacões do carro: %n"
                            +"Quantidade de rodas: %d%n"
                            +"Valor de Compra: %.3f%n"
                            +"Ano de compra: %d%n"
                            +"Quantidade de portas: %d%n"
                            +"Valor de venda: %.3f%n",quantidadeRodas,valorCompra,anoCompra,quantidadePortas,valorVenda());
    }
}
