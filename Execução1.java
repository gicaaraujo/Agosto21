package Agosto21;

public class Execução1 {

	public static void main(String[] args) {
		Computador computador = new Computador();

		computador.setmodelo("XCT-895");
		computador.setcor("preto");
		computador.setID(123456);
		
		System.out.println("      COMPUTADOR      ");
		System.out.println(computador.getmodelo());
		System.out.println(computador.getcor());
		System.out.println(computador.getID());
		System.out.println("       AÇÕES       ");
		System.out.println(computador.ligar());
		System.out.println(computador.processar());
		System.out.println(computador.reiniciar());
		System.out.println(computador.desligar());

	}}