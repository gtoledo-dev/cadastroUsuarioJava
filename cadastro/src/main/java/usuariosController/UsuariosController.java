package usuariosController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dataSourceModel.Usuarios;
import resourceModel.UsuariosResource;
import usuariosRepository.UsuariosRepository;
import usuariosService.BuscarUsuariosServiceImpl;
import usuariosService.CadastroUsuarios;

@RestController
@RequestMapping(value = "/api")
public class UsuariosController {
	
	@Autowired
	private UsuariosRepository usuariosRepository;
	
	@Autowired
	private BuscarUsuariosServiceImpl serviceBuscar;
	
	@Autowired
	private CadastroUsuarios serviceCadastro;
	
	@GetMapping(path = "/usuarios")
	public List<Usuarios> buscarUsuariosPorId() {
		return serviceBuscar.buscarTodosUsuarios();
	}
	
	@GetMapping(path = "/usuarios/id{id}")
	public Optional<Usuarios> buscarUsuariosPorId(
			@PathVariable(name = "id", required = true)Long id) {
		return	usuariosRepository.findById(id);
	}
	
	@PostMapping(path = "/usuarios/save")
	public void salvarUsuarios(@RequestBody UsuariosResource usuarios) {
		serviceCadastro.cadastro(usuarios);
	}
	
	@PutMapping(path = "/usuarios/edit")
	public void editarUsuarios(@RequestBody UsuariosResource usuarios) {
		serviceCadastro.cadastro(usuarios);
	}
	
	@DeleteMapping(path = "usuarios/delete/{id}")
	public void deleteUsuarios(
			@PathVariable(name = "id", required = true)Long id) {
		usuariosRepository.deleteById(id);
	}
}
