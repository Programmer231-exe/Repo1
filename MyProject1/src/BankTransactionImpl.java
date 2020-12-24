import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BankTransactionImpl {
	private static List<BankTransaction> bt = new ArrayList<BankTransaction>();
	public static List<BankTransaction> getTransaction() throws Exception
	{
		try {
			
			
			BankTransaction Bank1 = null;
			String line = "";
			File csvFile = new File("E:\\Today\\Banktransactions.csv");
			BufferedReader br1 = new BufferedReader(new FileReader(csvFile));
			 
			br1.readLine();
			while ((line = br1.readLine()) != null) {

				String[] arr1 = line.split(",");
				if (arr1.length > 0) {
					Bank1 = new BankTransaction();
					Bank1.setCardNumber(arr1[0]);
					Bank1.setTransactionDate(arr1[2]);
					Bank1.setAmount(Long.parseLong(arr1[1]));
					bt.add(Bank1);
				}
			}
			for (BankTransaction b1 : bt) {
			
				System.out.printf("CardNumber:%s , Transactiondate:%s  ,Amount:%d\n", b1.getCardNumber(),
						b1.getTransactionDate(), b1.getAmount());

			}
		}

		catch (IOException ex) {
			ex.printStackTrace();
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		catch(Exception e)
		{
		System.out.println("hi");	
		}

		finally {
			
		}
		return bt;
	}
	}

