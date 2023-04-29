import java.util.Scanner;

//Declare as variaveis: base maior, base menor, altura e area
//Peça para a pessoa inserir as variaveis: base maior, base menor e altura
//Leia as informações dadas: base maior, base menor e altura
//Calcule a area: somando a base maior pela base menor 
//Divida o resultado por 2
//Multiplique o resultado da divisão pela altura
//Printe ao usuario o resultado da area

class CalculoTTrapezio {
	public static void main(String args[]){
		
    		Double BaseMaior, BaseMenor, altura, area;
    
    		Scanner lerTeclado = new Scanner(System.in);
		
			System.out.print("Digite o numero da sua base maior \n");
    		BaseMaior = lerTeclado.nextDouble();
			
			System.out.print("Digite o numero da sua base menor \n");
    		BaseMenor = lerTeclado.nextDouble();
			
			System.out.print("Digite o numero da sua altura \n");
    		altura = lerTeclado.nextDouble();
			
			area = ((BaseMaior + BaseMenor) /2) * altura;
			
			System.out.print("A area do seu trapezio e de " + area);

		
	}

}
