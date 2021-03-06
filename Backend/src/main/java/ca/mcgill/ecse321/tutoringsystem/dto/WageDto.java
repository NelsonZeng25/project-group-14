package ca.mcgill.ecse321.tutoringsystem.dto;

public class WageDto {
	private Integer wage;
	private Integer wageId;
	private String courseName;
	private String tutorName;

	public WageDto() {

	}

	public WageDto(Integer wageId) {
		this(null, wageId);
	}

	public WageDto(Integer wage, Integer wageId) {
		this.wage = wage;
		this.wageId = wageId;
	}

	public WageDto(Integer wage, Integer wageId, String courseName, String tutorName) {
		this.wage = wage;
		this.wageId = wageId;
		this.courseName = courseName;
		this.tutorName = tutorName;
	}

	public Integer getWage() {
		return wage;
	}

	public void setWage(Integer wage) {
		this.wage = wage;
	}

	public Integer getWageId() {
		return wageId;
	}

	public void setWageId(Integer wageId) {
		this.wageId = wageId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getTutorName() {
		return tutorName;
	}

	public void setTutorName(String tutorName) {
		this.tutorName = tutorName;
	}

}
