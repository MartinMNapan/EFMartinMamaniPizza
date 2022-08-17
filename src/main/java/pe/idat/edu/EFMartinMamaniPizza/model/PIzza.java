package pe.idat.edu.EFMartinMamaniPizza.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pizza")
public class PIzza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPizza;
	private String nombrePizza;
	private String decripcion;
	
	public Integer getIdPizza() {
		return idPizza;
	}
	public void setIdPizza(Integer idPizza) {
		this.idPizza = idPizza;
	}
	public String getNombrePizza() {
		return nombrePizza;
	}
	public void setNombrePizza(String nombrePizza) {
		this.nombrePizza = nombrePizza;
	}
	public String getDecripcion() {
		return decripcion;
	}
	public void setDecripcion(String decripcion) {
		this.decripcion = decripcion;
	}
	
	


}
