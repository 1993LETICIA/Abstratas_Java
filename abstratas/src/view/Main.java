package view;

import model.Comissionado;
import model.Horista;
import model.Producao;
import model.Gerente;
import model.FolhaPagamento;

public class Main {

    public static void main(String[] args) {
        Comissionado comissionado = new Comissionado("Juan", "99...", 1000, 10, 100);
        Gerente gerente = new Gerente("Maria", "88...", 10000);
        Producao producao = new Producao("Pedro", "77");
        producao.setQuantidadeProduzida(100);
        producao.setValorUnidade(25);

        Horista horista = new Horista("Paulo", "66");
        horista.setValorHora(80);
        horista.setTotalHoras(150);

        FolhaPagamento folhaPG = new FolhaPagamento();
        folhaPG.adicionaEmpregado(comissionado);
        folhaPG.adicionaEmpregado(gerente);
        folhaPG.adicionaEmpregado(producao);
        folhaPG.adicionaEmpregado(horista);

        ImprimeFolhaConsole console = new ImprimeFolhaConsole(folhaPG);
        console.imprime();
    }

}
