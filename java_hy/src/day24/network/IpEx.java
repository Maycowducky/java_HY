package day24.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpEx {

	public static void main(String[] args) {
		InetAddress inetAddress = null;
		
		try {
			//이름이 localhost인 곳의 IP주소 정보를 가져옴
			//localhost는 모든 PC가 같음
			inetAddress = InetAddress.getByName("localhost");
			System.out.println(inetAddress);
			//www.naver.com 사이트의 IP주소 조회
			inetAddress = InetAddress.getByName("www.naver.com");
			System.out.println(inetAddress);
			//내 PC의 IP 조회
			inetAddress = InetAddress.getLocalHost();
			System.err.println(inetAddress);
			
			InetAddress [] address = 
					InetAddress.getAllByName("www.naver.com");
			for(InetAddress tmp : address) {
				System.out.println(tmp);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}

}
