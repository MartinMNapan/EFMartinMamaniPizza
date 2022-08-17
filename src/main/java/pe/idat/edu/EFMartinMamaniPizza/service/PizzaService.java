package pe.idat.edu.EFMartinMamaniPizza.service;

import java.util.List;

import pe.idat.edu.EFMartinMamaniPizza.model.PIzza;

public interface PizzaService {
	
	List<PIzza> listar();
	PIzza obtenerId(Integer id);
	void guardar(PIzza pizza);
	void eliminar(Integer id);
	void actualizar(PIzza pizza);	
	//crear un nuevo metodo
	void asignarClientePizza();


}
