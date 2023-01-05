package personal.DrinkStore.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import personal.DrinkStore.Models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String>{

}
