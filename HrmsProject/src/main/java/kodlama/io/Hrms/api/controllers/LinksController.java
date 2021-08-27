package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.LinkToCVService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concretes.LinkToCV;

@RestController
@RequestMapping("/api/links")

public class LinksController {
	private LinkToCVService linkToCVService;

	@Autowired
	public LinksController(LinkToCVService linkToCVService) {
		super();
		this.linkToCVService = linkToCVService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody LinkToCV linkToCV) {
		return this.linkToCVService.add(linkToCV);
	}

	@PostMapping("/update")
	public Result update(@RequestBody LinkToCV linkToCV) {
		return this.linkToCVService.update(linkToCV);
	}

	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.linkToCVService.delete(id);
	}
	@GetMapping("/getall")
	public DataResult<List<LinkToCV>> getAll() {
		return this.linkToCVService.getAll();
	}

	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<LinkToCV>> getAllByJobseekerId(@RequestParam int id) {
		return this.linkToCVService.getAllByJobseekerId(id);
	}
	@GetMapping("/getbyid")
	public DataResult<LinkToCV> getById(@RequestParam("id") int id) {
		return this.linkToCVService.getById(id);
	}

}
