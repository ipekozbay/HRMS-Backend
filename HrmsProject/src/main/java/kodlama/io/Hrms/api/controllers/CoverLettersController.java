package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.CoverLetterToCVService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concrete.CoverLetterToCV;

@RestController
@RequestMapping("/api/coverletters")
public class CoverLettersController {
	
	private CoverLetterToCVService coverLetterToCVService;

	@Autowired
	public CoverLettersController(CoverLetterToCVService coverLetterToCVService) {
		super();
		this.coverLetterToCVService = coverLetterToCVService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody CoverLetterToCV coverLetterToCV){
		return this.coverLetterToCVService.add(coverLetterToCV);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CoverLetterToCV coverLetterToCV){
		return this.coverLetterToCVService.update(coverLetterToCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.coverLetterToCVService.delete(id);
	}

	@GetMapping("/getall")
	public DataResult<List<CoverLetterToCV>> getAll() {
		return this.coverLetterToCVService.getAll();
	}
	@GetMapping("/getbyid")
	public DataResult<CoverLetterToCV> getById(@RequestParam("id") int id){
		return this.coverLetterToCVService.getById(id);
	}
	
	
}
