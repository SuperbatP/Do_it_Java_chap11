package sec01_finalmodifier.EX02;

class A{
	void abd(){}
	final void bcd(){}
}

class B extends A{
	void abc() {}
//	void bcd() {} //오버라이딩 불가
}

final class C{}
//class D extends C{}//final class는 상속 불가. 오류


public class FinalModifier_2 {

}
