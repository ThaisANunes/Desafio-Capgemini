
import java.util.Scanner;

public class cadastroAnuncio {

	public static void main(String[] args) {
		String nomeAnuncio, cliente;
		double dataInicioDia, dataInicioMes, dataInicioAno, dataTerminoDia, dataTerminoMes, dataTerminoAno ,investimentoDia, 
		totalDias1, totalDias2, totalDias, totalInvestido, maxVisual, maxCliques = 0, maxCompart;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o nome do Anuncio?");
		nomeAnuncio = ler.nextLine();
		
		System.out.println("Qual Cliente?");
		cliente = ler.nextLine();
		
		System.out.println("Qual dia para data de inicio?");
		dataInicioDia = ler.nextDouble();
		
		System.out.println("Qual m�s para data de inicio?");
		dataInicioMes = ler.nextDouble();
		
		System.out.println("Qual ano para data de inicio?");
		dataInicioAno = ler.nextDouble();
		
		System.out.println("Qual dia para data de t�rmino?");
		dataTerminoDia = ler.nextDouble();
		
		System.out.println("Qual m�s para data de t�rmino?");
		dataTerminoMes = ler.nextDouble();
		
		System.out.println("Qual ano para data de t�rmino?");
		dataTerminoAno = ler.nextDouble();
		
		System.out.println("Qual investimento por dia?");
		investimentoDia = ler.nextDouble();
		
		totalDias1 = (dataInicioAno*365)+(dataInicioMes*30)+dataInicioDia;
		totalDias2 = (dataTerminoAno*365)+(dataTerminoMes*30)+dataTerminoDia;
		totalDias = totalDias2 - totalDias1;
		totalInvestido = totalDias *  investimentoDia;
		maxVisual = (totalInvestido * 30) * 160;
		
		/*if(maxVisual % 100 == 0) {
			maxCliques = maxVisual*12;
		}*/
		
		System.out.printf("\nValor total investido foi de: R$ %.2f",totalInvestido);
		System.out.printf("\nQuantidade m�xima de visualiza��es ser� de: %6.0f",maxVisual);
		/*System.out.printf("\nQuantidade m�xima de cliques ser� de: %.0f",maxCliques);
		System.out.printf("\nQuantidade m�xima de compartilhamentos ser� de: %.0f",totalInvestido);
		Eu n�o consegui desenvolver uma l�gica capaz de responder as duas ultimas perguntas*/
		
	}

}
