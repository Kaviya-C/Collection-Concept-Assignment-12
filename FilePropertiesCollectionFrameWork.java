package collectionframework;
import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.UserPrincipal;
import java.text.SimpleDateFormat;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;

public class FilePropertiesCollectionFrameWork {

	public static void main(String[] args) throws IOException {

		try {
			String fileName="C:\\Users\\Kaviya\\Desktop\\DiscussProgram.txt";

			File file=new File(fileName);

			Path path=file.toPath();

			BasicFileAttributes fileAttribute=Files.readAttributes(path,BasicFileAttributes.class);

			SimpleDateFormat creationDate=new SimpleDateFormat("MMM/dd/yyyy  HH:mm:ss");

			long lastTimeModified=file.lastModified();

			FileOwnerAttributeView files=Files.getFileAttributeView(path, FileOwnerAttributeView.class);

			long length=file.length();

			UserPrincipal authorName=files.getOwner();

			System.out.println("File Name: "+file.getName());

			System.out.println("Size of the file is: "+length);

			System.out.println("File Creation Time: "+creationDate.format(fileAttribute.creationTime().toMillis()));

			System.out.println("Last Modification of the File is: "+creationDate.format(lastTimeModified));

			System.out.println("Author of the File Name is: "+authorName);

		}catch(Exception exception)
		{
			System.out.println(exception.getMessage());
		}
	}
}
