
public class VariableDemo1 {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("국어 점수 : ");		//"80"
		String kor = sc.nextLine();
		int ko = Integer.parseInt(kor);
		System.out.print("수학점수 점수 : ");		//"70"
		String math = sc.nextLine();
		int mat = Integer.parseInt(math);
		System.out.println(ko + mat);
	
	}

}
