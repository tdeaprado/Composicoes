package Entities;

import enums.WorkerLevel;

public class Trabalhador {
	
    private String nome;
    private WorkerLevel nivel;
    private Double salarioBase;
    
    public Trabalhador ()
    {
    	
    }
    
	public Trabalhador(String nome, WorkerLevel nivel, Double salarioBase) {
		super();
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
	}
    
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public WorkerLevel getNivel() {
		return nivel;
	}

	public void setNivel(WorkerLevel nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}


    
    
}
