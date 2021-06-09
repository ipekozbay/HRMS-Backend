package kodlama.io.Hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.ExperienceToCVService;
import kodlama.io.Hrms.business.abstracts.ImageToCVService;
import kodlama.io.Hrms.business.abstracts.JobseekerService;
import kodlama.io.Hrms.business.abstracts.LinkToCVService;
import kodlama.io.Hrms.business.abstracts.SchoolToCVService;
import kodlama.io.Hrms.business.abstracts.SkillToCVService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.JobSeekerDao;
import kodlama.io.Hrms.entities.concrete.ForeignLanguageToCV;
import kodlama.io.Hrms.entities.concrete.Jobseeker;
import kodlama.io.Hrms.entities.dtos.JobSeekerCVDto;

@Service
public class JobseekerManager implements JobseekerService {

	private JobSeekerDao jobseekerDao;
	private ExperienceToCVService experienceToCVService;
	private ForeignLanguageToCV foreignLanguageToCVService;
	private ImageToCVService imageToCVService;
	private LinkToCVService linkToCVService;
	private SkillToCVService skillToCVService;
	private SchoolToCVService schoolToCVService;

	@Autowired
	public JobseekerManager(JobSeekerDao jobseekerDao, ExperienceToCVService experienceToCVService,
			ForeignLanguageToCV foreignLanguageToCVService, ImageToCVService imageToCVService,
			LinkToCVService linkToCVService, SkillToCVService skillToCVService, SchoolToCVService schoolToCVService) {
		super();
		this.jobseekerDao = jobseekerDao;
		this.experienceToCVService = experienceToCVService;
		this.foreignLanguageToCVService = foreignLanguageToCVService;
		this.imageToCVService = imageToCVService;
		this.linkToCVService = linkToCVService;
		this.skillToCVService = skillToCVService;
		this.schoolToCVService = schoolToCVService;
	}

	@Override
	public Result add(Jobseeker jobseeker) {
		this.jobseekerDao.save(jobseeker);
		return new SuccessResult("Jobseeker added.");
	}

	@Override
	public Result update(Jobseeker jobseeker) {
		this.jobseekerDao.save(jobseeker);
		return new SuccessResult("Jobseeker has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.jobseekerDao.deleteById(id);
		return new SuccessResult("Jobseeker has been deleted.");
	}

	@Override
	public DataResult<Jobseeker> getById(int id) {
		return new SuccessDataResult<Jobseeker>(this.jobseekerDao.getById(id));
	}

	@Override
	public DataResult<List<Jobseeker>> getAll() {
		return new SuccessDataResult<List<Jobseeker>>(this.jobseekerDao.findAll());
	}

	@Override
	public DataResult<Jobseeker> getJobseekerByNationalId(String nationalId) {
		return new SuccessDataResult<Jobseeker>(this.jobseekerDao.findJobseekerByNationalityId(nationalId));
	}

	@Override
	public DataResult<JobSeekerCVDto> getJobseekerCVById(int id) {
		Jobseeker jobseeker = this.jobseekerDao.getById(id);
		JobSeekerCVDto cv = new JobSeekerCVDto();
		cv.experiences = jobseeker.getExperiences();
		cv.foreignLanguage = jobseeker.getForeignLanguages();
		cv.image = jobseeker.getImage();
		cv.links = jobseeker.getLinks();
		cv.skills = jobseeker.getSkills();
		cv.schools = jobseeker.getSchools();

		return new SuccessDataResult<JobSeekerCVDto>(cv);
	}

}
