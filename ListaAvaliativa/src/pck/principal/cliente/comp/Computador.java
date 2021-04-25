package pck.principal.cliente.comp;

public class Computador {
	
	private String marca;
	private double preco;
	private MemoriaUSB memoria;
	private Componente componentes[];
	private SistOp sistop;
	
	public Computador(String marca, double preco,int quantComp, String sistop) {
		this.marca = marca;
		this.preco = preco;
		this.componentes = new Componente[quantComp];
		this.sistop = new SistOp(sistop); 	
	}
	
	

	public void addComponentes(Componente componente) {
		for(int i = 0; i < componentes.length; i++) {
			if(this.componentes[i] == null){
				componentes[i] = componente;
				break;	
			}
		}
	}
		
	public void addMemoria(MemoriaUSB mem) {
		this.memoria = mem;
	}
	
	public void mostraPcConfig() {
	
		System.out.println("Marca: " + this.marca);
		System.out.println("Preço: " + this.preco);
		System.out.println("Componentes do sistema: ");
		for (Componente componente : componentes) {
			System.out.println("Comp: " + componente.getNome()+ " " + componente.getTipo());
		}
        System.out.println("Memoria USB: " + memoria.getMarca() + " " + memoria.getCapacidade() );
        
	}


	//Getters and Setters

	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
	
	
	
	
	
	
	


	
	
	
}
