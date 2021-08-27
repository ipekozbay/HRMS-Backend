package kodlama.io.Hrms.entities.dtos;

import java.util.List;

import kodlama.io.Hrms.entities.concretes.ExperienceToCV;
import kodlama.io.Hrms.entities.concretes.ForeignLanguageToCV;
import kodlama.io.Hrms.entities.concretes.ImageToCV;
import kodlama.io.Hrms.entities.concretes.Jobseeker;
import kodlama.io.Hrms.entities.concretes.LinkToCV;
import kodlama.io.Hrms.entities.concretes.SchoolToCV;
import kodlama.io.Hrms.entities.concretes.SkillToCV;

public class JobSeekerCVDto {
	public Jobseeker jobskeer;
	public List<ExperienceToCV> experiences;
	public List<ForeignLanguageToCV> foreignLanguage;
	public ImageToCV image;
	public List<LinkToCV> links;
	public List<SchoolToCV> schools;
	public List<SkillToCV> skills;

}
