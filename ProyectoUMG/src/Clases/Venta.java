package Clases;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the venta database table.
 * 
 */
@Entity
@Table(name="venta")
@NamedQuery(name="Venta.findAll", query="SELECT v FROM Venta v")
public class Venta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int idVenta;

	@Column(nullable=false)
	private int cantidad;

	@Column(nullable=false, length=50)
	private String color;

	@Column(nullable=false, length=50)
	private String descripcion;

	@Column(nullable=false)
	private int idproducto;

	private float precio;

	@Column(nullable=false)
	private float total;

	public Venta() {
	}

	public int getIdVenta() {
		return this.idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
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

	public int getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getTotal() {
		return this.total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

}