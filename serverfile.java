package ftp;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class serverfile {
	public static void main(String args[]) {
		try {
			ServerSocket s = new ServerSocket(3000);
			Socket ss=s.accept();
			System.out.println("connected");
			byte b[]= new byte[999999999];
			BufferedInputStream b1= new BufferedInputStream(ss.getInputStream());
			b=b1.readAllBytes();
			FileOutputStream fos = new FileOutputStream("");//PUT FILE NAME WITH SAME EXTENSION SENT
		    BufferedOutputStream b2 = new BufferedOutputStream(fos);
		    b2.write(b);
		    System.out.println("DONE");
		    b2.flush();
		}
		catch(Exception e) {
			
		}
	}

}
