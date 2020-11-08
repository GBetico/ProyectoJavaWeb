package Controladores;

import java.io.Serializable;
import javax.annotation.Resource;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import Clases.Producto;

@Named
@SessionScoped
public class ProductoControl implements Serializable {
	private static final long serialVersionUID = 1L;
	//creamos objeto de la clase
			private Producto producto;
			//creamos el constructor
			ProductoControl(){
				producto = new Producto();
			}
			
			@PersistenceContext(unitName = "ProyectoUMG")
			private EntityManager em;    

			@Resource
			private UserTransaction userTransaction;
			
			/*metodo*/
			public void guardar() throws Exception  {
			    userTransaction.begin();
			    em.persist(producto);//este apunta a nuestro objeto 
			    userTransaction.commit();
			}

			public Producto getProducto() {
				return producto;
			}

			public void setProducto(Producto producto) {
				this.producto = producto;
			}

			/*
			public void buscar() throws Exception {
				Query query = em.createQuery("select u from Usuariob u where u.cui = :cui");
				query.setParameter("cui", usuariob.getCui());
				usuariob = (Usuariob)query.getSingleResult();
				
				
				busqueda de los ID de los inventarios y meterlos array y meterlos a combobox con jsp
			}
			*/
			
			
}
