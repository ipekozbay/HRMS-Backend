package kodlama.io.Hrms.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "jobPosition")
@Data
public class JobPosition {
	@Column(name = "name")
	private String name;

	@Column(name = "id")
	private int id;

	public JobPosition() {
	}

	public JobPosition(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

}
