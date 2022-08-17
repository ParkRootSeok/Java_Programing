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
		
		System.out.print("�ο���>>");
		int n = scanner.nextInt();
		phone = new Phone[n]; // n���� ��ȭ��ȣ�� ����
		
		for	(int i = 0; i < phone.length ; i++) {
				System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
				String name = scanner.next();
				String tel = scanner.next();
				
				phone[i] = new Phone(name, tel);
			}
		
		
		while(true) {
			int i, flag = -1;
			
			System.out.print("�˻��� �̸�>>");
			String search = scanner.next();
			if (search.equals("�׸�")) return;
			
			for	(i = 0; i < phone.length; i++) {	
				if (search.equals(phone[i].name)) {
					flag = i;
					break;
				}
			}
			
			if (flag == -1) {
				System.out.println(search + " �� �����ϴ�.");
			} else {
				System.out.println(phone[flag].name + "�� ��ȣ�� " + phone[flag].tel + " �Դϴ�.");
			}
		}
			
	}
}
