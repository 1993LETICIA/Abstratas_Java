package view;

import model.FolhaPagamento;
import java.io.PrintStream;
import model.FolhaPagamento;
import model.Empregado;

public class ImprimeFolhaConsole {

    private FolhaPagamento folha;
    private PrintStream console;

    public ImprimeFolhaConsole(FolhaPagamento folhaPagamento) {
        this.folha = folhaPagamento;
        this.console = System.out;
    }

    public void imprime() {
        if (this.folha == null) {
return;
        } 
        for (Empregado emp : this.folha.getEmpregados()) {
            console.println();
            console.printf("Nome: %s\n", emp.getNome());
            console.printf("Tipo: %s\n", emp.getTipoSalario());
            console.printf("Salario: R$%.2f\n", emp.salario());
        }
    }
}
