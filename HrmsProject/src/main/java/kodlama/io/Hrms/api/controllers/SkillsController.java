package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.SkillToCVService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concrete.SkillToCV;

@RestController
@RequestMapping("/api/skills")

public class SkillsController {

	private SkillToCVService skllToCVService;

	@Autowired
	public SkillsController(SkillToCVService skllToCVService) {
		super();
		this.skllToCVService = skllToCVService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody SkillToCV skillToCV) {
		return this.skllToCVService.add(skillToCV);
	}

	@PostMapping("/update")
	public Result update(@RequestBody SkillToCV skillToCV) {
		return this.skllToCVService.update(skillToCV);
	}

	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.skllToCVService.delete(id);
	}

	@GetMapping("/getall")
	public DataResult<List<SkillToCV>> getAll() {
		return this.skllToCVService.getAll();
	}

	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<SkillToCV>> getAllByJobseekerId(@RequestParam int id) {
		return this.skllToCVService.getAllByJobseekerId(id);
	}
}
