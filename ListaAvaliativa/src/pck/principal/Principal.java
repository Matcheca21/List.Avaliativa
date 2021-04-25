package pck.principal;

import pck.principal.cliente.*;
import pck.principal.cliente.comp.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cliente cliente = new Cliente("Matheus",12345 , 2);
	
		
		Computador pc = new Computador("Venom Extreme", 100, 4, "Windows Vista");
		Computador pc2 = new Computador("Mec", 1000, 4, "IOS");
		
		pc.addComponentes(new Componente("GPU", "GTX GeForce 1080"));
		pc.addComponentes(new Componente("CPU", "Intel i7"));
		pc.addComponentes(new Componente("SSD", "250GB"));
		pc.addComponentes(new Componente("RAM", "64G"));
		pc.addMemoria(new MemoriaUSB("Kingdown", 32));
		pc.mostraPcConfig();
		
		System.out.println("");
				
		cliente.addComputador(pc);
		
		pc2.addComponentes(new Componente("GPU", "GTX GeForce 650"));
		pc2.addComponentes(new Componente("CPU", "Intel i5"));
		pc2.addComponentes(new Componente("SSD", "250GB"));
		pc2.addComponentes(new Componente("RAM", "32G"));
		pc2.addMemoria(new MemoriaUSB("Multilaser", 32));
		pc2.mostraPcConfig();
		
		cliente.addComputador(pc2);
		
		System.out.println(" ");
		
		System.out.println("Valor da compra: " + cliente.calculaCompra());
		

	}

}
