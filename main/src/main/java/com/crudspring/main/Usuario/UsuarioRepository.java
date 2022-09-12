package com.crudspring.main.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    
}
