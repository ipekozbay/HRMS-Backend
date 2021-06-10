package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.ExperienceToCVService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concrete.ExperienceToCV;

@RestController
@RequestMapping("/api/experience")

public class ExperiencesController {
	
	private ExperienceToCVService experienceToCVService;

	@Autowired
	public ExperiencesController(ExperienceToCVService experienceToCVService) {
		super();
		this.experienceToCVService = experienceToCVService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody ExperienceToCV experienceToCV) {
		return this.experienceToCVService.add(experienceToCV);
	}

	@PostMapping("/update")
	public Result update(@RequestBody ExperienceToCV experienceToCV) {
		return this.experienceToCVService.update(experienceToCV);
	}

	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.experienceToCVService.delete(id);
	}

	@GetMapping("/getall")
	public DataResult<List<ExperienceToCV>> getAll() {
		return this.experienceToCVService.getAll();
	}
	

	@GetMapping("/getAllByJobseekerIdOrderByEndAtDesc")
	public DataResult<List<ExperienceToCV>> getAllByJobseekerIdOrderByEndAtDesc(@RequestParam("id") int id){
		return this.experienceToCVService.getAllByJobseekerIdOrderByEndAtDesc(id);
	}
	
	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<ExperienceToCV>> getAllByJobseekerId(@RequestParam int id){
		return this.experienceToCVService.getAllByJobseekerId(id);
	}

	
}
