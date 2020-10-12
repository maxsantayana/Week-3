import java.util.Scanner;

public class deleting_characters {

	public static void main(String[] args) {
		
String ch = new String();
while (true){
	
Scanner scan = new Scanner(System.in);
	System.out.println("Write any phrase, just DON'T use the letter lowercase m ;)");
	String a1 = scan.nextLine();
	
	String a2 = new String (a1.replace("m", ""));
	System.out.println(a2);
	}}}


