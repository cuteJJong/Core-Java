
public class ForDemo {

	public static void main(String[] args) {
		// 'A' --> 65 encoding
		// '65' --> A decoding
//		A B C D E
//		F G  H  I J
//		K L M N O 
//		P Q R S T
//		U V W X  Y 
//		Z
		int count =  0, line = 1;
//		for(int i = 65 ; i <= 90 ; i++) {
//			//System.out.printf("%c\t", (char)i);
//			if(line % 2 ==0)
//			//System.out.printf("%c\t", (char)(i + 32));			//소문자 출력
//			System.out.print((char)(i + 32) + "\t");
//			else 
//			//System.out.printf("%c\t", (char)(i));			//대문자 출력
//			System.out.print((char)(i) + "\t");
//			count++;
//			if(count % 5 == 0); {
//				System.out.println();
//				line++;
//			}
			int i = 65;
			while( i <= 90 ) {
				//System.out.printf("%c\t", (char)i);
				if(line % 2 ==0) {
				//System.out.printf("%c\t", (char)(i + 32));			//소문자 출력
				System.out.print((char)(i + 32) + "\t");
				}
				else {
				//System.out.printf("%c\t", (char)(i));			//대문자 출력
				System.out.print((char)(i) + "\t");
				count++;
				}
				if(count % 5 == 0); {
					System.out.println();
					line++;
				}
				i++;
		}
	}

}
