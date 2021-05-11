package resourceModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsuariosResource {
	
	@JsonProperty("codigo_usuario")
	private String codigo;
	
	@JsonProperty("nome_usuario")
	private String nome;
	
	@JsonProperty("data_nascimento_usuario")
	private String dataNascimento;
	
	@JsonProperty("foto_usuario")
	private String foto;

	public UsuariosResource(String codigo, String nome, String dataNascimento, String foto) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.foto = foto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "UsuariosResource [codigo=" + codigo + ", nome=" + nome + ", dataNascimento=" + dataNascimento
				+ ", foto=" + foto + "]";
	}
	
	
	
	

	
	
	

}
