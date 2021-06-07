package kodlama.io.Hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSkeerCVDto {
	
	private int id;
	private String firstName;
	private String lastName;
	private String job;
	private String nationalityId;
	

}
