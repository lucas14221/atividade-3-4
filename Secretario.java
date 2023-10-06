package PraticaHeranca;

public class Secretario extends Funcionario {
	
	int numeroDeRamal;
	
	public Secretario(int numeroDeRamal){
		this.numeroDeRamal = numeroDeRamal;
	}

	public int getNumeroDeRamal() {
		return numeroDeRamal;
	}

	public void setNumeroDeRamal(int numeroDeRamal) {
		this.numeroDeRamal = numeroDeRamal;
	}
	
}
