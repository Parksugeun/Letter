import java.util.Scanner;

public class IfEx01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ݾ��Է�=");
		int money = scan.nextInt();
	
		if(money>=10000) {
				int r = money/10*10;
				System.out.println("r="+ r);
		}
		
	}

}
/*
if�� ����ϱ�
�Է¹��� ���� 10000�̻��� ���� �������ڸ� ���� 0���� �ٲ㼭 ����϶�.

����
�ݾ��Է� = 26315
��� = 26310

�ݾ��Է� = 568259
��� = 568250
*/