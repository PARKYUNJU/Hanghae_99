import java.util.*;

public class Bus {
    int MaxPassenger=30, NowPassenger=0, price=1250, Busnum, oil,velocity;
    Boolean run; //�� ó�� ���� : ����(1), ��������(0)

    public Bus(int num,int oil) //���� ���� ��ȣ
    {
        this.Busnum=num;
        this.oil=oil;
        System.out.println("���� ��ȣ�� "+this.Busnum+" �������� "+this.oil+"�Դϴ�.");
        
    }
    
    public boolean run()
    {
    	this.run=true;
    	Scanner scanner=new Scanner(System.in);
    	System.out.print("�������� �Է��ϼ���: ");
    	this.oil=scanner.nextInt();
    	if(this.oil<10){
        	System.out.println("������ �ʿ��մϴ�.");
        	this.run=false;
        }
        else{
        	System.out.println("������ �����մϴ�");
        }
    	return run;
    }
    
    
    public void passenger()
    {
    	if(this.run=true) {
    		Scanner scanner=new Scanner(System.in);
    		System.out.print("ž�� �°� ���� �Է��ϼ���: ");
    		int passenger=scanner.nextInt();
    		if(NowPassenger>=MaxPassenger){
        		System.out.println("�����Դϴ�.");
        	}
        	else{
        		this.NowPassenger=NowPassenger+passenger;
        		System.out.println("���� �°� ���� "+this.NowPassenger+"�Դϴ�.");
        	}
    		
    	}
    	else
    		System.out.println("�������� �ʴ� �����Դϴ�.");
    	
    }
    
    public void velocity()
    {
    	if(this.run=true) {
    		Scanner scanner=new Scanner(System.in);
    		System.out.println("������ �ӵ��� �Է��ϼ���: ");
    		int vel=scanner.nextInt();
    		this.velocity=this.velocity+vel;
    		System.out.println("�ӵ�"+this.velocity+"km/h�� �����մϴ�.");
    		
    	}
    	else
    		System.out.println("�������� �ʴ� �����Դϴ�.");
    	
    }


public static void main(String[] args)
{
	Bus bus=new Bus(937,30);
	bus.run();
	bus.velocity();
	bus.passenger();
	
}
}
