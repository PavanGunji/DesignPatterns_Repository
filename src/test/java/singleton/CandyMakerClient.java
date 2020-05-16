package singleton;

public class CandyMakerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CandyMaker cmobj1 = CandyMaker.getInstance();
		System.out.println(cmobj1+" is the first object addresss");
		cmobj1.fill();
		cmobj1.boil();
		cmobj1.drain();
		
		CandyMaker cmobj2 = CandyMaker.getInstance();
		System.out.println(cmobj2+" is the second object address");
		cmobj2.fill();
		cmobj2.boil();
		cmobj2.drain();
		
	}

}
