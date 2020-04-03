package day14;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankkokTire ����" + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** "+location + "HankkookTire ��ũ ***");
			return false;
		}
	}
}
