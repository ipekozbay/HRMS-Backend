package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.JobPositionService;
import kodlama.io.Hrms.entities.concrete.JobPosition;

@RestController
@RequestMapping("api/jobPosition")
public class JobPositonController {
	
	private JobPositionService jobPositionService;

	@Autowired
	public JobPositonController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public List<JobPosition> getall(){
		return this.jobPositionService.getAll();
		}
	
}
