package isi;

class SocialStudent extends Student {
	Economic economicCourse;
	Teacher teacher;
	boolean interview;

	SocialStudent(String namaStud, String nis, char gender, Economic e) {
		super(namaStud, nis, gender);
		economicCourse = e;

	}
	@Override
	public void interview() {
		// TODO Auto-generated method stub
		if(interview) {
			System.out.println("student has interview");
		}
	}
	@Override
	public void presentation() {
		// TODO Auto-generated method stub
		
	}

	public Economic getEconomicCourse() {
		return economicCourse;
	}

	public void setEconomicCourse(Economic economicCourse) {
		this.economicCourse = economicCourse;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public boolean isInterview() {
		return interview;
	}

	public void setInterview(boolean interview) {
		this.interview = interview;
	}

}
