package personal.DrinkStore.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import personal.DrinkStore.Models.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, String>{

}
