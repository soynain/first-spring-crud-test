package com.crudspring.main.Usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @Autowired private UsuarioService usuarioService;

    @GetMapping("/usuario/get-all")
    public List<UsuarioEntity> returnUsuarios(){
        return usuarioService.getUsuarios();
    }
    @PostMapping("/usuario/save")
    public UsuarioEntity saveUsuario(@RequestBody UsuarioEntity usuario){
        return usuarioService.saveUsuario(usuario);
    }

    @DeleteMapping("/usuario/delete/{id}")
    public String deleteUsuario(@PathVariable("id") Long id){
        usuarioService.borrarUsuario(id);
        return "Deleted";
    }

    @PutMapping("/usuario/update/{id}")
    public UsuarioEntity updateUsuario(@RequestBody UsuarioEntity usuario, @PathVariable("id") Long usuarioId){
        return usuarioService.updateUsuario(usuario, usuarioId);
    }
}
