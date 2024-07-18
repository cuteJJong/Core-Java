package com.example.libs;

public class Car {
    //접근제한자
    public String name = "EF Sonanta";      //어디서든
    protected int price = 30_000_000;       //같은 패키지, 자식클래스
    String color = "Gray";                  //같은 패키지 소속
    private int commition =10_000_000;      //외부 사용X
}
