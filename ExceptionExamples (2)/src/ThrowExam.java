
public class ThrowExam {

	public static void arrayMethod() throws ArrayIndexOutOfBoundsException {
		String[] irum = new String[3];
		irum[3] = "홍길동";
	}
	public static void main(String[] args) {
		
		ThrowExam ts = new ThrowExam();
		try { arrayMethod();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외오류발생");
		}
	}
}
