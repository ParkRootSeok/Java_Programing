package Num1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Location {
    private String city;    // ����
    private int longtitude; // �浵
    private int latitude;   // ����


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

        System.out.println("����, �浵, ������ �Է��ϼ���");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String str = sc.nextLine();
            String s[] = str.split(", ");

            String city = s[0];                   // ����
            int ln = Integer.parseInt(s[1]);      // �浵
            int la = Integer.parseInt(s[2]);      // ����

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
            System.out.print("���� �̸� >> ");
            String city = sc.nextLine();

            if (city.equals("�׸�")) break;

            Location tmp = map.get(city);
            if (tmp == null) System.out.println(city + "�� �����ϴ�.");
            else System.out.println(tmp);
        }

    }

}

