package sec01_finalmodifier.EX01;

class A1{
	int a=3;
	final int b=5;
	A1(){}
}

class A2{
	int a;
	final int b;
	A2(){a=3;b=5;}//직접 초기화 해주지 않으면 생성자에서 오류남. 무조건 설정해주고 가야함.
}

class A3{
	int a=3;
	final int b=5;
	A3(){a=3;
	//b=5;오류 더 정확한 것은, 최초 선언 이후 값 대입이 불가능(값이 달라지는게 중요한게 아님)
	}
}

class B{
	void bcd() {
		int a =3;
		final int b =5;//지역변수
				a=7;
				//b=9; 지역변수던 필드던 final이 붙은 상태에서 변동은 다 오류
	}
	
}

public class FinalModifier_1 {
public static void main(String[] args) {
	A1 a1=new A1();
	a1.a=7;
	//a1.b=9; 오류
	
	A2 a2=new A2();
	a2.a=7;
	//a2.b=9; 오류
	
	
	
}
}
