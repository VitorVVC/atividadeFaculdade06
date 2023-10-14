package entities;

public abstract class Veiculo {
    // Criacão as variaveis de  Veiculo
    protected int quantidadeRodas;
    protected double valorCompra;
    protected int anoCompra;
    protected int anoAtual;

    // Construtor do método veiculo
    public Veiculo(int quantidadeRodas, double valorCompra, int anoCompra,int anoAtual) {
        this.quantidadeRodas = validarInt(quantidadeRodas);
        this.valorCompra = validarDouble(valorCompra);
        this.anoCompra = validarInt(anoCompra);
        this.anoAtual = validarInt(anoAtual);
    }

    // Métodos de validar para evitar num inteiros negativos
    public int validarInt(int valor) {
        return (valor < 0) ? 0 : valor;
    }

    // Métodos de validar para evitar num double negativos
    public double validarDouble(double valor) {
        return (valor < 0) ? 0 : valor;
    }

    // Método abstract para todos que herdarem de veiculo serem obrigados a por um método que retorne um valor de venda
    public abstract double valorVenda();

    // Getters and Setters
    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getAnoCompra() {
        return anoCompra;
    }

    public void setAnoCompra(int anoCompra) {
        this.anoCompra = anoCompra;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }
}
