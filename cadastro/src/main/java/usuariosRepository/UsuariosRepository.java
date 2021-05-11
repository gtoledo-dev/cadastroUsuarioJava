package usuariosRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import dataSourceModel.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

}
