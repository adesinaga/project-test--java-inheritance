package isi;

public class Course {
	int kdjurusan;
	String nmjurusan;
	
	Course(int kdjurusan , String nmjurusan){
		this.kdjurusan = kdjurusan;
		this.nmjurusan=nmjurusan;
	}

	public int getKdjurusan() {
		return kdjurusan;
	}

	public void setKdjurusan(int kdjurusan) {
		this.kdjurusan = kdjurusan;
	}

	public String getNmjurusan() {
		return nmjurusan;
	}

	public void setNmjurusan(String nmjurusan) {
		this.nmjurusan = nmjurusan;
	}
	
}
