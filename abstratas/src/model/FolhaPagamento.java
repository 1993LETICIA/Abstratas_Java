package model;

import java.util.ArrayList;
import java.util.List;

public class FolhaPagamento {

    private List<Empregado> empregados;

    public FolhaPagamento() {
        this.empregados = new ArrayList<Empregado>();
    }

    public void adicionaEmpregado(Empregado emp) {
        if (emp == null) {
            return;
        }
        this.empregados.add(emp);
    }

    public List<Empregado> getEmpregados() {
        return this.empregados;
    }
}
