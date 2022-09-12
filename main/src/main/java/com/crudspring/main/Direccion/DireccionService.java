package com.crudspring.main.Direccion;

import java.util.List;

interface DireccionService {
    DireccionEntity saveDireccion(DireccionEntity direccion);
    List<DireccionEntity> getDirecciones();
    DireccionEntity updateDireccion(DireccionEntity direccion,long direccionId);
    void borrarDireccion(long direccionId);
}
