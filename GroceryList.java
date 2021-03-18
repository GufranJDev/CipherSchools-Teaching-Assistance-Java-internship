import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GroceryList {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		Map<String, List<Double>> prodList = new HashMap<String, List<Double>>();
		System.out.print("Enter Your budget : ");
		int budget = sc.nextInt();
		int choice=0;
		while(budget!=0) {
			System.out.println("1.Add an item");
			System.out.println("2.Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.print("\n\nEnter product : ");
					String product = sc.next();
					System.out.print("Enter quantity : ");
					double quantity = sc.nextDouble();
					System.out.print("Enter Price : ");
					double price = sc.nextDouble();
					if(budget<price) {
						System.out.println("\nCan't Buy the product ###(because budget left is "+budget+")\n");
						break;
					}
					prodList.put(product, Arrays.asList(quantity,price));
					budget-=price;
					System.out.println("\n\nAmount left : "+budget+"\n\n");
					break;
				case 2:
					if(budget!=0) {
						System.out.println("\n\nAmount left can buy you something........\n\n");
					}
					System.out.println("\nGROCERY LIST is:");
					System.out.println("Product name\t Quantity\t Price");
					prodList.forEach((k,v)->{
						System.out.println(k+"\t\t"+v.get(0)+"\t\t"+v.get(1));
					});
					System.exit(0);
			}
			
		}
		
		if(budget==0) {
			System.out.println("No sufficient balance for shopping");
		}		
	}
}