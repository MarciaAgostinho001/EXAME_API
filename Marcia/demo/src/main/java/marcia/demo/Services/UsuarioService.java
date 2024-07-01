package marcia.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import marcia.demo.Model.Usuario;
import marcia.demo.Repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> GetAll()
    {
        return usuarioRepository.findAll();
    }
    public Optional<Usuario> getCursoById(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario saveCurso(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    public void deleteCurso(Long id) {
        usuarioRepository.deleteById(id);
    }
}
