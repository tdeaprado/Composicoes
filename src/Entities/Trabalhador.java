package Entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import enums.WorkerLevel;

public class Trabalhador {
	
    private String nome;
    private WorkerLevel nivel;
    private Double salarioBase;
    
    private Departamento departamento;
    private List <ContratoHora> contratos = new ArrayList<>();
    
    
    
    public Trabalhador ()
    {
    	
    }



	public Trabalhador(String nome, WorkerLevel nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
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
	
	public Double salario (int ano, int mes) {
		double soma = salarioBase;
		Calendar cal =Calendar.getInstance();
		
		for (ContratoHora c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
		    int c_mes = 1 +cal.get(Calendar.MONTH); // mes começa com 0 -> add 1//
		    
			if (ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
				
			}
		}
		
		return soma;
	}
    

	public void addContrato (ContratoHora contrato) {
		contratos.add(contrato);
		
	}
    
	public void removeContrato (ContratoHora contrato) {
		contratos.remove(contrato);
		
	}

    
    
}
