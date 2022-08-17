package pe.idat.edu.EFMartinMamaniPizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.edu.EFMartinMamaniPizza.model.PizzaDetalle;

@Repository
public interface DetallePIzzaRepository extends JpaRepository<PizzaDetalle, Integer> {

}
