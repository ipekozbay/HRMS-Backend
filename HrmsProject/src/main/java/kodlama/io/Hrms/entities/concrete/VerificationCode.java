package kodlama.io.Hrms.entities.concrete;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "verification_codes")
@Data
public class VerificationCode extends Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "user_id")
	private int userId;

	@Column(name = "code")
	private String code;

	@Column(name = "is_confirmed")
	private boolean isConfirmed;

}
