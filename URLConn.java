package com.company;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class URLConn {
    void connectUrl(){
        //Connection Estaiblish

        try {
            URL url = new URL("https://api.openweathermap.org/data/2.5/weather?lat=26.0&lon=76.00&appid=bbd1ab6a3b933354da569cee3a385cee");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.connect();

            int response = con.getResponseCode();
//            System.out.println(response);

            if (response!=200){
                System.out.println(response);
            }

            else {
                String input = "";
                Scanner sc = new Scanner(url.openStream());

                while(sc.hasNext()){
                    input +=sc.nextLine();
                    System.out.println(input);
                }
                sc.close();

                JSONParser par = new JSONParser();
                JSONObject data = (JSONObject) par.parse(input); // it will convert the string into JSON
//                System.out.println(data);

//                JSONObject lon = (JSONObject) data.get("coord");// Type casting
//                System.out.println(lon.get("lon"));
//
//                JSONObject lat = (JSONObject) data.get("coord");
//                System.out.println(lat.get("lat"));
//
//                JSONObject data2 = (JSONObject) data.get("main");
////                System.out.println(data2);
//
////                float temp = (float) data2.get("temp");
//                System.out.println("Temperature = "+data2.get("temp"));
//
//               var bse = (var) data.get("base");
//                System.out.println(bse);
            }
        }catch (Exception e){}
    }

    private class var {
    }
}

//API- Required data is provided
/* Api is a median between server and client
First thing is data read
 */