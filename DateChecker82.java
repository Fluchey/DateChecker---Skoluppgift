/* Grupp 82: Anton Fluch och Lovisa Lindström */
import java.util.Scanner;
 
class DateChecker82 {
  public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in);
    
    int [] monthArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int month;
    int day;
 
    System.out.println("Ange månad>");
    month = input.nextInt();
    
    	while (month < 1 || month > 12) {
    		System.out.println("Felaktig månad. \nAnge månad>");
    		month = input.nextInt();
    	}
    	
    	if (month > 0 || month < 13) {
    		System.out.println("Ange dag i månaden>");
    		day = input.nextInt();
    		
    		while (day < 1 || day > monthArr[month - 1]) {
    			System.out.println("Felaktig dag i månaden. \nAnge dag i månaden>");
    			day = input.nextInt();
    		}
    		
    		if (day > 0 || day <= monthArr[month - 1]) {
    			System.out.println("Korrekt datum.");
    		input.close();}
    }
  }
}