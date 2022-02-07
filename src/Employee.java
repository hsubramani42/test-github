import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private String empId;
	private String empname;
	private String address;
	private float salary;

	public float calculateSalary() {
		return salary + salary * 0.1f + salary * 0.15f + salary*0.2f;
	}
}