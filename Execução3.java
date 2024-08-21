package Agosto21;

public class Execução3 {

	public static void main(String[] args) {
		Fornecedor fornecedor = new Fornecedor();

		fornecedor.setnomefantasia("Giovana Araujo-ME");
		fornecedor.setrazaosocial("VitalCare-clinica");
		fornecedor.setendereço("rua flores, 567, villa nova");
		fornecedor.setfone("15998877441");
		fornecedor.setemail("vitalcare@gmail.com");
		fornecedor.setinscricaoestadual("1234566");
		fornecedor.setcnpj("9987745");
		fornecedor.setID(1111);


		System.out.println("       fornecedor       ");
		System.out.println(fornecedor.getnomefantasia());
		System.out.println(fornecedor.getrazaosocial());
		System.out.println(fornecedor.getendereço());
		System.out.println(fornecedor.getfone());
		System.out.println(fornecedor.getemail());
		System.out.println(fornecedor.getfone());
		System.out.println(fornecedor.getinscricaoestadual());
		System.out.println(fornecedor.getcnpj());
		System.out.println("       AÇÕES       ");
		System.out.println(fornecedor.vender());
		System.out.println(fornecedor.carregar());
		System.out.println(fornecedor.registrar());
		System.out.println(fornecedor.entregar());

	}}