import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Exception;
//import java.util.Exception;


public class Eksepsyon{
	Scanner sc = new Scanner(System.in);
	//TES POU OPSYON NAN MENI AN
	/*
	public void int oppss()
	{
		System.out.println(" Fe chwa yon opsyon silvoupleee");
		int y = 0;
		try{
			y = sc.nextInt();
			System.out.println("valea bon");
		}catch(InputMismatchException e)
		{
			System.out.println("valea pabon");
			System.out.println("vale saa pa nan opsyon an svp fe yon lot chwa");
			oppss();
			sc.next();
		}
		return y;
	}
	*/
	//TES POU OPSYON NAN MENI AN 2
	public int oppss(){
		int y = 0;
		while(true){
			System.out.print(" Fe chwa yon opsyon silvoupleee:");
			try{
				y = sc.nextInt();
				break;
			}catch(Exception e){
				System.out.println("valea pabon");
				System.out.println("ou dwe antrel ankoo");
				sc.next();
			}
		}
		return y;
	}
	
	
	// POU VALE DOUBLE YO
	public double valeurDouble()
	{
		double z = 0;
		while(true){
		System.out.print("antre valea: ");
		try{
			z = sc.nextDouble();
			break;
		}catch(InputMismatchException e)
		{
			System.out.println("le type de donnee n'est pas bon");
			sc.next();
		}
		
		}
		/*
			boolean tes = true;
			while(tes)
			{
				try{
					z = sc.nextDouble()
				}catch(Exception e)
				{
					System.out.println("le type de donnee n'est pas bon");
					test = true;
				}
			}
		
		*/
		
		return z;
	}
}