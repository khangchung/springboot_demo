package personal.DrinkStore.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import personal.DrinkStore.Models.Employee;
import personal.DrinkStore.Repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> list(){
		return (List<Employee>) repository.findAll();
	}
	
	public Employee detail(String id) {
		return repository.findById(id).get();
	}
	
	public Employee create(Employee employee) {
		Employee existedEmployee = repository.findById(employee.getId()).get();
		if (existedEmployee == null) {
			return repository.save(employee);
		}
		return null;
	}
	
	public Employee update(Employee employee) {
		Employee existedEmployee = repository.findById(employee.getId()).get();
		if (existedEmployee != null) {
			return repository.save(employee);
		}
		return null;
	}
	
	public Employee delete(String id) {
		Employee existedEmployee = repository.findById(id).get();
		if (existedEmployee != null) {
			repository.delete(existedEmployee);
			return existedEmployee;
		}
		return null;
	}
}
