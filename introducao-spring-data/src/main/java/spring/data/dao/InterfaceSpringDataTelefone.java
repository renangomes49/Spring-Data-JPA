package spring.data.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spring.data.model.Telefone;

@Repository
public interface InterfaceSpringDataTelefone extends CrudRepository<Telefone, Long>{

	
	
}
