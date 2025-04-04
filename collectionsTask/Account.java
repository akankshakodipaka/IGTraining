package collectionsTask;

public class Account {
	Integer id;
	String name;
	Double salary;
	public Account(Integer id, String name,Double salary)
	{
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
//	public String getName()
//	{
//		return name;
//	}
//	public double getSalary()
//	{
//		return salary;
//	}
//	public int getId()
//	{
//		return id;
//	}

	public String toString() {
		return "Account Id :"+id+"\t"+"Name : "+name+"\t"+"Salary : "+salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
