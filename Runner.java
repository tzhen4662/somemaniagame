
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
		test.writeCSV("Brandon", 2007, CVS);
		test.writeCSV("TIM", 6969, CVS);
		cools = test.getColumnData(0);
		for(int i = 0; i < cools.size(); i++)
		{   
		    System.out.print(cools.get(i));
		}  
	}
}
