package com.company;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Assignment {
    void connect(){
        //Connection Estaiblish

        try {
            URL url = new URL("https://api.thingspeak.com/channels/1821080/feeds.json?results=2");
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


                JSONArray feeds = (JSONArray) data.get("feeds");
                for (Object feed : feeds) {
                    JSONObject feedObject = (JSONObject) feed;
                    String field1Value = (String) feedObject.get("field1");

                    System.out.println(" Field1: " + field1Value);
                }
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