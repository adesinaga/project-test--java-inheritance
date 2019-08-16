package isi;

abstract class Student implements Activity {
	String namaStud;
	String nis;
	char gender;
	
	boolean exam;
	boolean exercise;
	boolean presentation;

	Student(String namaStud, String nis,  char gender) {
		this.namaStud = namaStud;
		this.nis = nis;
		this.gender = gender;
	}

	
	public String getNamaStud() {
		return namaStud;
	}


	public void setNamaStud(String namaStud) {
		this.namaStud = namaStud;
	}


	public String getNis() {
		return nis;
	}


	public void setNis(String nis) {
		this.nis = nis;
	}


	


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	@Override
	public void exam() {
		// TODO Auto-generated method stub
		if(exam) {
			System.out.println("Student has exam");
		}
	}

	@Override
	public void exercise() {
		// TODO Auto-generated method stub
		if(exercise) {
			System.out.println("Student has exercise");
		}
	}
	

	@Override
	public void presentation() {
		// TODO Auto-generated method stub
		if(presentation) {
			System.out.println("Student has presentation");
		}
	}

	public boolean isExam() {
		return exam;
	}

	public void setExam(boolean exam) {
		this.exam = exam;
	}

	public boolean isExercise() {
		return exercise;
	}

	public void setExercise(boolean exercise) {
		this.exercise = exercise;
	}

	public boolean isPresentation() {
		return presentation;
	}

	public void setPresentation(boolean presentation) {
		this.presentation = presentation;
	}
	
}
