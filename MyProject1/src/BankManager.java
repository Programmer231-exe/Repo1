import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class BankManager {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static List<bankNew> getMappedAccount(List<bankNew> banklists,List<BankTransaction> banktransactions) throws IOException {
		System.out.println("Enter the user name to search");
		String name = br.readLine();
		
		bankNew newe = new bankNew();
	newe.setName(name);
	Stream<bankNew> str =banklists.stream();
	str.forEach((s)->System.out.println(s));
	bankNew searcher = new bankNew();
	searcher.setName(name);
	
	List<bankNew> bankUsers = new ArrayList<>();
	
	for(bankNew bank : banklists) {
		if(bank.getName().equals(name)) {
			//bankUsers.add(new bankNew(bank.getName(),bank.getAge(),bank.getGender(),bank.getBank(),bank.getCardNumber(),bank.getCreditLimit()));
			bankUsers.add(bank);
		}
	}
	for(bankNew bank : bankUsers) {
		System.out.println("---------->" + bank);
	}
	
	List<bankNew> finalMappedUser = new ArrayList<>();
	
	for(bankNew bnk : bankUsers) {
		System.err.println(bnk.getName());
		bankNew banks = getTransactions(bnk,banktransactions);
		if(banks != null) {
			finalMappedUser.add(banks);
		}
	}
	
	
	
	
	return finalMappedUser;
	}
	
	private static bankNew getTransactions(bankNew bank,List<BankTransaction> lists) {
		List<BankTransaction> tlist = new ArrayList<>();
		for(BankTransaction banktrans : lists) {
			if(banktrans.getCardNumber().equals(bank.getCardNumber())) {
				tlist.add(banktrans);
			}
		}
		
		Map<String,List<BankTransaction>> finalbank = new TreeMap<>();
		
		finalbank.put(bank.getBank(), tlist);
		
		
		bank.setMapped(finalbank);
		//return new bankNew(finalbank,bank.getName(),bank.getAge(),bank.getGender(),bank.getBank(),
			//	bank.getCardNumber(),bank.getCreditLimit());
		
		return bank;
	}
}
