package Num2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

abstract class Shape{
	public Shape() {}
    public abstract String draw();
}

class Line extends Shape{
    @Override
    public String draw() {
        return "Line";
    }
}

class Rect extends Shape{
    @Override
    public String draw() {
        return "Rect";
    }
}

class Circle extends Shape{
    @Override
    public String draw() {
        return "Circle";
    }
}

public class JC19013126E2 {
    public static void main(String[] args) {
        Vector<Shape> vs = new Vector<Shape>();
        Scanner sc = new Scanner(System.in);

        System.out.println("그래픽 에디터 beauty을 실행합니다.");

        while (true) {

            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            int num = sc.nextInt();

            if (num == 1) {

                System.out.print("Line(1), Rect(2), Circle(3) >> ");
                int shape = sc.nextInt();

                if (shape == 1) vs.add(new Line());
                else if (shape == 2) vs.add(new Rect());
                else vs.add(new Circle());

            }

            else if (num == 2) {

                System.out.print("삭제할 도형의 위치 >> ");
                int del = sc.nextInt();

                if (vs.size() == 0 | del >= vs.size()) System.out.println("삭제할 수 없습니다.");
                else vs.remove(del);
                        
            }

            else if (num == 3) {
                Iterator<Shape> it = vs.iterator();
                while (it.hasNext()) {
                    Shape tmp = it.next();
                    System.out.println(tmp.draw());
                }
            }

            else {
                System.out.println("beauty을 종료합니다.");
                break;
            }
        }
    }
}

