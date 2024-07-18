
public class Test {

	public static void main(String[] args) {
        int i = 65; // 'A'의 ASCII 값
        int count = 0; // 5개마다 줄바꿈을 위한 카운터
        int line = 0; // 줄 번호
        
        while (i <= 90) { // 'Z'의 ASCII 값까지
            // 현재 줄이 짝수인지 홀수인지 확인
            if (line % 2 == 0) {
                // 소문자 출력
                System.out.print((char)(i + 32) + "\t");
            } else {
                // 대문자 출력
                System.out.print((char)i + "\t");
            }
            
            count++;
            if (count % 5 == 0) {
                System.out.println(); // 5개마다 줄바꿈
                line++; // 줄 번호 증가
            }
            
            i++;
        }
		
	}
}
