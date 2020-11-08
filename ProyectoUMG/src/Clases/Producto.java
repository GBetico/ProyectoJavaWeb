package Clases;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the producto database table.
 * 
 */
@Entity
@Table(name="producto")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int codProd;

	@Column(nullable=false)
	private int cantidad;

	@Column(nullable=false, length=50)
	private String color;

	@Column(nullable=false, length=100)
	private String descripcion;

	@Column(nullable=false)
	private int idInventario;

	public Producto() {
	}

	public int getCodProd() {
		return this.codProd;
	}

	public void setCodProd(int codProd) {
		this.codProd = codProd;
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

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdInventario() {
		return this.idInventario;
	}

	public void setIdInventario(int idInventario) {
		this.idInventario = idInventario;
	}

}