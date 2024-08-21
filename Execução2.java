package Agosto21;

public class Execução2 {

	public static void main(String[] args) {
		Usuário usuario = new Usuário();

		usuario.setnome("Giovana Araujo");
		usuario.setpermissao("permitido navegar dados");
		usuario.setusuario("admin");
		usuario.setID(1111);
		usuario.setpassword(123456);
		
		System.out.println("       USUÁRIO       ");
		System.out.println(usuario.getnome());
		System.out.println(usuario.getpermissao());
		System.out.println(usuario.getusuario());
		System.out.println(usuario.getID());
		System.out.println(usuario.getpassword());
		System.out.println("       AÇÕES       ");
		System.out.println(usuario.cadastrar());
		System.out.println(usuario.acessar());
		System.out.println(usuario.procurar());
		System.out.println(usuario.navegar());

	}}