package com.vehiculos.api_vehiculos.controllers;

import com.vehiculos.api_vehiculos.models.Vehiculo;
import com.vehiculos.api_vehiculos.services.VehiculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehiculos")
@CrossOrigin("*") // Permite peticiones desde cualquier frontend
public class VehiculoController {

    private final VehiculoService vehiculoService;

    public VehiculoController(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }

    // Obtener todos los vehículos
    @GetMapping
    public List<Vehiculo> getAll() {
        return vehiculoService.getAll();
    }

    // Obtener un vehículo por ID
    @GetMapping("/{id}")
    public Optional<Vehiculo> getById(@PathVariable String id) {
        return vehiculoService.getById(id);
    }

    // Crear un vehículo
    @PostMapping
    public Vehiculo create(@RequestBody Vehiculo vehiculo) {
        return vehiculoService.create(vehiculo);
    }

    // Actualizar un vehículo
    @PutMapping("/{id}")
    public Vehiculo update(@PathVariable String id, @RequestBody Vehiculo vehiculo) {
        return vehiculoService.update(id, vehiculo);
    }

    // Eliminar un vehículo
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable String id) {
        return vehiculoService.delete(id);
    }
}
