package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.EmployerService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	EmployerService employerService;

	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
	}

	@PostMapping("/update")
	public Result update(@RequestBody Employer employer) {
		return this.employerService.update(employer);
	}

	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.employerService.delete(id);
	}

	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll() {
		return this.employerService.getAll();
	}

}
