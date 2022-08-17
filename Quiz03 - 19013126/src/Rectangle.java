
public class Rectangle {
	private int x1, x2, y1, y2;

	Rectangle() {
		x1 = x2 = y1 = y2 = 0;
	}

	Rectangle(int xx1, int yy1, int xx2, int yy2) {
		this.x1 = xx1;
		this.x2 = xx2;
		this.y1 = yy1;
		this.y2 = yy2;
	}

	public void set(int xx1, int yy1, int xx2, int yy2) {
		this.x1 = xx1;
		this.x2 = xx2;
		this.y1 = yy1;
		this.y2 = yy2;
	}

	public int square() {
		int size = (x1-x2) * (y1-y2); // ���� ���
		if (size <0)
			size = -size; // ������ ������ ��� ����� ����� ��
		return size;
	}

	public void show() {
		System.out.printf("(x1, y1) = (%d, %d) / ", this.x1, this.y1);
		System.out.printf("(x2, y2) = (%d, %d) / ", this.x2, this.y2);
		System.out.println("������� ���� = " + this.square());
	}


	public boolean equals(Rectangle x) {
		int width1 = (x.x1>x.x2?(x.x1-x.x2):x.x2-x.x1); // x�� ���� ����
		int width2 = (x1>x2?(x1-x2):(x2-x1)); // this�� ���� ����
		int height1 = (x.y1>x.y2?(x.y1-x.y2):(x.y2-x.y1)); // x�� ���� ����
		int height2 = (y1>y2?(y1-y2):(y2-y1)); // this�� ���� ����

		if (width1 == width2 & height1 == height2) {
			return true;
		} else {
			return false;
		}
	}

}
