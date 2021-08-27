package kodlama.io.Hrms.entities.concretes;

import java.time.LocalDate;

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
@Table(name = "job_positions")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
//@PrimaryKeyJoinColumn(name = "jobposition_id")
public class JobPosition {

	@Id
	@GeneratedValue()

	@Column(name = "id")
	private int id;

	@JsonIgnore
	@Column(name = "isActive", columnDefinition = "boolean default true")
	private boolean isActive = true;

	@JsonIgnore
	@Column(name = "isDeleted", columnDefinition = "boolean default false")
	private boolean isDeleted = false;

	@Column(name = "job_name")
	private String jobName;

	@JsonIgnore
	@Column(name = "created_at")
	private LocalDate createdAt = LocalDate.now();

}
