package ac.scggi.app.reference;

public class Student {
	public String name;
	public String address;
	public int kor;
	public int eng;
	public int math;
	
	public Student(String name, String address, int kor, int eng, int math) {
		this.name = name;
		this.address = address;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void showInfo() {
		System.out.println("�̸� "+name);
		System.out.println("�ּ� "+address);
		System.out.println("�������� "+kor);
		System.out.println("�������� "+eng);
		System.out.println("�������� "+math);
		System.out.println("���� "+(kor+eng+math));
	}
}