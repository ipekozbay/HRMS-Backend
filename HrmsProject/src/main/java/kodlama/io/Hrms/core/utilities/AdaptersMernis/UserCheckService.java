package kodlama.io.Hrms.core.utilities.AdaptersMernis;

import java.time.LocalDate;

public interface UserCheckService {
	boolean checkIfRealPerson(long nationalityId, String firstName, String lastName,LocalDate dateOfBirth);



}
