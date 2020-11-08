package Clases;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the inventariomateriales database table.
 * 
 */
@Entity
@Table(name="inventariomateriales")
@NamedQuery(name="Inventariomateriale.findAll", query="SELECT i FROM Inventariomateriale i")
public class Inventariomateriale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int idInventario;

	@Column(nullable=false)
	private int cantidad;

	@Column(nullable=false, length=50)
	private String color;

	@Column(nullable=false, length=50)
	private String material;

	@Column(nullable=false, length=50)
	private String medida;

	public Inventariomateriale() {
	}

	public int getIdInventario() {
		return this.idInventario;
	}

	public void setIdInventario(int idInventario) {
		this.idInventario = idInventario;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return this.material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMedida() {
		return this.medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

}