import java.util.*;

public class Taxi {
	int taxinum,oil,velocity,basicDistance=10,toDistance,basicPrice=3000,perPrice=2000;
	String place;
	String run;
	Boolean passenger;
	
	public Taxi() {
		// TODO Auto-generated constructor stub
	}
	public void run()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("�������� �Է��ϼ���: ");
		int oil=scanner.nextInt();
		this.oil=oil;
		if(oil>=10)
		{
			this.run="�Ϲ�";
		}
		else
			this.run="ž�ºҰ�";
	}
	
	public void passenger() {
		if(this.run.equals("�Ϲ�"))
			{this.run="���� ��"; 
			System.out.println(this.run);}
		else
			System.out.println("ž�� �Ұ�");
	}
	
	public void velocity()
    {
    	if(this.run.equals("���� ��")||this.run.equals("�Ϲ�")) {
    		Scanner scanner=new Scanner(System.in);
    		System.out.println("������ �ӵ��� �Է��ϼ���: ");
    		int vel=scanner.nextInt();
    		this.velocity=this.velocity+vel;
    		System.out.println("�ӵ�"+this.velocity+"km/h�� �����մϴ�.");
    		
    	}
    	else
    		System.out.println("ž�� �Ұ�");
    	
    }
	
	public void price()
	{
		if(this.run.equals("���� ��"))
		{
			System.out.print("�Ÿ��� �Է��ϼ���: ");
			Scanner scanner=new Scanner(System.in);
			int distance=scanner.nextInt();
			if(distance>basicDistance)
			{
				int total=basicPrice+perPrice;
				System.out.println("����� "+total+"�Դϴ�.");
			}
			else
				System.out.println("����� "+basicPrice+"�Դϴ�");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi taxi=new Taxi();
		taxi.run();//���� ����
		taxi.velocity();//�ӵ� ��ȯ
		taxi.passenger();//�°� ž��
		taxi.price();//��� ����
	}

}
