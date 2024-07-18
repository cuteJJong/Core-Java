
public class SungjukMgmt {

	public static void main(String[] args) {
		int [][] jumsus = {
			{67, 89, 100},
			{77, 99, 56},
			{100, 99, 88}
		};
		for(int i = 0 ; i < jumsus.length ; i++) {			//전체 학생 루프
			int tot = 0;
			for(int j = 0 ; j < jumsus[i].length ; j++) {
			tot += jumsus[i][j];			//각 행 데이터 더하기
			double avg = tot / 3.;
				//삼항 연산자를 쓰는게 깔끔하다.
			char grade = (avg >= 90) ? 'A' : 
										(avg >= 80) ? 'B' :
											(avg >= 70) ? 'C' : 
												(avg > 60) ? 'D' : 'F';
			for ( j = 0 ; j < jumsus[i].length ; j++) {
			System.out.printf("%5d\t", jumsus[i][j]);
			System.out.printf("%5d\t%10.f%5c%n", tot, avg, grade); 
				}
			}
		}
	}

}
