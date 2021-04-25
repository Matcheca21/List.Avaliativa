package pck.principal.cliente;

import pck.principal.cliente.comp.*;

public class Cliente {
	
	
	private String nome;
	private long cpf;
	private Computador pc[];
	
	public Cliente(String nome, long cpf, int qtdComputador) {
		this.nome = nome;
		this.cpf = cpf;
		this.pc = new Computador[qtdComputador];
		
	}
	
	public double calculaCompra() {
		double acumula = 0;
		for(int i = 0; i < pc.length; i++) {
			acumula += pc[i].getPreco();
		}
		return acumula;
	}
	
	
	public void addComputador(Computador not) {
		for(int i = 0; i < pc.length; i++) {
			if(this.pc[i] == null){
				pc[i] = not;
				break;
			}
			
		}
			
	}
	
	
	}
	
	
	


