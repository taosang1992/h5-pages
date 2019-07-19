import java.io.File;
import java.io.IOException;
class MyClass {
	public static void main(String[] args) {
		try{
			File myFile = new File("/Users/ufutx/Desktop/Code/learning-java/file/filename.txt");
			if(myFile.exists()){
				System.out.println("File name:" + myFile.getName());
				System.out.println("Absolute path:" + myFile.getAbsolutePath());
				System.out.println("Writeable:" + myFile.canWrite());
				System.out.println("Readable:" + myFile.canRead());
				System.out.println("File size in bytes:" + myFile.length());
			}else{
				System.out.println("The file does not exist.");
			}
			if(myFile.createNewFile()){
				System.out.println("File created: " + myFile.getName()); // File created: filename.txt
			}else{
				System.out.println("File already exists.");	// second execute, File already exists.
			}
		}catch(IOException e){
			System.out.println("An error occured.");
			e.printStackTrace();	
		}
	}
}