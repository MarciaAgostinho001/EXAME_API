package marcia.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import marcia.demo.Model.Usuario;
import marcia.demo.Services.UsuarioService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/Marcia/Usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping()
    public List<Usuario> getAll() {
        return usuarioService.GetAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getCursoById(@PathVariable Long id) {
        Optional<Usuario> usuario = usuarioService.getCursoById(id);
        if (usuario.isPresent()) {
            return ResponseEntity.ok(usuario.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return usuarioService.saveCurso(usuario);

    }
     @PutMapping("/{id}")
    public ResponseEntity<Usuario> updateCurso(@PathVariable Long id, @RequestBody Usuario usuarioDEditor) {
        Optional<Usuario> usuario = usuarioService.getCursoById(id);
        if (usuario.isPresent()) {
            Usuario usarioToUpdate = usuario.get();
            usarioToUpdate.setNome(usuarioDEditor.getNome());
            usarioToUpdate.setMorada(usuarioDEditor.getMorada());
            usarioToUpdate.setSenha(usuarioDEditor.getSenha());
            usarioToUpdate.setTelefone(usuarioDEditor.getTelefone());

            return ResponseEntity.ok(usarioToUpdate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCurso(@PathVariable Long id) {
        if (usuarioService.getCursoById(id).isPresent()) {
            usuarioService.deleteCurso(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    

}
