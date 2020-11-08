package Controladores;

import java.io.Serializable;
import javax.annotation.Resource;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import Clases.Inventariomateriale;

@Named
@SessionScoped

public class InventarioControl implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//creamos objeto de la clase
		private Inventariomateriale inventario;
		//creamos el constructor
		InventarioControl(){
			inventario = new Inventariomateriale();
		}
		
		@PersistenceContext(unitName = "ProyectoUMG")
		private EntityManager em;    

		@Resource
		private UserTransaction userTransaction;
		
		/*metodo*/
		public void guardar() throws Exception  {
		    userTransaction.begin();
		    em.persist(inventario);//este apunta a nuestro objeto 
		    userTransaction.commit();
		}

		
		/*
		public void buscar() throws Exception {
			Query query = em.createQuery("select u from Usuariob u where u.cui = :cui");
			query.setParameter("cui", usuariob.getCui());
			usuariob = (Usuariob)query.getSingleResult();
		}
		*/
		
		public Inventariomateriale getInventario() {
			return inventario;
		}

		public void setInventario(Inventariomateriale inventario) {
			this.inventario = inventario;
		}

}
