package com.crudspring.main.Direccion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DireccionRepository extends JpaRepository<DireccionEntity,Long>{
    
}
