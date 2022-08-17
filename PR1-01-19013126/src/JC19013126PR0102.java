import java.util.Scanner;

class Phone {
	String name, tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
}

public class JC19013126PR0102 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Phone[] phone;
		
		System.out.print("인원수>>");
		int n = scanner.nextInt();
		phone = new Phone[n]; // n명의 전화번호부 생성
		
		for	(int i = 0; i < phone.length ; i++) {
				System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
				String name = scanner.next();
				String tel = scanner.next();
				
				phone[i] = new Phone(name, tel);
			}
		
		
		while(true) {
			int i, flag = -1;
			
			System.out.print("검색할 이름>>");
			String search = scanner.next();
			if (search.equals("그만")) return;
			
			for	(i = 0; i < phone.length; i++) {	
				if (search.equals(phone[i].name)) {
					flag = i;
					break;
				}
			}
			
			if (flag == -1) {
				System.out.println(search + " 이 없습니다.");
			} else {
				System.out.println(phone[flag].name + "의 번호는 " + phone[flag].tel + " 입니다.");
			}
		}
			
	}
}
