package Entities;

import java.util.List;

import enums.WorkerLevel;

public class Trabalhador {
	
    private String nome;
    private WorkerLevel nivel;
    private Double salarioBase;
    
    private Departamento departamento;
    private List <ContratoHora> contratos;
    
    
    
    public Trabalhador ()
    {
    	
    }



	public Trabalhador(String nome, WorkerLevel nivel, Double salarioBase, Departamento departamento,
			List<ContratoHora> contratos) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
		this.contratos = contratos;
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



	public Departamento getDepartamento() {
		return departamento;
	}



	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}



	public List<ContratoHora> getContratos() {
		return contratos;
	}



	public void setContratos(List<ContratoHora> contratos) {
		this.contratos = contratos;
	}
    

    

    
    
}
