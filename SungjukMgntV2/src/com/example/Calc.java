package com.example;

import java.util.List;

public class Calc {
    private List<StudentVO> list;
    public Calc(List<StudentVO> list) {
        this.list = list; // 생성자는 필드초기화만 해야한다  // 계산은 메소드가 해야징
    }
    void calc() {
        //for( StudentVO std :this.list) {// 각방은 학생으로 만들어져있으니까 나의 배열!!
        this.list.forEach(std ->{;
            int tot = std.getKor() + std.getEng() + std.getMat() + std.getEdp();
            double avg = tot/ 4.;
            char grade = (avg >= 90) ? 'A' :
                    (avg >= 80 ) ? 'B' :
                            (avg >=70 )? 'C':
                                    (avg >=60 )? 'D': 'F';
            std.setTot(tot); std.setAvg(avg); std.setGrade(grade);
        });
    }
}
