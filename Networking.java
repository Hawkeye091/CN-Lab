/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking;

import java.io.*;
import java.net.InetAddress;
import java.net.NetworkInterface;
/**
 *
 * @author bit
 */
public class Networking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {

        BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        String localhn=InetAddress.getLocalHost().getHostName();
        String localadd=InetAddress.getLocalHost().getHostAddress();
        System.out.println("Host Name"+localhn);
        System.out.println("Ip-Address"+localadd);           
        System.out.println("Enter Ip-Address to get Host Name");
        String hn=Br.readLine();
        System.out.println("Enter Host Name to get Ip-Address");
        String ipad=Br.readLine();
        InetAddress ob1=InetAddress.getByName(ipad);
        InetAddress ob2=InetAddress.getByName(hn);
        System.out.println("Host Name "+ipad);
        System.out.println("Ip-Address "+hn);                
        InetAddress ip;
        ip = InetAddress.getLocalHost();
	System.out.println("Current IP address : " + ip.getHostAddress());
	NetworkInterface network = NetworkInterface.getByInetAddress(ip);
	byte[] mac = network.getHardwareAddress();
	System.out.print("Current MAC address : ");
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < mac.length; i++) {
	sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
	}
	System.out.println(sb.toString());
        for(char i=ip.charAt(0);i!='.';i++)
            
    }
    
}
