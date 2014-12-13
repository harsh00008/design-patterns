package composite;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Component{
	private List<Component> employeeList;
	private String name;
	private String position;
	
	public Employee(String name, String position){
		employeeList = new ArrayList<Component>();
		this.name = name;
		this.position = position;
	}
	
	@Override
	public String description() {
		return "Name: " + name  + " Position: " + position;
	}

	@Override
	public void addEmployee(Component employee) {
		employeeList.add(employee);
	}

	@Override
	public List<Component> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeList;
	}

	@Override
	public void removeEmployee(int index) {
		employeeList.remove(index);
	}

}
