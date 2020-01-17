package TT2018B003.comp3.API.TestRestAPI;

import org.springframework.web.client.RestTemplate;
import TT2018B003.comp3.API.Domain.WinnowingModelTest;

public class TestRestAPI {
	
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8081/API/v1/winnowing";
		WinnowingModelTest data = new WinnowingModelTest();
		data.setChaffing("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 1504");
		data.setPattern("zEXyq7qUAmbD18RUSxIX+Hk04SIiWnuh8W72vwqLN+q7phEGxrBOFWRHIkCVEUEI45a5TzFxQAcKKE/hLxGquHjTZnCUmx+R2jgVJ/PdeakDMT9ErLFy4oJx8VV+9q6vcGkfnAMnU0bqpXpeqgkKa3MKWr6+qqaTSeb4Rs1USnfZT81IeU9LNCVoSrM5XyekSQdqATwZIp3dpq7mU1s1ccRh/svIGVzH56/ROXi5yZxvJnyCuNYbYSBMPKZU4DaMWLCHNEEQmde/OC4+gBLRgvrpOEr5D8tXsiwdTuhuIhm+6A3pC8GKVgzR1EkEm/BHTiv6udRKaNasZ9IwqpV3mw==");
		
		String a = restTemplate.postForObject(url, data, String.class);
		System.out.println(a);
		
		/*user.setEmail("admin@gmail.com");
		user.setFirstName("admin");
		user.setLastName("admin");
		user.setCreatedBy("admin");
		user.setUpdatedBy("admin");
		ResponseEntity<User> postResponse = restTemplate.postForEntity(getRootUrl() + "/users", user, User.class);
		Assert.assertNotNull(postResponse);
		Assert.assertNotNull(postResponse.getBody());
		*/
		
		
	}
}