package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.SchoolToCVService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concrete.SchoolToCV;

@RestController
@RequestMapping("/api/schools")

public class SchoolsController {

	private SchoolToCVService schoolToCVService;

	@Autowired
	public SchoolsController(SchoolToCVService schoolToCVService) {
		super();
		this.schoolToCVService = schoolToCVService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody SchoolToCV schoolToCV) {
		return this.schoolToCVService.add(schoolToCV);
	}

	@PostMapping("/update")
	public Result update(@RequestBody SchoolToCV schoolToCV) {
		return this.schoolToCVService.update(schoolToCV);
	}

	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.schoolToCVService.delete(id);
	}

	@GetMapping("/getall")
	public DataResult<List<SchoolToCV>> getAll() {
		return this.schoolToCVService.getAll();
	}

	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<SchoolToCV>> getAllByJobseekerId(@RequestParam int id) {
		return this.schoolToCVService.getAllByJobseekerId(id);
	}

	@GetMapping("/getAllByJobseekerIdOrderByEndAtDesc")
	public DataResult<List<SchoolToCV>> getAllByJobseekerIdOrderByEndAtDesc(@RequestParam int id) {
		return this.schoolToCVService.getAllByJobseekerIdOrderByEndAtDesc(id);
	}

}
