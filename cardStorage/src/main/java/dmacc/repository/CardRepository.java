/**
 * @author froda - ddgibson
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.cardType;

/**
 * @author froda
 *
 */
@Repository 
public interface CardRepository extends JpaRepository<cardType, Long> { }