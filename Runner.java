
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Runner 
{
	public static void main(String[]args) throws IOException
	{
		ArrayList<String> cool = new ArrayList<String>();
		File CVS = new File("test.csv");
		cSVUlities test =  new cSVUlities(CVS);
		cool = test.getColumnData(0);
		for(int i = 0; i < cool.size(); i++) {   
		    System.out.print(cool.get(i));
		}  
	}
}
