import java.util.Scanner;

public class Operation1{
	private double a = 0;
	private double b = 0; 
	
	Scanner sc = new Scanner (System.in);
	//pou adisyon
	public double adisyon(double a, double b){
		this.a = a;
		this.b = b;
		System.out.println(a+" + "+b+" = ?");
		return a+b;
	}
	
	public double soustraksyon(double a, double b){
		this.a = a;
		this.b = b;
		System.out.println(a+" - "+b+" = ?");
		return a-b;
	}
	
	public double miltiplikasyon(double a, double b){
		this.a = a;
		this.b = b;
		System.out.println(a+" * "+b+" = ?");
		return a*b;
	}
	
	public double divizyon(double a, double b){
		this.a = a;
		this.b = b;
		System.out.println(a+" / "+b+" = ?");
		return a/b;
	}
	
}