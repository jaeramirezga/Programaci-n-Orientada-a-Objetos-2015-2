package Banquitas;

public class Torneo {
	
Scanner sc = new Scanner (System.in);
	
	public Torneo(){
	}
	
	public void Partido(Equipo a,Equipo b){
		int[]  goles = new int[2];
		do{
			System.out.println("Digite la cantidad de goles anotados por el equipo ");
			goles[0] = sc.nextInt();
		}while(goles[0] < 0);
		
		do{
			System.out.println("Digite la cantidad de goles anotados por el equipo ");
			goles[1] = sc.nextInt();
		}while(goles[1] < 0);
		
		System.out.println("El equipo ganador es ");
		
		if(goles[0] > goles[1]){
			System.out.println("El equipo ganador es ");
			Equipo a.puntos = Equipo a.puntos + 3; 
		}
		if(goles[0] == goles[1]){
			System.out.println("El resultado del partido es un empate ");
			Equipo a.puntos = Equipo a.puntos + 1;
			Equipo b.puntos = Equipo b.puntos + 1;
		}
		if(goles[0] < goles[1]){
			System.out.println("El equipo ganador es ");
			Equipo b.puntos = Equipo b.puntos + 3;
		}
	}
	

}
