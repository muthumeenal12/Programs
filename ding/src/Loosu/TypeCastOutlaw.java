
public class TypeCastOutlaw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v =20.85d;
		float b =20.85f;
		System.out.println(b==v);//false
		//(double) b= 0.850000381469727
		
		//Again 
		double a = 20.75d;
		float u = 20.75f;
		System.out.println(a==u);//true, why?
		//(double) u = 20.75
		
		//Try another test case
		double c = 20.45d;
		float p=20.45f;
		System.out.println(c==p);//false...
		//(double) p = 20.4500007629453

	}

}
