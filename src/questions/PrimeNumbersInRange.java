package questions;

public class PrimeNumbersInRange {

	public static void main(String[] args) {

		// 20 to 50

//		int low = 1;
//		int high = 50;
//
//		while (low < high) {
//
//			boolean flag = false;
//
//			for (int i = 2; i <= low / 2; i++) {
//				if (low % i == 0) {
//					flag = true;
//					break;
//				}
//			}
//
//			if (!flag) {
//				System.out.println(low + " ");
//			}
//
//			low++;
//		}
		
		primeNumbers(1, 10);

	}

	public static void primeNumbers(int low, int high) {

		while (low < high) {

			boolean flag = false;

			for (int i = 2; i <= low / 2; i++) {
				if (low % i == 0) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				System.out.println(low + " ");
			}

			low++;
		}

	}

}
