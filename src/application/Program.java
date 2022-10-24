package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Estoque[][] matriz = new Estoque[100][100];

		String entrada = "";
	
		int cont = 0;

		boolean menu = true;
		while (menu) {
			System.out.println("Oque voçê deseja fazer? " 
					+ "   \n[1] Para Abrir estoque" 
					+ "   \n[2] Para Adicionar"
					+ "   \n[0] Para sair do Programa");
			int Resposta = Integer.parseInt(input.nextLine());
			
			switch (Resposta) {
			case 1:
				if (matriz[0][0] == null) {
					System.out.println("O Estoque está sem Produtos");
				}else {
					for (int i = 0; i < matriz.length; i++) {
						for (int j = 0; j < matriz.length; j++) {
							if(matriz[i][j] != null) {
								System.out.println(" \n Lista de Estoque");
								for (int k = 0; k < matriz[i][j].getListaDeProdutos().size(); k++) {
									System.out.println(matriz[i][j].getListaDeProdutos().get(k));
								}
							}
						}
					}
				}
				break;
			case 2:
				Estoque e = new Estoque();
				do {
					Produto product = new Produto();
					
					System.out.println("Digite o Nome do Produto");
					product.setNomeDoProduto(input.nextLine());
				
					System.out.println("Digite o preco unitario do produto");
					product.setPrecoUnitario(Double.parseDouble(input.nextLine()));
					
					System.out.println("Digite o preco por kg do produto");
					product.setPrecoPorQuilo(Double.parseDouble(input.nextLine()));

					System.out.println("Digite o tipo do Produto");
					String tipo = input.nextLine().toUpperCase();

					if (tipo.equals("FRUTAS")) {
						product.setTipo(TipoDoProduto.FRUTA);
					}else if(tipo.equals("FRUTA")) {
						product.setTipo(TipoDoProduto.FRUTA);
					}
					else if (tipo.equals("LEGUME")) {
						product.setTipo(TipoDoProduto.LEGUME);
					
					} else if(tipo.equals("LEGUMES")) {
						product.setTipo(TipoDoProduto.LEGUME);
					
					}else if(tipo.equals("VEGETAL")) {
						product.setTipo(TipoDoProduto.VEGETAL);
					
					}else if(tipo.equals("VEGETAIS")) {
						product.setTipo(TipoDoProduto.VEGETAL);
					}
	
					e.getListaDeProdutos().add(product);
					
					System.out.println("Deseja adicionar um novo produto (s/n):");
					entrada = input.nextLine();
					if (entrada.equals("s")) {
						cont++;
					}

				} while (entrada.equals("s"));
				if (entrada.equals("n")) {
					 for (int i = 0; i < matriz.length;i++) {
							for (int j = 0; j < matriz.length;j++) {
								if (matriz[i][j] == null) {
									matriz[i][j] = e;
									i = j = matriz.length;
									break;
					}			
				}			
			}
					System.out.println("Entrada adicionada com Sucesso");
				}
				break;

			case 0:
				menu = false;
				System.out.println("Programa Encerrado com Sucesso, Obrigado pela colaboração com o nosso Sistema de Estoque!");
				break;

			}
			
		}
		input.close();
	}
}
