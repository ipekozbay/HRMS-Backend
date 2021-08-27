package kodlama.io.Hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "jobseekers")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor

public class Jobseeker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private int id;

	@JsonIgnore
	@Column(name = "isActive", columnDefinition = "boolean default true")
	private boolean isActive = true;

	@JsonIgnore
	@Column(name = "isDeleted", columnDefinition = "boolean default false")
	private boolean isDeleted = false;

	@Column(name = "firsName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "job")
	private String job;

	@Column(name = "nationalIdentity")
	private String nationalIdentity;

	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;

	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<SchoolToCV> schools;

	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<SkillToCV> skills;

	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<LinkToCV> links;

	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<ForeignLanguageToCV> foreignLanguages;

	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<ExperienceToCV> experiences;

	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<CoverLetterToCV> coverLetters;

	@JsonIgnore
	@OneToOne(mappedBy = "jobseeker")
	private ImageToCV image;

}
