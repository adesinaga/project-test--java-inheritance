package isi;

class ScientificStudent extends Student {
	Math math;
	Teacher teacher;
	boolean interview;

	ScientificStudent(String namaStud, String nis, char gender, Math m) {
		super(namaStud, nis, gender);
		math = m;

	}
	@Override
	public void interview() {
		// TODO Auto-generated method stub
		if(interview) {
			System.out.println("student has interview");
		}
	}

	public Math getMath() {
		return math;
	}

	public void setMath(Math math) {
		this.math = math;
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
