package learnjava2;

import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class HttpExample {

    public doGet() {
        try {
            URL url = new URL("http://www.google.com");
            HttpsURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", "Java Browser");
            BufferedReader rdr = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder("");
            while((line = rdr.readLine()) != null) {
                sb.append(line);
            }
            rdr.close();
            System.out.println(sb.toString());
        }
        catch (Exxception e) {
            System.err.println(e);
        }
    }

    public doPost() {
        try {
            URL url = new URL("http://ptsv2.com/");
            HttpsURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", "Java Browser");
            BufferedReader rdr = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder("");
            while((line = rdr.readLine()) != null) {
                sb.append(line);
            }
            rdr.close();
            System.out.println(sb.toString());        
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}