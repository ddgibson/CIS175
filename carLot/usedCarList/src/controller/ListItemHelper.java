/**
 * @author froda - ddgibson
 * CIS175 - Fall 2021
 * Oct 14, 2021
 */
package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.ListItem;

public class ListItemHelper {
	
	static EntityManagerFactory emfactory = 
			Persistence.createEntityManagerFactory("usedCarList");

	public void insertItem(ListItem car) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(car);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<ListItem> showAllItems(){
		EntityManager em = emfactory.createEntityManager();
		List<ListItem> allItems = em.createQuery("SELECT i FROM ListItem i").getResultList();
		return allItems;
	}
	
	public void deleteItem(ListItem toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListItem> typedQuery = em.createQuery("select li from ListItem li where li.car = :selectedCar and li.year = :selectedYear", ListItem.class);
		
		typedQuery.setParameter("selectedCar", toDelete.getCar());
		typedQuery.setParameter("selectedYear", toDelete.getYear());
		
		typedQuery.setMaxResults(1);
		
		ListItem result = typedQuery.getSingleResult();
		
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}

	/**
	 * @param carName
	 * @return
	 */
	public List<ListItem> searchForItemsByCar(String carName) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListItem> typedQuery = em.createQuery("select li form ListItem li where li.car = :selectedCar", ListItem.class);
		typedQuery.setParameter("selectedCar", carName);
		
		List<ListItem> foundItems = typedQuery.getResultList();
		em.close();
		
		return foundItems;
	}

	/**
	 * @param year
	 * @return
	 */
	public List<ListItem> searchForItemByYear(int year) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListItem> typedQuery = em.createQuery("select li from ListItem li where li.year = :selectedYear", ListItem.class);
		
		typedQuery.setParameter("selectedYear",year);
		
		List<ListItem> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	
	}
	
	public ListItem searchForItemById(int idToEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		ListItem found = em.find(ListItem.class, idToEdit);
		em.close();
		return found;
	}
	
	public void updateItem(ListItem toEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}
	
	public void cleanUp() {
		emfactory.close();
	}
	
}
