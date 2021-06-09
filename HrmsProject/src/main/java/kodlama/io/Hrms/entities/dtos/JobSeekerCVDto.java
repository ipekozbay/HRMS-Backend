package kodlama.io.Hrms.entities.dtos;

import java.util.List;

import kodlama.io.Hrms.entities.concrete.ExperienceToCV;
import kodlama.io.Hrms.entities.concrete.ForeignLanguageToCV;
import kodlama.io.Hrms.entities.concrete.ImageToCV;
import kodlama.io.Hrms.entities.concrete.Jobseeker;
import kodlama.io.Hrms.entities.concrete.LinkToCV;
import kodlama.io.Hrms.entities.concrete.SchoolToCV;
import kodlama.io.Hrms.entities.concrete.SkillToCV;

public class JobSeekerCVDto {
	public Jobseeker jobskeer;

	public List<ExperienceToCV> experiences;
	public List<ForeignLanguageToCV> foreignLanguage;
	public ImageToCV image;
	public List<LinkToCV> links;
	public List<SchoolToCV> schools;
	public List<SkillToCV> skills;

}
