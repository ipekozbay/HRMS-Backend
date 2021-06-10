package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.ForeignLanguageToCVService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concrete.ForeignLanguageToCV;

@RestController
@RequestMapping("/api/foreignlanguages")
public class ForeignLanguagesController {

	ForeignLanguageToCVService foreignLanguageService;

	@Autowired
	public ForeignLanguagesController(ForeignLanguageToCVService foreignLanguageService) {
		super();
		this.foreignLanguageService = foreignLanguageService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody ForeignLanguageToCV foreignLanguageToCV) {
		return this.foreignLanguageService.add(foreignLanguageToCV);
	}

	@PostMapping("/update")
	public Result update(@RequestBody ForeignLanguageToCV foreignLanguageToCV) {
		return this.foreignLanguageService.update(foreignLanguageToCV);
	}

	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.foreignLanguageService.delete(id);
	}

	@GetMapping("/getall")
	public DataResult<List<ForeignLanguageToCV>> getAll() {
		return this.foreignLanguageService.getAll();
	}

	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<ForeignLanguageToCV>> getAllByJobseekerId(@RequestParam int id) {
		return this.foreignLanguageService.getAllByJobseekerId(id);
	}
}
