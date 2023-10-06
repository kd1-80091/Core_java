import java.util.Scanner;
public class Q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int choice,quantity,price;
		int billamount=0;
		
		do
		{
			
			System.out.println("*********FOOD MENU***********");
			System.out.println("Press 0 for exit");
			System.out.println("Press 1 for idli = 30");
			System.out.println("Press 2 for dosa = 50");
			System.out.println("Press 3 for samosa = 20");
			System.out.println("Press 4 for biryani = 150");
			System.out.println("Press 5 for generate bill");
			System.out.println("Enter your choice = ");
			System.out.println("*******************************");
			
			
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				int price1 = 30;
				System.out.println("Enter idli quantity");
				quantity=sc.nextInt();
				billamount=billamount + 30 * quantity;
				System.out.println("Idli is added to your cart");
				break;
				
			case 2:
				int price2=50;
				System.out.println("Enter dosa quantity");
				quantity=sc.nextInt();
				billamount=billamount + 50 * quantity;
				System.out.println("dosa is added to your cart");
				break;
			case 3:
				int price3=50;
				System.out.println("Enter samosa quantity");
				quantity=sc.nextInt();
				billamount=billamount + 20 * quantity;
				System.out.println("samosa is added to your cart");
				break;
			case 4:
				int price4=50;
				System.out.println("Enter biryani quantity");
				quantity=sc.nextInt();
				billamount=billamount + 150 * quantity;
				System.out.println("biryani is added to your cart");
				break;	
					
			case 5:
				System.out.println("Your total generated bill is = "+billamount);
				break;
			
			default:
				System.out.println("Invalid choice");
				
			}
		
		}while(choice!=0);
	}	
}








