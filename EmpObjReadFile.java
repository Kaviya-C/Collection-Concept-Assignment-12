package collectionframework;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.ObjectOutputStream;

public class EmpObjReadFile {
	public static void main(String[] args){
		final Employee employee=new Employee();
		employee.setEmployeeId(99);
		employee.setEmployeeNamwe("KAVIYA");
		employee.setDepartment("DeveloperTeam");
		
		try(final FileOutputStream fout=new FileOutputStream("employees.txt");
				final ObjectOutputStream output=new ObjectOutputStream(fout)){
			output.writeObject(employee);
			output.flush();
			System.out.println("Successfull read the employee object in the file");	
		}catch(IOException except) {
			System.out.println(except.getMessage());
		}	
	}
}
