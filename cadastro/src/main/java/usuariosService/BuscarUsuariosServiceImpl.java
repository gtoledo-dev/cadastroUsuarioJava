package usuariosService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dataSourceModel.Usuarios;
import usuariosRepository.UsuariosRepository;

@Service
public class BuscarUsuariosServiceImpl {
	
	@Autowired
	private UsuariosRepository usuariosRepository;
	
	public List<Usuarios> buscarTodosUsuarios(){
		List<Usuarios> listUsuarios = 
				usuariosRepository.findAll();		
		return listUsuarios;
	}

}
