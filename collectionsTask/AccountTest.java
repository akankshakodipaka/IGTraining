package collectionsTask;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccountServices service=new AccountServices();
		
		//int x=sc.nextInt();
		while(true)
		{
			System.out.println("1.To Add.\n2.List details\n3.Modify Salary\n4.Delete\n5.Exit");
			int x=sc.nextInt();
		switch(x)
		{
			case 1:
				System.out.println("Enter number of Accounts need to add: ");
				int n=sc.nextInt();
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter Account id:");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Name:");
					String name=sc.nextLine();
					System.out.println("Enter Salary:");
					Double salary=sc.nextDouble();
					Account a=new Account(id,name,salary);
					service.addAccount(a);
					
				}
				break;
			case 2:
				System.out.println("List of Account Details are :");
				service.listAccounts();
				break;
			case 3:
				System.out.println("Enter id and modified salary");
				int i=sc.nextInt();
				Double sal=sc.nextDouble();
				service.modifySalary(i,sal);
				break;
			case 4:
				System.out.println("Enter id to be deleted :");
				int j=sc.nextInt();
				service.delete(j);
				break;
			case 5:
				System.out.println("--End--");
				return;
	
			default:
				System.out.println("Invalid");
				
		}
		}
	}

}
