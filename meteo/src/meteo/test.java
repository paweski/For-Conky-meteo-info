package meteo;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;

public class test 
{
	public static void main(String [ ] args) throws IOException
	{
	
		
		StacjaPogodowa Meteo = new StacjaPogodowa();
		
/*		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br
        = new BufferedReader(is);
	
		String parametr = null;
		
		try {
			parametr = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		br.close();
		
		String odczyt = Meteo.Odczyt(parametr); 
		System.out.println(odczyt);
*/
		
		 
		if (args.length > 0) 
			{
				String odczyt = Meteo.Odczyt(args[0]); 
				System.out.println(odczyt);
			}
		else
		{
		System.out.println("Podaj meteo parametr");
		}
	}
}