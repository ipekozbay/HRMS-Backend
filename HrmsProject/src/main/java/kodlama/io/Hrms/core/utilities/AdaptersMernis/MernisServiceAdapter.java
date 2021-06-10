package kodlama.io.Hrms.core.utilities.AdaptersMernis;

import java.time.LocalDate;

import kodlama.io.Hrms.mernisService.FakeMernisService;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(long nationalityId, String firstName, String lastName, LocalDate dateOfBirth) {

		FakeMernisService client = new FakeMernisService();

		boolean result = client.ValidatePersonal(nationalityId, firstName, lastName, dateOfBirth);

		return result;
	}
}
