package com.vehiculos.api_vehiculos.repositories;

import com.vehiculos.api_vehiculos.models.Vehiculo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends MongoRepository<Vehiculo, String> {
}
