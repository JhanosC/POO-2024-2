public class TesteLampada {

	public static void main(String[] args) {
		Lustre lustre = new Lustre(10);
		for(int i = 0; i < 10; i++){
			lustre.adicionarLampada(new Lampada());
		}
		for(int i = 0; i < 5; i++){
			lustre.desligar();
			lustre.ligar();
		}
		System.out.println(lustre.toString());
		lustre.trocarQueimadas();
		lustre.toString();
		lustre.desligar();
		lustre.trocarQueimadas();
		System.out.println(lustre.toString());
	}
}
