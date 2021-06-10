package kodlama.io.Hrms.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
public class Employer extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "website")
	private String website;

	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "is_verified")
	private boolean isVerified = false;
}
