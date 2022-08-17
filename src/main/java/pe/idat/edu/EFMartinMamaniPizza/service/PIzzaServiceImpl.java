package pe.idat.edu.EFMartinMamaniPizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.edu.EFMartinMamaniPizza.model.ClientePizzaFK;
import pe.idat.edu.EFMartinMamaniPizza.model.PIzza;
import pe.idat.edu.EFMartinMamaniPizza.model.PizzaDetalle;
import pe.idat.edu.EFMartinMamaniPizza.repository.DetallePIzzaRepository;
import pe.idat.edu.EFMartinMamaniPizza.repository.PizzaRepository;

@Service
public class PIzzaServiceImpl implements PizzaService {
	
	@Autowired
	private PizzaRepository repository;
	
	@Autowired
	private DetallePIzzaRepository repositoryPizza;

	@Override
	public List<PIzza> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public PIzza obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(PIzza pizza) {
		// TODO Auto-generated method stub
		repository.save(pizza);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void actualizar(PIzza pizza) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(pizza);

	}

	@Override
	public void asignarClientePizza() {
		// TODO Auto-generated method stub
		ClientePizzaFK fk = null;
		PizzaDetalle detalle = null;
		
		fk = new ClientePizzaFK();
		fk.setIdCliente(1);
		fk.setIdPizza(1);
		detalle = new PizzaDetalle();
		detalle.setFk(fk);
		repositoryPizza.save(detalle);	
	}

}
