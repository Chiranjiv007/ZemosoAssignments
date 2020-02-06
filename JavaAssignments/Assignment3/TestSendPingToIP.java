package Assignment3;

import java.util.Scanner;

public class TestSendPingToIP
{
    public static void main(String[] args) throws Exception
    {
        SendPingToIP request = new SendPingToIP();
        String IP = getString("Enter the IP Address: ");

        System.out.println("Median: "+ request.getMedianForIP(IP) + " ms");

    }

    public static String getString(String CALL_FOR_VAR) throws Exception
    {
        System.out.println(CALL_FOR_VAR);

        String str = "";
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        sc.close();

        return str;
    }
}