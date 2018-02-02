import java.io.File;
import java.io.IOException;

public class Runner 
{
	public static void main(String[]args) throws IOException
	{
		File CSV = new File("test.csv");
		String path = CSV.getAbsolutePath();
	        System.out.println(path);
	        cSVUlities.writeCSV("Channer", 169, CSV);
	        cSVUlities.writeCSV("jacky", 26, CSV);
	        for (String x : cSVUlities.getinfo(CSV))
	            System.out.println(x + "");
	}
}
