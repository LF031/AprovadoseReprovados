import java.util.*;
public class Exercicio3_1 {

	public static void main(String[] args) {
		// 1 - variaveis
		byte notaLTP;
		byte contAprovados = 0;
		byte contReprovados = 0;
		byte cont = 1;
		Scanner leia = new Scanner(System.in);
		
		// 2 - Entrada de dados
		while (cont <= 10) {
			System.out.println("Digite a nota do aluno " + cont + ": ");
			notaLTP = leia.nextByte();
			
			// 3 - calculos
			if (notaLTP >= 60) {
				System.out.println("Aluno aprovado");
				contAprovados ++;
			} else {
				System.out.println("Aluno reprovado");
				contReprovados ++;
			}
			cont ++;
		}
		
		System.out.println("Numero de Aprovados: " + contAprovados);
		System.out.println("Numero de Reprovados: " + contReprovados);

	}

}
