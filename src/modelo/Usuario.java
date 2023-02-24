package modelo;

public class Usuario {
	private String nome, senha, curso, codigo;
	private String area, coord, cargaH;
	
	public Usuario() {
	}
	public Usuario(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCoord() {
		return coord;
	}
	public void setCoord(String coord) {
		this.coord = coord;
	}
	public String getCargaH() {
		return cargaH;
	}
	public void setCargaH(String cargaH) {
		this.cargaH = cargaH;
	}
	
	public String toString() {
		return "Nome: "+this.nome+"\nSenha: "+this.senha+"\n¡rea: "+this.area+"\nCurso: "+this.curso+
				"\nCÛdigo: "+this.codigo+"\nCarga Hor·ria: "+this.cargaH+"\nCoordenador: "+this.coord;
	}
}
