package br.net.gradual.demo.respository;

import br.net.gradual.demo.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer>{

}
