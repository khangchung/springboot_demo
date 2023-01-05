package personal.DrinkStore.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import personal.DrinkStore.Models.Employee;
import personal.DrinkStore.Services.EmployeeService;

@RestController
@RequestMapping(path = {"/employees"}, produces = "application/json")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public List<Employee> gets() {
		return employeeService.list();
	}
	
	@GetMapping("/{id}")
	public Employee get(@PathVariable String id) {
		return employeeService.detail(id);
	}
	
	@PostMapping("/")
	public Employee create(@RequestBody Employee employee) {
		return employeeService.create(employee);
	}
	
	@PutMapping("/{id}")
	public Employee update(@RequestBody Employee employee, @PathVariable String id) {
		employee.setId(id);
		return employeeService.update(employee);
	}
	
	@DeleteMapping("/{id}")
	public Employee delete(@PathVariable String id) {
		return employeeService.delete(id);
	}
}
