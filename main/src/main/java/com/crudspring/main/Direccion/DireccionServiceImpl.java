package com.crudspring.main.Direccion;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionServiceImpl implements DireccionService {
    @Autowired
    DireccionRepository direccionRepository;

    @Override
    public DireccionEntity saveDireccion(DireccionEntity direccion) {
        return direccionRepository.save(direccion);
    }

    @Override
    public List<DireccionEntity> getDirecciones() {
        return (List<DireccionEntity>) direccionRepository.findAll();
    }

    @Override
    public DireccionEntity updateDireccion(DireccionEntity usuario, long direccionId) {
        DireccionEntity usuarioObtenido = direccionRepository.findById(direccionId).get();
        if (Objects.nonNull(usuarioObtenido) && usuario.getDireccionId() != 0
                && !usuario.getCalle().equals(null) && !usuario.getCiudad().equals(null)
                && !usuario.getColonia().equals(null) && !usuario.getCalle().equals("")
                && !usuario.getCalle().equals(" ") && !usuario.getCiudad().equals("")
                && !usuario.getCiudad().equals(" ") && !usuario.getColonia().equals("")
                && !usuario.getColonia().equals(" ")) {
                    usuarioObtenido.setColonia(usuario.getColonia());
                    usuarioObtenido.setCalle(usuario.getCalle());
                    usuarioObtenido.setCiudad(usuario.getCiudad());
                    return direccionRepository.save(usuarioObtenido);
            }
        return null;
    }

    @Override
    public void borrarDireccion(long direccionId) {
        direccionRepository.deleteById(direccionId);
    }

}
