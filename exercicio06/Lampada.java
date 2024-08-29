import java.util.Random;

public class Lampada {

	private boolean ligada;
	private boolean queimada;
	private Random rand = new Random();

	public Lampada() {
		ligada = false;
		queimada = false;
	}

	public void ligar() {
		if(!queimada){
			ligada = true;
			if (rand.nextInt(100) < 5){
				queimada = true;
				ligada = false;
			}
		}
	}

	public void desligar() {
		ligada = false;
	}

	public boolean estaLigada() {
		return ligada;
	}

	public boolean estaQueimada(){
		return queimada;
	}

	public String toString() {
		if (ligada)
		    return "A lampada esta ligada";
		else
		    return "A lampada nao esta ligada";
	}
}
