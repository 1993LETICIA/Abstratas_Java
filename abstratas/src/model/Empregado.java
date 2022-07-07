package model;

public abstract class Empregado {
	private String nome;
	private String fone;
        private String tipoSalario;
		
	public Empregado(String nome, String fone, String tipoSal) {
		this.nome = nome;
		this.fone = fone;
                this.tipoSalario = tipoSal;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getFone() {
		return this.fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}

    public String getTipoSalario() {
        return tipoSalario;
    }

    public void setTipoSalario(String tipoSalario) {
        this.tipoSalario = tipoSalario;
    }
	
	// Método Abstrato
	public abstract double salario();
}
