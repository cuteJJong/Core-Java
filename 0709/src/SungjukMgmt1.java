
public class SungjukMgmt1 {

	public static void main(String[] args) throws java.io.IOException{
		Student [] stdArray = new Student[3];			//앞으로 학생들의 정보가 저장될 공간 확보
 		java.util.Scanner sc = new java.util.Scanner(new java.io.File("sungjuk.dat"));			//scanner 로 file 읽는방법
		for(int i = 0; i < 3 ; i++) {
			stdArray[i] = new Student();		//비로소 여기서 학생 생성
			//System.out.println(sc.nextLine());			//첫번째 줄을 읽기
			String line = sc.nextLine();
			//parsing
			String [] array = line.split("\\s+");			// \t 나누기
			System.out.println(array[2]);
			stdArray[i].hakbun = array[0].trim();		//학번			//trim : 불필요한 공백 제거
			stdArray[i].name = array[1].trim();		//이름
			stdArray[i].kor = Integer.parseInt(array[2].trim());		//국어	parseInt 정수형으로 바꿔주는것		
			stdArray[i].eng = Integer.parseInt(array[3].trim());		//영어
			stdArray[i].math = Integer.parseInt(array[4].trim());	//수학			
		}
		int j = 0;	//초기화
		while( j<3 ) {
			System.out.printf("%10s\t%10s\t%5d\t%5d\t%5d%n", 
											stdArray[j].hakbun, stdArray[j].name,
											stdArray[j].kor, stdArray[j].eng,
											stdArray[j].math);
			j++;
		}
	}
}
