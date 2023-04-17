package my.edu.utem.ftmk.dad.restoderapp.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import my.edu.utem.ftmk.dad.restoderapp.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> { 
	 
}
