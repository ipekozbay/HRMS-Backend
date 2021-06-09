package kodlama.io.Hrms.mernisService;

public class FakeMernisService {

	public boolean ValidatePersonal(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName + " is valid person.");
		return true;
	}
}
