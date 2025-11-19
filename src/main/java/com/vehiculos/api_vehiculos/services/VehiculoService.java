package com.vehiculos.api_vehiculos.services;

import com.vehiculos.api_vehiculos.models.Vehiculo;
import com.vehiculos.api_vehiculos.repositories.VehiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService {

    private final VehiculoRepository vehiculoRepository;

    public VehiculoService(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    // Obtener todos
    public List<Vehiculo> getAll() {
        return vehiculoRepository.findAll();
    }

    // Obtener por ID
    public Optional<Vehiculo> getById(String id) {
        return vehiculoRepository.findById(id);
    }

    // Crear vehículo
    public Vehiculo create(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    // Actualizar vehículo
    public Vehiculo update(String id, Vehiculo vehiculo) {
        if (vehiculoRepository.existsById(id)) {
            vehiculo.setId(id);  // aseguramos que actualice el mismo ID
            return vehiculoRepository.save(vehiculo);
        }
        return null;
    }

    // Eliminar
    public boolean delete(String id) {
        if (vehiculoRepository.existsById(id)) {
            vehiculoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
