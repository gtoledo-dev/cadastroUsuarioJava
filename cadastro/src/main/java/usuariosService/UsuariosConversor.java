package usuariosService;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import dataSourceModel.Usuarios;
import exception.UsuariosResourceException;
import resourceModel.UsuariosResource;

@Component
public class UsuariosConversor {
	
	public Usuarios conversor(
			UsuariosResource usuariosResource) throws UsuariosResourceException{
		
		try {
			Usuarios usuarios = new Usuarios();
			
			
			Long codigo = checkcodigo(
					usuariosResource.getCodigo());
			
			LocalDate dataNascimento = checkdataNascimento(
					usuariosResource.getDataNascimento());
			usuarios.setCodigo(codigo);
			usuarios.setDataNascimento(dataNascimento);
			usuarios.setNome(usuariosResource.getNome());
			return usuarios;
				
			
			
		} catch (Exception e) {
			throw new UsuariosResourceException(
					"Falha na conversao para entidade"
			+ usuariosResource);
			
		}
		
	}
	
	
	
	private Long checkcodigo(String codigo) {
		return Long.parseLong(codigo);
	}
	
	private LocalDate checkdataNascimento(String dataNascimento) {
		return LocalDate.parse(dataNascimento);
	}

}
