package kodlama.io.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employees")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
//@PrimaryKeyJoinColumn(name = "employee_id")

public class Employee  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private int id;

	@Column(name = "firsName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "job")
	private String job;

	@JsonIgnore
	@Column(name = "isActive", columnDefinition = "boolean default true")
	private boolean isActive = true;

	@JsonIgnore
	@Column(name = "isDeleted", columnDefinition = "boolean default false")
	private boolean isDeleted = false;
}
