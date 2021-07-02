import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
	
		double v,t,c;
		/*v = Valor a ser inserido para investimento
		 *t = Total do valor investido multiplicado por 30 (contando que cada 1,00 gera 30 visualizões)
		 *c = Total de compartilhamento, que será o total de visualizações multiplicado por 160 ( contando que pode ser compartilhado
		 4 vezes e cada compartilhamento gera 40 novas visualizações)   */
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o valor a ser investido? \n");
		v = ler.nextDouble();
		
		t = v*30;
		c = t*160;
		
		System.out.printf("\nA Projeção aproximada de visualizações do anúncio é de: %.0f",t);
		System.out.printf("\nA projeção pode ser aumentada caso haja compartilhamentos, que pode resultar em torno de: %.0f",c," visualizações");
	}

}
