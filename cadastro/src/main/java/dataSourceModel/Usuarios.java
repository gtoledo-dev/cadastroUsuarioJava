package dataSourceModel;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuarios")
public class Usuarios implements Serializable{
	

	private static final long serialVersionUID = 5134452700925773975L;
	
	private Long id;
	private Long codigo;
	private String nome;
	private LocalDate dataNascimento;
	private byte[] foto;
	
	public Usuarios(Long id, Long codigo, String nome, LocalDate dataNascimento, byte[] foto) {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		this.id = id;
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.foto = foto;
	}
	
	@SuppressWarnings("unused")
	private Usuarios

	public Long getId() {
		return id;
				
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	
	
	
	
	

}
