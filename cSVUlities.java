import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class cSVUlities 
{
	ArrayList<String> CSVData;
	int rowLength;
	
	public cSVUlities(File csv) throws IOException
	{
		boolean toggle = true;
		ArrayList<String> yes = new ArrayList<String>();
		Path pathToFile = Paths.get(csv.getAbsolutePath());
		BufferedReader buff = Files.newBufferedReader(pathToFile);
		String line = buff.readLine();
		while (line != null) { 
			line = buff.readLine();
			String[] attributes = null;
			if (line != null) {
				attributes = line.split(",");
				if(toggle)
				{
					toggle = ! toggle;
					this.rowLength = attributes.length;
				}
			} 
			if (attributes != null) {
				for (String x : attributes) {
					yes.add(x);
				} 
			}
		}
		this.CSVData = yes;
	}
	
	public ArrayList<String> getColumnHeaders()
	{
		ArrayList<String> yes = new ArrayList<String>();
		for(int i = 0; i < rowLength; i++)
		{
			yes.add(CSVData.get(i));
		}
		return yes;
	}
	
	public ArrayList<String> getColumnData(int column)
	{
		ArrayList<String> yes = new ArrayList<String>();
		for(int i = column; i < this.CSVData.size(); i = i + rowLength)
		{	String x = CSVData.get(i);
			if(!(x.equals("")))
			{
				yes.add(CSVData.get(i));
			}
			else
			{
				yes.add("NULL");
			}
		}
		return yes;
	}
	
	public ArrayList<Integer> getDataInt(int column)
	{
		ArrayList<Integer> yes = new ArrayList<Integer>();
		for(int i = column; i < this.CSVData.size(); i = i + rowLength)
		{
			String x =(CSVData.get(i));
			if(!(x.equals("")))
			{
				yes.add(Integer.parseInt(x));
			}
			else
			{
				yes.add(null);
			}
		}
		return yes;
	}
	
	public ArrayList<Double> getDataDouble(int column)
	{
		ArrayList<Double> yes = new ArrayList<Double>();
		for(int i = column; i < this.CSVData.size(); i = i + rowLength)
		{
			String x =(CSVData.get(i));
			if(!(x.equals("")))
			{
				yes.add(Double.parseDouble(x));
			}
			else
			{
				yes.add(null);
			}
		}
		return yes;
	}
	public void writeCSV(String Name, int Scores, File CSV) throws IOException
	{
		PrintWriter pw = new PrintWriter(CSV);
        StringBuilder sb = new StringBuilder();
        sb.append("Name");
        sb.append(',');
        sb.append("Highscore");
        sb.append('\n');
        BufferedReader magic = new BufferedReader(new FileReader(CSV));
        String line = magic.readLine();
        while ((line = magic.readLine()) != null)
        {
            String[] arr = line.split(",");
            sb.append(arr[0]);
            sb.append(arr[1]);
            line = magic.readLine();
        }
        sb.append(Name);
        sb.append(',');
        sb.append(Scores);
        sb.append('\n');
        pw.write(sb.toString());
        pw.close();
        magic.close();
	}
}
