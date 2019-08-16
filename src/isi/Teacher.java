package isi;

public class Teacher {
	String namaTeacher;
	String nip;

	Teacher(String namaTeacher, String nip) {
		this.namaTeacher = namaTeacher;
		this.nip = nip;
		
	}

	public String getNamaTeacher() {
		return namaTeacher;
	}

	public void setNamaTeacher(String namaTeacher) {
		this.namaTeacher = namaTeacher;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

}
