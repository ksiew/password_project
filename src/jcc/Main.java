package jcc;

import jcc.websitetemplate.Web;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Web web = new Web();
		web.online();
		
		
		
		scan.close();
	}

}
