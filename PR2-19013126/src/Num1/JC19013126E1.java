package Num1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Location {
    private String city;    // 도시
    private int longtitude; // 경도
    private int latitude;   // 위도


    public Location(String city, int longtitude, int latitude) {
        this.city = city;
        this.longtitude = longtitude;
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return city + " " + longtitude+ " " + latitude ;
    }
}

public class JC19013126E1 {

    public static void main(String[] args) {
        HashMap<String, Location> map = new HashMap<String, Location>();
        Scanner sc = new Scanner(System.in);

        System.out.println("도시, 경도, 위도를 입력하세요");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String str = sc.nextLine();
            String s[] = str.split(", ");

            String city = s[0];                   // 도시
            int ln = Integer.parseInt(s[1]);      // 경도
            int la = Integer.parseInt(s[2]);      // 위도

            Location tmp = new Location(city, ln, la);
            map.put(city, tmp);
        }
        System.out.println("-----------------------------------");

        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();

        while(it.hasNext()) {
            String city = it.next();
            Location tmp = map.get(city);
            System.out.println(tmp);
        }
        System.out.println("-----------------------------------");

        while (true) {
            System.out.print("도시 이름 >> ");
            String city = sc.nextLine();

            if (city.equals("그만")) break;

            Location tmp = map.get(city);
            if (tmp == null) System.out.println(city + "는 없습니다.");
            else System.out.println(tmp);
        }

    }

}

