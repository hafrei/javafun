import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PictureFetch{
	public static void main(String[] args) {

		PictureFetch getPicture = new PictureFetch();
		String pageOutput = getPicture.pageRead();

		//System.out.println(pageOutput);
	}

	public String pageRead(){
		String inputLine;
		String fullPage;
		String tempLine;
		String picURLs = "";

		String url = "http://www.reddit.com/r/birdpics";
		String leftBoundary = "href=\"";
		String rightBoundary = "\"";

		try{
			URL retrievePage = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) retrievePage.openConnection(); 
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            while ((inputLine = reader.readLine()) != null) {
            	System.out.println(inputLine + "\n");
            	fullPage += inputLine;
				//picURLs += inputLine;            	
            }

            /*
            for (fullPage : String i) {
            	tempLine = i.split("\"");

            	if (tempLine != null && tempLine.contains(".jpg")) {
            		picURLs += tempLine + "\n";
            	}
            }	
			*/

            //While string != null, find next leftBoundary. 
            //Copy Substr(indexOf()+leftBoundary.length, indexOf(rightBoundary), substr(indexOf(rightBoundary+1),string.length)

            while(fullPage != null){
            	fullPage 
            }

            reader.close();
            connection.disconnect();
		}
		catch(Exception e){
			picURLs = e.getMessage();
		}

		return picURLs;
	}
}