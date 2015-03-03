package quiz2;
import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		// Matthews Curtinhas
		double cost, percentIncrease, sum;
		sum = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter cost: ");
		cost = s.nextDouble();
		System.out.println("Enter percent increase as decimal: ");
		percentIncrease = s.nextDouble();
		
		for(int i = 0; i <= 4; i++){
			sum += cost;
			cost += (cost * percentIncrease);
		}
		System.out.printf("The total cost is: $%.2f", sum);
	
	}

}
