/*
@author:- Chiranjiv Goyal

A java function that will ping any host ( given as input ) 
and computes the median of the time taken to ping.

Used the system ping utility, not any deprecated methods.
*/

package Assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.StringBuffer;

public class SendPingToIP
{

    private int numPings = 11;
    public double getMedianForIP(String IPAddress) throws Exception
    {
        List<Double> time_list = new ArrayList<Double>();
        double median;

        try
        {
            time_list = SendPingRequest(IPAddress);
        }
        catch(Exception e)
        {
            e.printStackTrace();;
        }

        median = getMedian(time_list);
        return median;
    }


    private  List<Double> SendPingRequest(String ip) throws Exception
    {
        String url;
        StringBuffer echo = new StringBuffer();
        url = "ping " + ip;
        List<Double> pingTimings = new ArrayList<Double>();
        int counter = 0;

        try
        {
            Process p = Runtime.getRuntime().exec(url);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s = "";

            while ((s = inputStream.readLine()) != null && counter<=numPings)
            {
                if(counter==0)
                {
                    counter++;
                    continue;
                }
                double pingTime = getTime(s);
                pingTimings.add(pingTime);
                echo.append(s + '\n');

                counter++;
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();

        }

        return pingTimings;
    }

    private double getTime(String message)
    {
        String[] words = message.split("=");
        String time = words[words.length-1];

        String[] time_and_unit = time.split(" ");
        time = time_and_unit[0];

        return Double.parseDouble(time);
    }

    private double getMedian(List<Double> array)
    {
        Collections.sort(array);
        double median;
        median = array.get(array.size()/2);
        return median;
    }


}