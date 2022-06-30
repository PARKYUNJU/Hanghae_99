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
		System.out.print("주유량을 입력하세요: ");
		int oil=scanner.nextInt();
		this.oil=oil;
		if(oil>=10)
		{
			this.run="일반";
		}
		else
			this.run="탑승불가";
	}
	
	public void passenger() {
		if(this.run.equals("일반"))
			{this.run="운행 중"; 
			System.out.println(this.run);}
		else
			System.out.println("탑승 불가");
	}
	
	public void velocity()
    {
    	if(this.run.equals("운행 중")||this.run.equals("일반")) {
    		Scanner scanner=new Scanner(System.in);
    		System.out.println("변경할 속도를 입력하세요: ");
    		int vel=scanner.nextInt();
    		this.velocity=this.velocity+vel;
    		System.out.println("속도"+this.velocity+"km/h로 운행합니다.");
    		
    	}
    	else
    		System.out.println("탑승 불가");
    	
    }
	
	public void price()
	{
		if(this.run.equals("운행 중"))
		{
			System.out.print("거리를 입력하세요: ");
			Scanner scanner=new Scanner(System.in);
			int distance=scanner.nextInt();
			if(distance>basicDistance)
			{
				int total=basicPrice+perPrice;
				System.out.println("요금은 "+total+"입니다.");
			}
			else
				System.out.println("요금은 "+basicPrice+"입니다");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi taxi=new Taxi();
		taxi.run();//운행 여부
		taxi.velocity();//속도 변환
		taxi.passenger();//승객 탑승
		taxi.price();//요금 정산
	}

}
