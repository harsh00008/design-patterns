package composite;

import java.util.List;

public interface Component {
	public String description();
	public void addEmployee( Component employee );
	public void removeEmployee(int index);
	public List<Component> getAllEmployees();
}
