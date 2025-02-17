package collectionsTask;

import java.util.ArrayList;

public class AccountServices {
	ArrayList<Account> accountList=new ArrayList<>();
	
	public void addAccount(Account account)
	{
		accountList.add(account);
	}
	public void modifySalary(int id,Double salary)
	{
		for(int i=0;i<accountList.size();i++)
		{
			if(accountList.get(i).getId()==id)
			{
				accountList.get(i).setSalary(salary);
				System.out.println("After Modification :");
				System.out.println(accountList.get(i).getId()+" "+accountList.get(i).getName()+" "+accountList.get(i).getSalary());
				return;
				
			}
		}
	}
	public void delete(int id)
	{
		for(int i=0;i<accountList.size();i++)
		{
			if(accountList.get(i).getId()==id)
			{
				accountList.remove(i);
				System.out.println("After Deletion :");
				//System.out.println(accountList.get(i).getId()+" "+accountList.get(i).getName()+" "+accountList.get(i).getSalary());
				listAccounts();
				return;
				
			}
		}
	}
	
	public void listAccounts() {
		accountList.forEach(x-> System.out.println(x));
	}

}
