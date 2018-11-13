package application;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Service {

	Account account = new Account("Manish", "kru", 2);
	ObjectMapper mapper = new ObjectMapper();
	int count =0;

	HashMap<Integer, Account> reqdMap = new HashMap<Integer, Account>();

	public void addUser(String FirstName, String SecondName, int id) {

		reqdMap.put(id, new Account(account.getFirstName(), account.getLastName(), account.getAccountNumber()));
		System.out.println(reqdMap.values());

		try {
			String jsonCon = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(reqdMap);
			System.out.println(jsonCon);

			TypeReference<HashMap<String, Account>> new_String = new TypeReference<HashMap<String, Account>>() {
			};
			Map<String, Account> map = mapper.readValue(jsonCon, new_String);
			System.out.println(map.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void add_user(Account name1) {
		this.reqdMap.put(count, name1);
		count++;
	}

	public int countName(String FName) {
		int counter = 0;
		for (Account check : reqdMap.values()) {
			if (check.getFirstName().equals(FName)) {
				counter++;
			}
		}
		return counter;
	}
	
	public int countNameByStream(String FName) {
		return (int) reqdMap.values().stream().filter(account -> account.getFirstName().equals(FName)).count();


	}

}
