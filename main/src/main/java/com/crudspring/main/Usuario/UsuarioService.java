package com.crudspring.main.Usuario;

import java.util.List;

interface UsuarioService {
    UsuarioEntity saveUsuario(UsuarioEntity usuario);
    List<UsuarioEntity> getUsuarios();
    UsuarioEntity updateUsuario(UsuarioEntity usuario,long usuarioId);
    void borrarUsuario(long usuarioId);
}
