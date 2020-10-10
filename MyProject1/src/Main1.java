import java.util.List;
import java.util.Set;

public class Main1 {

	public static void main(String[] args) 
	{
	try {
		
			
			List<bankNew> callLogList = BankImpl.getDetails();
			System.out.println(callLogList);
			for(bankNew bank: callLogList) {
				System.err.println(bank.getName());
			}
			List<BankTransaction> b = BankTransactionImpl.getTransaction();
			System.out.println(b);
			for(BankTransaction bank : b) {
				System.err.println(bank.getCardNumber());
			}
			
			
		List<bankNew> lists =  BankManager.getMappedAccount(callLogList, b);
		System.out.println(lists);
		for(bankNew bank: lists) {
			System.err.println(bank.getName() + " " + bank.getAge() + " " + bank.getCardNumber());
			
			Set<String> keysets = bank.getMapped().keySet();
			for(String key : keysets) {
				System.out.println(key + "============>");
				List<BankTransaction> list =  bank.getMapped().get(key);
				for(BankTransaction bnk : list) {
						System.err.println(bnk.getAmount() + " " + bnk.getCardNumber() + " " +bnk.getTransactionDate()); 
				}
			}
		System.out.println();	
		}

	} catch (Exception e) {
		
		e.printStackTrace();
	}	
	
	
	

}
}
