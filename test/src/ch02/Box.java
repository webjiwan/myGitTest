package ch02;

public class Box {
	//가로=10.0, 세로=5.0
	//넓이 : 가로 x 세로

	public static void main(String[] args) {
		double width; // 가로
		double hight; // 세로
		double area;  // 넓이
		double perimeter;//둘레값
		width = 10.0; //값을 초기화 할당
		hight = 5.0;
		area = width * hight; //넓이
		System.out.println("사각형의 넓이 : " + area);
		perimeter = 2.0*(width + hight);
		System.out.println("사각형의 둘레 : " + perimeter);
		//여기서의 + 기호는 연결 연산자

	}

}
