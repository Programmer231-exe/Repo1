import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class bankNew {
	
	private Map<String,List<BankTransaction>> mapped = new TreeMap<>();
	
	public Map<String, List<BankTransaction>> getMapped() {
		return mapped;
	}


	public void setMapped(Map<String, List<BankTransaction>> mapped) {
		this.mapped = mapped;
	}


	public bankNew()
	{
		super();
	}
	
		
			public bankNew(Map<String, List<BankTransaction>> mapped, String name, int age, String gender, String bank,
			String cardNumber, long creditLimit) {
		super();
		this.mapped = mapped;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.bank = bank;
		this.cardNumber = cardNumber;
		this.creditLimit = creditLimit;
	}


			public bankNew(String name, int age, String gender, String bank, String cardNumber, long creditLimit)
			{
				super();
				this.name = name;
				this.age = age;
				this.gender = gender;
				this.bank = bank;
				this.cardNumber = cardNumber;
				this.creditLimit = creditLimit;
			}
			private String name;
			private int age;
			private String gender;
			private String bank;
			private String cardNumber;
			private long creditLimit;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public String getGender() {
				return gender;
			}
			public void setGender(String gender) {
				this.gender = gender;
			}
			public String getBank() {
				return bank;
			}
			public void setBank(String bank) {
				this.bank = bank;
			}
			public String getCardNumber() {
				return cardNumber;
			}
			public void setCardNumber(String cardNumber) {
				this.cardNumber = cardNumber;
			}
			public long getCreditLimit() {
				return creditLimit;
			}
			public void setCreditLimit(long creditLimit) {
				this.creditLimit = creditLimit;
			}
			

		




		
		

	}



