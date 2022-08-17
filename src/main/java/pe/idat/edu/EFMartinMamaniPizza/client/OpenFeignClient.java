package pe.idat.edu.EFMartinMamaniPizza.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import pe.idat.edu.EFMartinMamaniPizza.dto.Cliente;

@FeignClient(name ="idat-cliente", url="localhost:8080")
public interface OpenFeignClient {
	
	@GetMapping("/api/cliente/v1/listar")
	public List<Cliente> listarClienteSeleccionados();


}
