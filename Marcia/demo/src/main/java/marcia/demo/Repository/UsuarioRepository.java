package marcia.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import marcia.demo.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
