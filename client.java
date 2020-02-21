import java.io.*;
import java.net.Socket;

public class client {
public static void main(String a[]) {
	try {
		Socket s= new Socket("",3000);//PUT IP OF THE SERVER
		BufferedOutputStream b1 = new BufferedOutputStream(s.getOutputStream());
		FileInputStream fis = new FileInputStream("");//PUT FILE NAME HERE WHICH YOU WANT TO SEND
		BufferedInputStream b2= new BufferedInputStream(fis);
		byte b[]= new byte[10000000];
		b=b2.readAllBytes();
		b2.close();
		System.out.println("FILE SENDING");
		b1.write(b);
		System.out.println("FILE SENT");
		b1.flush();
		b1.close();
		
	}
	catch(Exception e){
		e.printStackTrace();
		
	}
}
}
