package pe.idat.edu.EFMartinMamaniPizza.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ClientePizzaFK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7310414022331566516L;
	
	@Column(name = "id_cliente", nullable = false, unique = true)
	private Integer idCliente;
	
	@Column(name = "id_pizza", nullable = false, unique = true)
	private Integer idPizza;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdPizza() {
		return idPizza;
	}

	public void setIdPizza(Integer idPizza) {
		this.idPizza = idPizza;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
