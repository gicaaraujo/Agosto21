package Agosto21;

public class Fornecedor {


	String nomefantasia;
	String razaosocial;
	String endereço;
	String fone;
	String email;
	String inscricaoestadual;
	String cnpj;
	int ID;

	public String getnomefantasia () {
		return nomefantasia;
	}

	public void setnomefantasia (String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}

	public String getrazaosocial () {
		return razaosocial;
	}

	public void setrazaosocial (String razaosocial) {
		this.razaosocial = razaosocial;
	}
	public String getendereço () {
		return endereço;
	}

	public void setendereço (String endereço) {
		this.endereço = endereço;
	}
	public String getfone () {
		return fone;
	}

	public void setfone (String fone) {
		this.fone = fone;
	}
	public String getemail () {
		return email;
	}

	public void setemail (String email) {
		this.email = email;
	}
	public String getinscricaoestadual () {
		return inscricaoestadual;
	}

	public void setinscricaoestadual (String inscricaoestadual) {
		this.inscricaoestadual = inscricaoestadual;
	}

	public String getcnpj () {
		return cnpj;
	}

	public void setcnpj (String cnpj) {
		this.cnpj = cnpj;
	}

	public int getID () {
		return ID;
	}

	public void setID (int ID) {
		this.ID = ID;
	}
	public String vender () {
		return "vender";
	}

	public String carregar () {
		return "carregar";
	}
	public String registrar () {
		return "registrar";
	}

	public String entregar () {
		return "entregar";
	}	

}
