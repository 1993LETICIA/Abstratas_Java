package model;
public class Producao extends Empregado{
    private double valorUnidade;
    private double quantidadeProduzida;
    public Producao(String nome, String fone ){
        super(nome,fone,"Produção");
        
    }
    @Override
    public double salario(){
        return valorUnidade * quantidadeProduzida;
    }

    public double getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public double getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(double quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }
    
}