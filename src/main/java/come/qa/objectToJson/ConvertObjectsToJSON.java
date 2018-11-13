package come.qa.objectToJson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.other.Account;

public class ConvertObjectsToJSON {

	public String objectToJSONConverter(Account user) {

		ObjectMapper objMapper = new ObjectMapper();

		String jsonObject = "";

		try {
			jsonObject = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
			System.out.println(jsonObject);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return jsonObject;
	}

}
