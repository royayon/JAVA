package PackageFileTesting1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDirectory {
	public static void main(String[] args) {
		String source = "F:\\Projects\\source";
		String destination = "F:\\Projects\\dest";
		
		File srcFolder = new File(source);
		File destFolder = new File(destination);
		
		if(!srcFolder.exists()) {
			System.out.println("Source does not exists!");
		}else {
			try {
				copyFolder(srcFolder , destFolder);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Copying Done!");
	}
	
	//copyFolder Function
	public static void copyFolder(File src , File dest) throws IOException {
		if(src.isDirectory()) {
			if(!dest.exists()) {
				dest.mkdir();
				System.out.println("Directory copied form " + src + " to " + dest);
				
			}
			
			//list of all directories in the src
			String files[] = src.list();
			for(String file : files) {
				if(file.equals("ignoreThis")) {
					continue;
				}
				File srcFile = new File(src , file);
				File destFile = new File(dest , file);
				
				copyFolder(srcFile , destFile);
			}
		}else {
			//base of the recursion
			//if file then copy it
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest);
			
			byte[] buffer = new byte[1024];
			int length;
			//copy file content in bytes
			while((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();
			System.out.println("File copied from " + src + " to " + dest);
		}
	}

}
