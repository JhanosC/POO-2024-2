import java.util.Random;

public class Lustre {

	private Lampada ls[];
	private int numLampadas = 0;

	public Lustre(int numMaxLampadas) {
		this.ls = new Lampada[numMaxLampadas];
	}

	public void adicionarLampada(Lampada l){
		if(numLampadas < ls.length){
			ls[numLampadas] = l;
			numLampadas++;
		}
	}

	public void ligar() {
		for(int i = 0; i < numLampadas; i++){
			ls[i].ligar();
		}
	}

	public void desligar() {
		for(int i = 0; i < numLampadas; i++){
			ls[i].desligar();
		}
	}

	public boolean lustreOK() {
		for(int i = 0; i < numLampadas; i++){
			if(ls[i].estaQueimada()){
				return false;
			}
		}
		return true;
	}

	public boolean trocarQueimadas(){
		for(int i = 0; i < numLampadas; i++){
			if(ls[i].estaLigada()){
				System.out.println("Lustre está ligado. Favor desligar para evitar risco de choque.");
				return false;
			}
		}
		for(int i = 0; i < numLampadas; i++){
			if(ls[i].estaQueimada()){
				ls[i] = new Lampada();
			}
		}
		return true;
	}

	public String toString() {
		if(lustreOK()){
			System.out.println();
			return ("Lustre está funcionando com suas " + ls.length + " lâmpadas!!!");
		}
		System.out.print("Lâmpada queimada nas posições: ");
		for(int i = 0; i < numLampadas; i++){
			if(ls[i].estaQueimada()){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		return ("Favor, trocar as lâmpadas");
	}
}

