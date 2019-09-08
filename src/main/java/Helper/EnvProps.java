package Helper;

import java.io.IOException;
import java.util.Properties;

public class EnvProps {

    Properties properties;


    public EnvProps() {
        properties = new Properties();
        try {
            properties.load(getClass().getResourceAsStream("env.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getWebSiteUrl() {
        return properties.getProperty("env.website.url");
    }



}
