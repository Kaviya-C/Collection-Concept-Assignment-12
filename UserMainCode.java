package filehandling;
import java.io.File;
public class UserMainCode {
	static void  fileIdentier(String s) 
	{
		System.out.println("\n"+s);
	}
	public static void main(String[] args) {
		File file=new File("C:\\Users\\Kaviya\\Desktop\\");
		File[] listFileFolder=file.listFiles();
		for(File listed: listFileFolder) {
			if(listed.isFile())
			{
				String fileName=listed.getName();
				int index=fileName.lastIndexOf(".");
				String extension=fileName.substring(index+1);
				
				if(extension.equals("gif")) {
					System.out.println( "file name "+fileName);
					UserMainCode.fileIdentier("Extension of that file "+"[ "+fileName+"]"+" is: "+"\t"+extension);	
				}
			}
		}
	}
}

