import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class cSVUlities 
{
	private String Name;
	private int Score;
	public cSVUlities(String Name, int Score)
	{
		this.Name = Name;
		this.Score = Score;
	}
	public static void main(String[]args) throws FileNotFoundException
	{
		File CSV = new File("test.csv");
		String path = CSV.getAbsolutePath();
		PrintWriter pw = new PrintWriter(CSV);
	        StringBuilder sb = new StringBuilder();
	        sb.append("highscore");
	        sb.append(',');
	        sb.append("Name");
	        sb.append('\n');

	        pw.write(sb.toString());
	        pw.close();
	        System.out.println(path);
	}
	public static void checkScores(int Score)
	{
	 
	}
}
