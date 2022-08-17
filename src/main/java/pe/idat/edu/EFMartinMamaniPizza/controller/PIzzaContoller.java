package pe.idat.edu.EFMartinMamaniPizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.idat.edu.EFMartinMamaniPizza.model.PIzza;
import pe.idat.edu.EFMartinMamaniPizza.service.PizzaService;

@Controller
@RequestMapping(path = "api/pizza/v1")
public class PIzzaContoller {
	
	@Autowired
	private PizzaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<PIzza> listar(){
		return service.listar();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody PIzza obtener(@PathVariable Integer id){
		return service.obtenerId(id);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void> guardar(@RequestBody PIzza pizza){
		service.guardar(pizza);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody PIzza pIzza) {
		service.actualizar(pIzza);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarPizzaCliente() {
		service.asignarClientePizza();
	}



}
