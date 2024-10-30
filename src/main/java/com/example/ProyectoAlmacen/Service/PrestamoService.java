package com.example.ProyectoAlmacen.Service;

import com.example.ProyectoAlmacen.Model.Prestamo;
import com.example.ProyectoAlmacen.Repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PrestamoService {

    @Autowired
    private PrestamoRepository prestamoRepository;

    public List<Prestamo> listarTodos() {
        return prestamoRepository.findAll();
    }

    public Optional<Prestamo> obtenerPorId(Long id) {
        return prestamoRepository.findById(id);
    }

    public Prestamo guardar(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    public Prestamo actualizar(Long id, Prestamo prestamo) {
        if (prestamoRepository.existsById(id)) {
            prestamo.setIdPrestamo(id);
            return prestamoRepository.save(prestamo);
        }
        return null;
    }

    public boolean borrar(Long id) {
        if (prestamoRepository.existsById(id)) {
            prestamoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
