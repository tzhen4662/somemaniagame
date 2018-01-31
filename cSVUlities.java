import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
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
	        System.out.println(path);
	        writeCSV("Brandon", 167, CSV);
	        for (String x : getinfo(CSV))
	            System.out.println(x + "");
	}
	public static ArrayList<String> getinfo(File CSV)
	{
		ArrayList<String> CSVData = new ArrayList<String>();
		Path pathToFile = Paths.get(CSV.getAbsolutePath());
		try (BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII))
		{
			String line = br.readLine();
			while(line != null)
			{
				CSVData.add(line);
				line = br.readLine();
			}
		}		
				catch (IOException ioe)
			{
				ioe.printStackTrace();
			}
		return CSVData;
	}
	public static void writeCSV(String Name, int Score, File CSV) throws FileNotFoundException
	{
		PrintWriter pw = new PrintWriter(CSV);
        StringBuilder sb = new StringBuilder();
        sb.append(Name);
        sb.append(',');
        sb.append(Score);
        sb.append('\n');
        pw.write(sb.toString());
        pw.close();
	}
	//public static 
/*	public static void checkScores(String Score, String Name)
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
	public static void printCSV(File CSV) throws IOException
	{
		  String currentLine;
		  BufferedReader br;
		  br = new BufferedReader(new FileReader("test.csv"));
	        while ((currentLine = br.readLine()) != null) { 
	            String[] str = currentLine.split(",");
	            System.out.println("Name" + str[0] + ", Highscore" + str[1]); 
	        }
	}*/
}
