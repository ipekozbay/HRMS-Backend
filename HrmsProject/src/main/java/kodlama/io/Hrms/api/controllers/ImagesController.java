package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.ImageToCVService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concretes.ImageToCV;

@RestController
@RequestMapping("/api/images")

public class ImagesController {
	ImageToCVService imageToCVService;

	@Autowired
	public ImagesController(ImageToCVService imageToCVService) {
		super();
		this.imageToCVService = imageToCVService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody ImageToCV ImageToCV) {
		return this.imageToCVService.add(ImageToCV);
	}

	@PostMapping("/update")
	public Result update(@RequestBody ImageToCV ImageToCV) {
		return this.imageToCVService.update(ImageToCV);
	}

	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.imageToCVService.delete(id);
	}

	@GetMapping("/getall")
	public DataResult<List<ImageToCV>> getAll() {
		return this.imageToCVService.getAll();
	}

}
