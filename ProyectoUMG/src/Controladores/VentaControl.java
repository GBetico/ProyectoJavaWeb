package Controladores;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;


import Clases.Venta;

@Named
@SessionScoped
public class VentaControl implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Venta venta;
	//creamos el constructor
	VentaControl(){
		venta = new Venta();
	}
	
	@PersistenceContext(unitName = "ProyectoUMG")
	private EntityManager em;    

	@Resource
	private UserTransaction userTransaction;
	
	/*metodo*/
	public void guardar() throws Exception  {
	    userTransaction.begin();
	    em.persist(venta);//este apunta a nuestro objeto 
	    userTransaction.commit();
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	
	
}
