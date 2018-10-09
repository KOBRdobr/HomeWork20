import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import ru.zinnurov.Sun;

/**
 * @author Nail Zinnurov
 * cobratms@gmail.com
 * on 08.10.2018
 */

public class Main {


    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("https://www.metaweather.com/api/location/2122265/?query=Moscow");
        try (InputStream stream = url.openStream();
             Reader reader = new InputStreamReader(stream);
             BufferedReader br = new BufferedReader(reader)
        ){
            StringBuilder builder = new StringBuilder();
            while (br.ready()) {
                builder.append(br.readLine());
            }
            String json = builder.toString();
            Gson g = new Gson();

            JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
            Sun sun = new Sun(jsonObject.get("sun_rise").getAsString(), jsonObject.get("sun_set").getAsString());

            sun.showSunRiseAndSet();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
