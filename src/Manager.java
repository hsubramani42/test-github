import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(callSuper=true)
//@AllArgsConstructor
//@NoArgsConstructor
public class Manager extends Employee {

	private String projectName;
	private float projectAllowance;
	public Manager(String empId, String empname, String address, float salary) {
		super(empId, empname, address, salary);
	}
	public Manager(){
		this("0001","user 1","Bengaluru",10000.0f);
	}
	public Manager(String projectName, float projectAllowance) {
		this("0001","user 1","Bengaluru",10000.0f);
		this.projectName = projectName;
		this.projectAllowance = projectAllowance;
	}
	@Override
	public float calculateSalary() {
		// TODO Auto-generated method stub
		return super.calculateSalary()+this.projectAllowance;
	}
	

}
