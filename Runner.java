
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Runner 
{
	public static void main(String[]args) throws IOException
	{
		ArrayList<String> cools = new ArrayList<String>();
		File CVS = new File("test.csv");
		cSVUlities test =  new cSVUlities(CVS);
		cools = test.getColumnData(0);
		for(int i = 0; i < cools.size(); i++) {   
		    System.out.print(cools.get(i));
		}  
	}
}
