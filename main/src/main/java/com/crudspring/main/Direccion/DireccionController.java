package com.crudspring.main.Direccion;

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
public class DireccionController {
    @Autowired DireccionService direccionService;

    @GetMapping("/direccion/get-all")
    public List<DireccionEntity> returnUsuarios(){
        return direccionService.getDirecciones();
    }
    
    @PostMapping("/direccion/save")
    public DireccionEntity saveUsuario(@RequestBody DireccionEntity direccion){
        return direccionService.saveDireccion(direccion);
    }

    @DeleteMapping("/direccion/delete/{id}")
    public String deleteUsuario(@PathVariable Long id){
        direccionService.borrarDireccion(id);
        return "Deleted";
    }

    @PutMapping("/direccion/update/{id}")
    public DireccionEntity updateUsuario(@PathVariable("id") Long direccionId, @RequestBody DireccionEntity direccion){
        return direccionService.updateDireccion(direccion, direccionId);
    }
}
