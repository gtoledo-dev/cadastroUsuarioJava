package usuariosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dataSourceModel.Usuarios;
import exception.UsuariosResourceException;
import resourceModel.UsuariosResource;
import usuariosRepository.UsuariosRepository;

@Service
public class CadastroUsuarios {
	
	@Autowired
	private UsuariosRepository usuariosRepository;
	
	@Autowired
	private UsuariosConversor service;
	
	public void cadastro(UsuariosResource usuariosResource) {
		
		
		try {
			Usuarios usuarios = service.conversor(
					usuariosResource);
			usuariosRepository.saveAndFlush(usuarios);
		} catch (UsuariosResourceException e) {
			e.printStackTrace();
		}
		
		
	}

}
