package kodlama.io.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job_advert")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
//@PrimaryKeyJoinColumn(name = "jobadvert_id")
public class JobAdvert {
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

	@Column(name = "name")
	private String name;

	@Column(name = "city_name")
	private String cityName;

	@Column(name = "salary")
	private int salary;

	@Column(name = "explanation")
	private String explanation;

	@Column(name = "is_open")
	private boolean isOpen;

	@Column(name = "is_close")
	private boolean isClose;

	@ManyToOne
	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition;

	@Column(name = "open_position_count")
	private int openPositionCount;

	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
}
