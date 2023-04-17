package my.edu.utem.ftmk.dad.restoderapp.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import my.edu.utem.ftmk.dad.restoderapp.model.ProductType; 

@Repository 
public interface ProductTypeRepository extends JpaRepository<ProductType, Long> { 
 
}
