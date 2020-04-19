import java.text.DecimalFormat;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float computerPrice = 1000.57f; 
		float shoePrice = 53.99f;
		
		short amountInSherikasWallet = 2500;
		float amountInSharonsWallet = 3500.70f;
		
		byte sherikasNumberOfFriends = 30;
		short sharonsNumberOfFriends = 1000;
		
		byte sherikasAge = 30;
		byte sharonsAge= 45; 
		
		String sherikasFirstName = "Sherika";
		String sharonsFirstName = "Sharon";
		
		String sherikasLastName = "Jones";
		String sharonsLastName = "Johnson";
		
		char sherikasMiddleInitial = 'M';
		char sharonsMiddleInitial = 'S';
		
		float sherikasNewWalletBalance = amountInSherikasWallet - computerPrice;
		float sharonsNewWalletBalance = amountInSharonsWallet - shoePrice;
		
		int sherikasFriendsPerYear = sherikasNumberOfFriends / sherikasAge;
		int sharonsFriendsPerYear = sharonsNumberOfFriends / sharonsAge;
				
		String sherikasFullName = sherikasFirstName + " " + sherikasMiddleInitial + " " + sherikasLastName;
		String sharonsFullName = sharonsFirstName + " "+ sharonsMiddleInitial + " " + sharonsLastName; 
		
		System.out.println("The price of the computer is: " + "$" + computerPrice + ".");
		System.out.println("The price of the shoes is: " + "$"+ shoePrice + ".");
		System.out.println("The amount of money in Sherika's wallet is " + "$" + amountInSherikasWallet + ".");
		System.out.println("Sherika has " + "$" + sherikasNewWalletBalance + " left after purchasing the computer.");
		System.out.println("The amount of money in Sharon's wallet is " + "$" + amountInSharonsWallet + ".");
		System.out.println("Sharon has " + "$" + sharonsNewWalletBalance + " left after purchasing shoes.");
		System.out.println("Sherika has " +sherikasNumberOfFriends + " friends and is " + sherikasAge + " years old.");
		System.out.println("Sherika has made about " + sherikasFriendsPerYear + " friend each year.");
		System.out.println("Sharon has " + sharonsNumberOfFriends + " friends and is " + sharonsAge + " years old.");
		System.out.println("Sharon has made about " + sharonsFriendsPerYear + " friends each year.");
		System.out.println("My first name is " + sherikasFirstName + ".");
		System.out.println("My middle initial is " + sherikasMiddleInitial + ".");
		System.out.println("My last name is " + sherikasLastName + ".");
		System.out.println("My full name is " + sherikasFullName + ".");
		System.out.println("My mother's first name is " + sharonsFirstName + ".");
		System.out.println("My mother's middle initial is " + sharonsMiddleInitial + ".");
		System.out.println("My mother's last name is " + sharonsLastName + ".");
		System.out.println("My mother's full name is " + sharonsFullName + ".");
	}

}