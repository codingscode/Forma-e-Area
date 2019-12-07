package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enums.Cor;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Forma> lista = new ArrayList<>();
		
		System.out.println("Digite o número de formas : ");
		int n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
		  System.out.println("Forma #" + i + " informação : ");
		  System.out.println("Retangulo ou Circulo (r/c) ? : ");
          char formato = sc.next().charAt(0);	
          System.out.println("Cor (VERDE/VERMELHO/AZUL/LARANJA): ");
          Cor cor = Cor.valueOf(sc.next());
          if (formato == 'r') {
        	 System.out.print("Largura: ");
        	 double largura = sc.nextDouble();
        	 System.out.print("Altura: ");
        	 double altura = sc.nextDouble();
        	 lista.add(new Retangulo(cor, largura, altura));
          }
          else {
        	 System.out.print("Raio: ");
        	 double raio = sc.nextDouble();
        	 lista.add(new Circulo(cor, raio));
          }
          
		}
		
		System.out.println();
		System.out.println("Área das Formas : ");
		for (Forma forma : lista) {
		  System.out.println(String.format("%.2f", forma.area()));
		}
		
        sc.close();
	}

}
