import java.util.*;

public class Bus {
    int MaxPassenger=30, NowPassenger=0, price=1250, Busnum, oil,velocity;
    Boolean run; //맨 처음 상태 : 운행(1), 차고지행(0)

    public Bus(int num,int oil) //버스 고유 번호
    {
        this.Busnum=num;
        this.oil=oil;
        System.out.println("버스 번호는 "+this.Busnum+" 주유량은 "+this.oil+"입니다.");
        
    }
    
    public boolean run()
    {
    	this.run=true;
    	Scanner scanner=new Scanner(System.in);
    	System.out.print("주유량을 입력하세요: ");
    	this.oil=scanner.nextInt();
    	if(this.oil<10){
        	System.out.println("주유가 필요합니다.");
        	this.run=false;
        }
        else{
        	System.out.println("운행을 시작합니다");
        }
    	return run;
    }
    
    
    public void passenger()
    {
    	if(this.run=true) {
    		Scanner scanner=new Scanner(System.in);
    		System.out.print("탑승 승객 수를 입력하세요: ");
    		int passenger=scanner.nextInt();
    		if(NowPassenger>=MaxPassenger){
        		System.out.println("만석입니다.");
        	}
        	else{
        		this.NowPassenger=NowPassenger+passenger;
        		System.out.println("현재 승객 수는 "+this.NowPassenger+"입니다.");
        	}
    		
    	}
    	else
    		System.out.println("운행하지 않는 버스입니다.");
    	
    }
    
    public void velocity()
    {
    	if(this.run=true) {
    		Scanner scanner=new Scanner(System.in);
    		System.out.println("변경할 속도를 입력하세요: ");
    		int vel=scanner.nextInt();
    		this.velocity=this.velocity+vel;
    		System.out.println("속도"+this.velocity+"km/h로 운행합니다.");
    		
    	}
    	else
    		System.out.println("운행하지 않는 버스입니다.");
    	
    }


public static void main(String[] args)
{
	Bus bus=new Bus(937,30);
	bus.run();
	bus.velocity();
	bus.passenger();
	
}
}
