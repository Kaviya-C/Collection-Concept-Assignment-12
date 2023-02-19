package collectionframework;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class EmployeeArrayObject implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int empId;
	String empName;
	double empSalary;
	String empDepartment;
	 public EmployeeArrayObject(int empId,String empName,double empSalary,String empDepartment){
		 super();
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
		this.empDepartment=empDepartment;
	}
	 
	@Override
	public String toString() {
		return "EmployeeArrayObj [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary
				+ ", empDepartment=" + empDepartment + "]";
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try (Scanner input = new Scanner(System.in)) {
			EmployeeArrayObject[] empObj=new EmployeeArrayObject[4];
			
			FileOutputStream fout=new FileOutputStream("EmployeeArrayObj.txt");
			
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			
			for(int index=0;index<empObj.length;index++) {

				int  empId=input.nextInt();

				String empName=input.nextLine();

				double empSalary=input.nextDouble();

				String department=input.nextLine();

				EmployeeArrayObject empArray=new EmployeeArrayObject(empId,empName,empSalary,department);
				empObj[index]=empArray;
				objout.writeObject(empObj[index]);
			}
			objout.writeObject(new  EOFfile());
			fout.close();

			FileInputStream finput=new FileInputStream("EmployeeArrayObj.txt");
			try (ObjectInputStream objinput = new ObjectInputStream(finput)) {
				Object object=null;
				while((object=objinput.readObject()) instanceof EOFfile==false){
					EmployeeArrayObject result=(EmployeeArrayObject)object;
					System.out.println(result);
				}
			}
		}
	}
}
class EOFfile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}




/*
 * public void displayDetails() {
 * 
 * System.out.println("[id = "+empId+", "+"Name="+" "+empName+", "+"Salary= "
 * +empSalary +" , "+" Department= "+empDepartment+" ]"); System.out.println();
 * }
 */

/*
 * for(EmployeeArrayObj result:empObj) { result.displayDetails(); }
 */