package kodlama.io.Hrms.entities.concrete;

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
@Table(name = "base")
@Data

@AllArgsConstructor
@NoArgsConstructor

public class Base {

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

}
