package isi;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  Sc = new Scanner(System.in);
		ArrayList<Teacher> teacherList = new ArrayList<>();
		ArrayList<ScientificStudent> scienceStudentList = new ArrayList<>();
		ArrayList<SocialStudent> socialStudentList = new ArrayList<>();
		ArrayList<Class> classList = new ArrayList<>();
		ArrayList<Course> courseList = new ArrayList<>();
		Math m = new Math(1, "Science");
		Economic e = new Economic(3, "Social");
		int input;
		try {
			for(int i = 0; ;i++) {
				System.out.println("1. tambah teacher");
				System.out.println("2. tambah student");
				System.out.println("3. tambah class");
				System.out.println("4. read student");
				System.out.println("5. read teacher");
				System.out.println("6. read class");
				System.out.println("7. tambah teacher dan student ke class");
				System.out.println("8. set exam");
				System.out.println("9. set exercise");
				System.out.println("10.set interview");
				System.out.println("11.set presentation");
				System.out.println("99.Exit");
				input = Sc.nextInt();
				Sc.nextLine();
				
				switch (input) {
				case 1 :
					System.out.println("Masukkan nama Guru : ");
					String namaTeacher = Sc.nextLine();
					System.out.println("Masukkan NIP : ");
					String nip = Sc.nextLine();
					Teacher t = new Teacher(namaTeacher, nip);
					teacherList.add(t);
					
					System.out.println("Nama Guru : " +namaTeacher);
					System.out.println("NIP : " +nip);
					break;
				case 2 :
					boolean emptyClass = false;
					boolean emptyTeacher = false;
					if(classList.size()==0) {
						emptyClass = true;
					}
					if(teacherList.size()==0) {
						emptyTeacher = true;
					}
					
					if(!emptyClass && !emptyTeacher) {
						System.out.print("Masukkan nama siswa : ");
						String namaStud = Sc.nextLine();
						System.out.print("Masukkan NIS : ");
						String nis = Sc.next();
						System.out.println();
						System.out.println("Pilih Gender : ");
						System.out.println("1. Laki-laki");
						System.out.println("2. Perempuan");
						int inGender = Sc.nextInt();
						Sc.nextLine();
						char gender = '1';
						if(inGender == 1) {
							gender = 'L';
						}else {
							gender = 'P';
						}
						
						System.out.println("Pilih Jurusan : ");
						System.out.println("1. Scince");
						System.out.println("2. Social");
						int in2 = Sc.nextInt();
						Sc.nextLine();
						boolean science;
						if(in2 == 1) {
							scienceStudentList.add(new ScientificStudent(namaStud, nis, gender, m));
							
						}else if(in2 == 2) {
							socialStudentList.add(new SocialStudent(namaStud, nis,gender, e));
						}
						
						System.out.println("Nama Siswa : " +namaStud);
						System.out.println("NIS :" +nis);
						System.out.println("Jenis kelamin  :" +inGender);
						System.out.println("Jurusan : " +in2);
						System.out.println();
					}else {
						System.out.println("Tambahkan kelas dan guru terlebih dahulu");
					}
					
					break;
					
				case 3 :
					System.out.print("Masukan kode kelas : ");
					String kdkelas = Sc.next();
					System.out.print("Masukkan jenis kelas : ");
					System.out.println("1. science");
					System.out.println("2. social");
					String jenis = Sc.next();
					String nmkelas;
					
					if(jenis.equalsIgnoreCase("1")) {
						nmkelas = "science";
					}else {
						nmkelas = "social";
					}
					classList.add(new Class(kdkelas, nmkelas));
					
					System.out.println("kode kelas : " +kdkelas);
					System.out.println("Jenis kelas : " +nmkelas);
					break;
				case 4:
					System.out.println("SCIENCE");
					for (int j = 0; j < scienceStudentList.size(); j++) {
						System.out.println(scienceStudentList.get(j).getNamaStud());
						System.out.println(scienceStudentList.get(j).getNis());
						System.out.println(scienceStudentList.get(j).getGender());
					}
					
					System.out.println("SOCIAL");
					for (int j = 0; j < socialStudentList.size(); j++) {
						System.out.println(socialStudentList.get(j).getNamaStud());
						System.out.println(socialStudentList.get(j).getNis());
						System.out.println(socialStudentList.get(j).getGender());
					}
					break;
				case 5:
					for(int x = 0; x<teacherList.size(); x++) {
						System.out.println("NIK : "+teacherList.get(x).getNip());
						System.out.println("Nama Guru : "+teacherList.get(x).getNamaTeacher());
					}
					break;
				case 6:
					for (int j = 0; j < classList.size(); j++) {
						System.out.println("Kelas : "+classList.get(j).getKodekelas());
						System.out.println("Jenis kelas : "+classList.get(j).getNamakelas());
						if(classList.get(j).getNamakelas().equalsIgnoreCase("science")) {
							System.out.println("Kode Mata Pelajaran : "+scienceStudentList.get(0).getMath().getKdjurusan());
							System.out.println("Mata Pelajaran : "+scienceStudentList.get(0).getMath().getNmjurusan());
						}else {
							System.out.println("Kode Mata Pelajaran : "+socialStudentList.get(0).getEconomicCourse().getKdjurusan());
							System.out.println("Mata Pelajaran : "+socialStudentList.get(0).getEconomicCourse().getNmjurusan());
						}
						if(classList.get(j).getTeacher()!=null) {
							System.out.println("Pengajar : "+classList.get(j).getTeacher().getNamaTeacher());
							for (int k = 0; k < classList.get(j).getStudentCount(); k++) {
								System.out.println("Nama siswa : "+classList.get(j).getStudent().get(k).getNamaStud());
								System.out.println("NIS : "+classList.get(j).getStudent().get(k).getNis());
								classList.get(j).getStudent().get(k).exam();
								classList.get(j).getStudent().get(k).presentation();
								classList.get(j).getStudent().get(k).interview();;
								classList.get(j).getStudent().get(k).exercise();
							}
						}
					}
					break;
					
				case 7:
					System.out.print("Pilih class : ");
					for (int j = 0; j < classList.size(); j++) {
						System.out.println(j+". "+classList.get(j).getKodekelas());
					}
					int chooseClass = Sc.nextInt();
					String classcourse = classList.get(chooseClass).getNamakelas();
					
					System.out.println("Pilih Guru yang ingin dimasukkan : ");
					for (int j = 0; j < teacherList.size(); j++) {
						System.out.println(j+". "+teacherList.get(j).getNamaTeacher());
					}
					int chooseTeacher = Sc.nextInt();

					System.out.println("Pilih Siswa yang ingin ditambahkan  : ");
					if(classcourse.equalsIgnoreCase("science")) {
						for (int j = 0; j < scienceStudentList.size(); j++) {
							System.out.println(j+". "+scienceStudentList.get(j).getNamaStud());
						}
						classList.get(chooseClass).setTeacher(teacherList.get(chooseTeacher));
						classList.get(chooseClass).setStudent(scienceStudentList.get(Sc.nextInt()));
					}else {
						for (int j = 0; j < socialStudentList.size(); j++) {
							System.out.println(j+". "+socialStudentList.get(j).getNamaStud());
						}
						classList.get(chooseClass).setTeacher(teacherList.get(chooseTeacher));
						classList.get(chooseClass).setStudent(scienceStudentList.get(Sc.nextInt()));
					}
					Sc.nextLine();
					break;
				case 8 :
					for (int j = 0; j < scienceStudentList.size(); j++) {
						scienceStudentList.get(j).setExam(true);
					}
					for (int j = 0; j < socialStudentList.size(); j++) {
						socialStudentList.get(j).setExam(true);
					}
					break;
				case 9:
					for (int j = 0; j < scienceStudentList.size(); j++) {
						scienceStudentList.get(j).setExercise(true);
					}
					for (int j = 0; j < socialStudentList.size(); j++) {
						socialStudentList.get(j).setExercise(true);;
					}
					break;
				case 10:
					for (int j = 0; j < scienceStudentList.size(); j++) {
						scienceStudentList.get(j).setPresentation(true);
					}
					for (int j = 0; j < socialStudentList.size(); j++) {
						socialStudentList.get(j).setPresentation(true);;
					}
					break;
				case 11:
					for (int j = 0; j < scienceStudentList.size(); j++) {
						scienceStudentList.get(j).setInterview(true);;
					}
					for (int j = 0; j < socialStudentList.size(); j++) {
						socialStudentList.get(j).setInterview(true);
					}
					break;
				case 99:
					System.exit(1);
					break;
				default:
					break;
				}
			}
		} catch (Exception ex) {
			// TODO: handle exception
			System.out.println("Masukan salah");
			ex.printStackTrace();
		}
	}

}

		


