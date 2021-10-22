/**
 * @author froda - ddgibson
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
 
import dmacc.beans.menuItems; 
 


/**
 * @author froda
 *
 */
@Repository 
public interface myRepository extends 
JpaRepository<menuItems, Long> { }