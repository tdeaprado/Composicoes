package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.ContratoHora;
import Entities.Departamento;
import Entities.Trabalhador;
import enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		
		System.out.print("Entre o nome do departamento:");
		var departmentName = sc.nextLine();
		System.out.println("Entre os dados do trabalhor:");
		System.out.println("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.println("Nível: ");
		String workerLevel = sc.nextLine();
		System.out.println("Salario Base: ");
		double salarioBase = sc.nextDouble();
		
		Trabalhador t1 = new Trabalhador (nomeTrabalhador,WorkerLevel.valueOf(workerLevel),salarioBase, new Departamento (departmentName));
		
		System.out.println("Escreve o n de contratos:");
		int n = sc.nextInt();
		
		for (int i=1; i<=n;i++) {
			
			System.out.println("Entre os dados do contrato # "+ i+" : ");
			System.out.println("Data (DD/MM/YYYY) : ");
			System.out.println();
		    Date contractDate =  sdf.parse(sc.next());
			System.out.println("Valor por hora:");
			double valorPorHora = sc.nextDouble();
			System.out.println("Duracao Hora:");
			int horas = sc.nextInt();
			ContratoHora contrato = new ContratoHora (contractDate,valorPorHora,horas);
			t1.addContrato(contrato);
			
		}
		
		
		System.out.println();
		System.out.println(" Entre mes e ano para calcular salário (MM/YYYY):");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("Nome:  "+t1.getNome());
		System.out.println("Departamento: "+t1.getDepartamento());
		System.out.println("Salario para "+mesAno+":"+String.format("%2.f", t1.salario(mes, ano)));

		

		sc.close();

	}

}
