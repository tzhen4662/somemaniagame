import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class cSVUlities 
{
	private String Name;
	private int Score;
	private static ArrayList<String> CSVData = new ArrayList<String>();
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
	public void getinfo(File CSV)
	{
		Path pathToFile = Paths.get(CSV.getAbsolutePath());
		try (BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII))
		{
			String line = br.readLine();
			while(line != null)
			{
				this.CSVData.add(line);
				line = br.readLine();
			}
		}		
				catch (IOException ioe)
			{
				ioe.printStackTrace();
			}
	}
	public static void checkScores(String Score, String Name)
	{
		ArrayList<String> csvCopy = CSVData;
		for(int i = 3; i < CSVData.size(); i+= 2)
		{
			if(CSVData.get(i).equals(Score))
			{
				CSVData.set(i, Name);
				CSVData.set(i+1, Score);
			}
		}
	}
}
