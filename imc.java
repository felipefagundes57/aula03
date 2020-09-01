import java.util.Scanner

public.class Imc 
{
	public static void main(String[] args)
	{
		double altura; 
		double peso; 
		double massa;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira sua altura em cm: ");
		altura = entrada.nextDouble();
		System.out.print("Insira o seu peso: ");
		peso = entrada.nextDouble();
		
		entrada.close();
		
		massa = peso / (altura * altura);
		
		if (massa < 18.5)
		{
			System.out.printf("Abaixo do peso");
		}
		else if ((massa >= 18.5) && (massa<= 24.500)){
			System.out.printf("Normal");
		}
		else if ((massa>= 25)&&(massa<=29.9)){
			System.out.printf("Sobrepeso");
		}
		else
		{
			System.out.printf("Obeso(a)");
		}
		
	}
}