package FileHandle;

import java.io.File;
import java.io.IOException;

public class Filed {
	public static void main(String[] args) throws IOException {
		File f=new File("MuttHeaded.txt");
		f.createNewFile();
		//f.mkdir();only one command is executed.......
		File f1 = new File("MuttHead");
		f1.mkdir();
//		f1.createNewFile();
		File fck = new File("sugar.mp3");
		fck.createNewFile();
		File boi=new File("MuttHead","Ary.txt");
		boi.createNewFile();
		
		
	}

}
