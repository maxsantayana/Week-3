import java.text.DecimalFormat;
import java.util.Scanner;

public class add_commas {

public static void main(String[] args) {

	
	
double num;

while (true){
Scanner bb = new Scanner(System.in);
DecimalFormat f = new DecimalFormat(",000");
System.out.println("What is your dream salary?");
num = bb.nextDouble();
System.out.println(f.format(num));
	}
}}
