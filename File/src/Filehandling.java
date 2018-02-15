import java.io.File;

public class Filehandling {
	
	public static void main(String[] args) {
		
		//create a folder using File class
		
		File fileobject=new File("C:\\Users\\LENOVO\\Desktop\\File\\file.txt");
		fileobject.mkdir();
		
	}

}
