package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.JobPositionService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concrete.JobPosition;

@RestController
@RequestMapping("api/jobPosition")
@CrossOrigin
public class JobPositonController {

	private JobPositionService jobPositionService;

	@Autowired
	public JobPositonController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getall() {
		return this.jobPositionService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobPosition jobPosition) {
		return this.jobPositionService.add(jobPosition);

	}

	@GetMapping("/getallByPage")
	DataResult<List<JobPosition>> getAll(int pageNo, int pageSize) {
		return this.jobPositionService.getAll(pageNo, pageSize);

	}

	@GetMapping("/getallAsc")
	public DataResult<List<JobPosition>> getAllSorted() {
		return this.jobPositionService.getAllSorted();
	}
}
