package org.example.ch06.sec12.hyundai;

//import 문으로 다른 패키지 클래스 사용을 명시
import org.example.ch06.sec12.hankook.SnowTire;
import org.example.ch06.sec12.kumho.AllSeasonTire;
import org.example.ch06.sec12.kumho.Tire;

public class Car {
	//부품 필드 선언
	Tire tire1 = new Tire();
	Tire tire2 = new Tire();
	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4 = new AllSeasonTire();
}


