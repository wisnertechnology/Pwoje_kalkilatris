import java.util.Scanner;


public class Menuproj1{
	Scanner letter = new Scanner(System.in);
	public void affichageMenu(){
		String choice;
		
		do{
		System.out.println("\t\t\t BYENVINI NAN TI PWOGRAM KALKILATRIS KREYOL SAA\n\n");
		Scanner number = new Scanner (System.in);
		System.out.println("peze touch 1 an pou fe adisyon de vale");
		System.out.println("peze touch 2 an pou fe soustraksyon de vale");
		System.out.println("peze touch 3 an pou fe miltiplikasyon de vale");
		System.out.println("peze touch 4 an pou fe divizyon de vale");
		System.out.println("\n\n=======================================================================================\n\n");
		
			// nap eseye trete vale moun nan ap rantre a paske li kapab leve yon eksepsyon
		int option =0;	
		
		//System.out.println("Fe yon chwa silvouple....\n");
		//option = number.nextInt();
				//KREYE YON OBJE POU KLAS EKSEPSYON AN SE POU OPSYON
			Eksepsyon eks1 = new Eksepsyon();
			option = eks1.oppss();
		
		
		
		// kreyasyon kek obje statik pou operasyon adisyon
		Operation1 add = new Operation1();
		
		// kreyasyon kek obje statik pou operasyon soustraksyon
		Operation1 sous = new Operation1();

		// kreyasyon kek obje statik pou operasyon miltiplikasyon
		Operation1 mult = new Operation1();


		// kreyasyon kek obje statik pou operasyon divizyon
		Operation1 div = new Operation1();

		
		
		
		
		
		
		
		
		
				//KREYE YON OBJE POU KLAS EKSEPSYON AN MEN SE POU DOUBLE
				Eksepsyon doub1 = new Eksepsyon();
			
						
						
			double a;
			double b;
		switch(option){

			case 1:
				System.out.println("\n\t\tou chwazi opsyon adisyon an mesi.\n\n");
				System.out.println("\t\t\tSilvouple rantre 2 vale ou vale konnen som yo an\n\n");

					a = doub1.valeurDouble();
					b = doub1.valeurDouble();
					
					System.out.println(a+" + "+b+" = "+add.adisyon(a,b));

			break;
			
			case 2:
				System.out.println("\n\t\tou chwazi opsyon soustraksyon an mesi.\n\n");
				System.out.println("\t\t\tSilvouple rantre 2 vale\n\n");
				
					a = doub1.valeurDouble();
					b = doub1.valeurDouble();
					
					System.out.println(a+" - "+b+" = "+sous.soustraksyon(a,b));
			break;
			
			case 3:
				System.out.println("\n\t\tou chwazi opsyon adisyon an mesi.\n\n");
				System.out.println("\t\t\tSilvouple rantre 2 vale\n\n");
				
					a = doub1.valeurDouble();
					b = doub1.valeurDouble();
					
					System.out.println(a+" * "+b+" = "+mult.miltiplikasyon(a,b));
			break;
			
			case 4:
				System.out.println("\n\t\tou chwazi opsyon adisyon an mesi.\n\n");
				System.out.println("\t\t\tSilvouple rantre 2 vale\n\n");
				
					a = doub1.valeurDouble();
					b = doub1.valeurDouble();
					if(b!=0){
					System.out.println(a+" / "+b+" = "+div.divizyon(a,b));
					}else{
						System.out.println("NB: yo pa dako divizyon pa zewo non zanmim....");
					}
			break;
			
			default:
				System.out.println("\n\t\topsyon saaa pa disponib");
			
		}
		System.out.println("ou vle kontinye fe chwa toujou, si wi peze 'y' oubyen 'Y' sinon peze nenpot lot bgy pou kanpel");
		choice = letter.nextLine();	
		}while(choice.equalsIgnoreCase("y"));
	}
}