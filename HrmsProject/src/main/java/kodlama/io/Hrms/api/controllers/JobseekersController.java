package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.JobseekerService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concretes.Jobseeker;
import kodlama.io.Hrms.entities.dtos.JobSeekerCVDto;

@RestController
@RequestMapping("/api/jobseeker")

public class JobseekersController {

	private JobseekerService jobseekerService;

	@Autowired
	public JobseekersController(JobseekerService jobseekerService) {
		super();
		this.jobseekerService = jobseekerService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody Jobseeker jobseeker) {
		return this.jobseekerService.add(jobseeker);
	}

	@PostMapping("/update")
	public Result update(@RequestBody Jobseeker jobseeker) {
		return this.jobseekerService.update(jobseeker);
	}

	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.jobseekerService.delete(id);
	}

	@GetMapping("/getall")
	public DataResult<List<Jobseeker>> getAll() {
		return this.jobseekerService.getAll();
	}

	@GetMapping("/getJobseekerCVById")
	public DataResult<JobSeekerCVDto> getJobseekerCVById(@RequestParam int id) {
		return this.jobseekerService.getJobseekerCVById(id);
	}
}
