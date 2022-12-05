package com.bykov.lab56;

import org.springframework.stereotype.Component;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Logger;

@Component("exchangerBean")
public class Exchanger {
    public static final Logger logger = Logger.getLogger(Exchanger.class.getName());

    public static String getHTML(String urlToRead) throws Exception {
        logger.info("[log] enter point in getHTML");
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpsURLConnection) url.openConnection();

        conn.setRequestMethod("GET");
        try (BufferedReader reader = new BufferedReader (
                new InputStreamReader(conn.getInputStream()))){
            for(String line; (line = reader.readLine()) != null; ){
                result.append(line);
            }
        }
        logger.info("[log] out point in getHTML");
        return result.toString();
    }
}
