package com.crudspring.main.Usuario;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    
    @Autowired private UsuarioRepository usuarioRepository;

    @Override
    public UsuarioEntity saveUsuario(UsuarioEntity usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<UsuarioEntity> getUsuarios() {
        return (List<UsuarioEntity>) usuarioRepository.findAll();
    }

    @Override
    public UsuarioEntity updateUsuario(UsuarioEntity usuario, long usuarioId) {
        UsuarioEntity usuarioAGuardar = usuarioRepository.findById(usuarioId).get();
        if (Objects.nonNull(usuarioAGuardar) && !usuario.getNombre().equals("")
            && !usuario.getEdad().equals(null)
            && Objects.nonNull(usuario.direccionesUsuario)) 
        {
            usuarioAGuardar.setNombre(usuario.getNombre());
            usuarioAGuardar.setEdad(usuario.getEdad());
            return usuarioRepository.save(usuarioAGuardar);
        }
        return null;
    }

    @Override
    public void borrarUsuario(long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
    }

}
