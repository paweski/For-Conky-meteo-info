package meteo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class StacjaPogodowa
{
	String odczytMeteo;
	
String Odczyt(String parametrMeteo ) throws IOException
{

	Document doc = Jsoup.connect("http://www.meteo.waw.pl/") .get() ;
	
	switch (parametrMeteo)
	{
	
	
	case "tytułstrony": 
	{
		String title = doc.title();
		odczytMeteo = title;
	} 
	break;
	
	case "cisnienie":	
		{
			Element temp = doc.getElementById("PARAM_0_PR");
			String cisnienie = temp.text();
			odczytMeteo = cisnienie;
		}
		break;
		
	case "temperatura":	
		{
			Element temp = doc.getElementById("PARAM_0_TA");
			String temperatura = temp.text();
			odczytMeteo = temperatura;
		}
		break;
		
	case "odczuwalna":	
	{
		Element temp = doc.getElementById("PARAM_0_WCH");
		String temperaturaOdczuwalna = temp.text();
		odczytMeteo = temperaturaOdczuwalna;
	}
	break;

	
	case "wilgotnosc":	
		{
			Element temp = doc.getElementById("PARAM_0_RH");
			String wilgotnosc = temp.text();
			odczytMeteo = wilgotnosc;
		}
		break;
	
	case "wiatr":	
	{
		Element temp = doc.getElementById("PARAM_0_WV");
		String wiatr = temp.text();
		odczytMeteo = wiatr;
	}
		break;
		
	case "kierunekwiatru":	
		{
			Element temp = doc.getElementById("PARAM_0_WDABBR");
			String kierunekWiatru = temp.text();
			odczytMeteo = kierunekWiatru;
		}
		break;
	}
	
	return odczytMeteo;
	
	
}
}
