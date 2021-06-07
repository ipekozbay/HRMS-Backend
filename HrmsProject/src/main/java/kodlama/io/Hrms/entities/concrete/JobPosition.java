package kodlama.io.Hrms.entities.concrete;

import java.time.LocalDate;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "jobPositions")
@Data

@NoArgsConstructor
@AllArgsConstructor

public class JobPosition extends Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "job_name")
	private String jobName;

	@JsonIgnore
	@Column(name = "created_at")
	private LocalDate createdAt = LocalDate.now();

}
