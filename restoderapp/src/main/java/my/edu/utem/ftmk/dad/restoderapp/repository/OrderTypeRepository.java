package my.edu.utem.ftmk.dad.restoderapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import my.edu.utem.ftmk.dad.restoderapp.model.OrderType;


@Repository
public interface OrderTypeRepository extends JpaRepository<OrderType, Long> {
	
	/*
	 * LAB11: Task 2.1
	 * New abstract method named findByNameContaining()
	 * 
	 * @Param partCode
	 * @Return A list of order type data with successfully
	 */
	public abstract List<OrderType> findByNameContaining (String partName);
	
	/*
	 * LAB11: Task 3.1
	 * New abstract method named findByCodeStartingWith()
	 * 
	 * @Param partCode
	 * @Return A list of order type data
	 */
	public abstract List<OrderType> findByCodeStartingWith(String partCode);
	
	/*
	 * LAB 11: Task 5.1
	 * New abstract method named findByOrderByNameAsc()
	 * @Return A list of order type data
	 */
	public abstract List<OrderType> findByOrderByNameAsc();
	
	
	// Custom query
	@Query(value = "select * from OrderType where code like '%PU%'",
			nativeQuery = true)
	public List<Object[]> selectCustomByCode();
	//public List<OrderType> findByCode();

	
}
