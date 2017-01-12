package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        String site = "https://yandex.ru";
        URL url = new URL(site);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        int responseCode = urlConnection.getResponseCode();
        System.out.println(responseCode);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        StringBuilder result = new StringBuilder();
        String input;
        while ((input = bufferedReader.readLine()) != null) {
            result.append(input).append("\n\n");
        }
        System.out.println(result);
    }
}
