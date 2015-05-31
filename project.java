import java.util.Scanner;

public class project {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dni,i,j,b,broiDeinosti,nomerDeinost,swap;
		int[] deinost=new int[20];
		
		System.out.print("Vuvedi broia na dnite: ");
		dni=input.nextInt();
		
		//proverka na validnostta na zadadenata stoinost za broi dni
		while (dni<0){
			System.out.println("Vuvedi validna stoinost za broya na dnite: ");
			dni=input.nextInt();
		}
		
		for (i=0;i<dni;i++){
			System.out.print("Vuvedi broia na deinostite za den "+(i+1)+": ");
			broiDeinosti=input.nextInt();
			
			//proverka na validnostta na zadadenata stoinost za broi deinosti
			while (broiDeinosti<0){
				System.out.println("Vuvedi validna stoinost za broya na deinostite: ");
				broiDeinosti=input.nextInt();
			}
			
			System.out.print("Vuvedi nomer na deinostta za den "+(i+1)+": ");
			nomerDeinost=input.nextInt();
			
			//proverka na stoinostta na nomera na izbranata deinost
			while (nomerDeinost<0||nomerDeinost>broiDeinosti){
				System.out.println("Vuvedi validna stoinost za nomera na deinostta: ");
				nomerDeinost=input.nextInt();
			}
			
			System.out.println("Vuvedi produljitelnostta na deinostite : ");
			for (j=0;j<broiDeinosti;j++){
				deinost[j]=input.nextInt();
			}
			
			//proverka na produljitelnostta na deinostite
			for (b=0;b<broiDeinosti;b++){
				while (deinost[b]<0){
					System.out.println("Vuvedi validni stoinosti za deinostite: ");
					for (j=0;j<broiDeinosti;j++){
						deinost[j]=input.nextInt();
					}
				}
			}
			
			//sortirane na masiva v nizhodyasht red chrez metoda na mehurcheto
			for (j=0;j<broiDeinosti-1;j++){
				for (b=0;b<broiDeinosti-1-j;b++){
					if (deinost[b+1]>deinost[b]){
						swap=deinost[b+1];
						deinost[b+1]=deinost[b];
						deinost[b]=swap;
					}
				}
			}
			System.out.println("Izbranata deinost za den "+(i+1)+" otnema: "+deinost[nomerDeinost-1]);
		}
	}

}