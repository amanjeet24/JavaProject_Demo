package AccessModifier;

public class AccountMain {

	public static void main(String[] args) {


		Account acc=new Account();
		
		acc.setAccno(101);
		acc.setAmount(56000);
		acc.setName("John");
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getAmount());
		System.out.println(acc.getName());
	}

}
