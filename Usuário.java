package Agosto21;

public class Usuário {

	String nome;
	String permissao;
	String usuario;
	int ID;
	int password;

	public String getnome () {
		return nome;
	}
	
	public void setnome (String nome) {
		this.nome = nome;
	}
	
	public String getpermissao () {
		return permissao;
	}
	
	public void setpermissao (String permissao) {
		this.permissao = permissao;
	}
	public String getusuario () {
		return usuario;
	}
	
	public void setusuario (String usuario) {
		this.usuario = usuario;
	}
	public int getID () {
		return ID;
	}
	
	public void setID (int ID) {
		this.ID = ID;
	}
	
	public int getpassword () {
		return password;
	}
	
	public void setpassword (int password) {
		this.password = password;
	}
	public String cadastrar () {
		return "cadastrar";
	}
	
	public String acessar () {
		return "acessar";
	}	
	
	public String procurar () {
		return "procurar";
	}

	public String navegar () {
		return "navegar";
	}
}
