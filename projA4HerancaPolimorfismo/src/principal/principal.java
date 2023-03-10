package principal;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int opcao;
		
		System.out.println("****** BEM VINDO *******");
		System.out.println("Escolha o tipo de produto a ser cadastrado:");
		System.out.println("1 - Perecível");
		System.out.println("2 - Permanente");
		opcao = ler.nextInt();
		
		if(opcao == 1) {
			
			Perecivel per = new Perecivel();
			Pedido ped = new Pedido();
			
			System.out.println("Cadastro de produto PERECÍVEL");
			System.out.println("Digite o código do produto: ");
			per.setCodigo(ler.nextInt());
			
			ler.nextLine();
			
			System.out.println("Digite a descrição do produto:");
			per.setDescricao(ler.nextLine());
			
			System.out.println("Digite o valor de venda do produto:");
			per.setValorUnit(ler.nextDouble());
			
			ler.nextLine();
			
			System.out.println("Digite a data de validade do produto:");
			per.setDataValidade(ler.nextLine());
			
			System.out.println("Digite a cidade de origem do produto:");
			per.setCidadeOrigem(ler.nextLine());
			
			ped.setProduto(per);
			
			ped.setCodigo(per.getCodigo());
			
			System.out.println("REALIZAÇÃO DO PEDIDO");
			System.out.println("Informe a data do pedido:");
			ped.setDataPedido(ler.nextLine());
			
			System.out.println("Informe a quantidade de itens:");
			ped.setQuantidade(ler.nextInt());
			
			System.out.println("Cadastro de pedido realizado com sucesso!");
			System.out.println("Segue os dados do pedido:");
			System.out.println("Código >> " + ped.getCodigo());
			System.out.println("Data >> " + ped.getDataPedido());
			System.out.println("Valor Total >> R$" + per.calcValorTotal(ped.getQuantidade()));
				
			
			
		}else {
			if(opcao == 2) {
				
				Permanente perm = new Permanente();
				Pedido ped = new Pedido();
				
				System.out.println("Cadastro de produto PERMANENTE");
				System.out.println("Digite o código do produto: ");
				perm.setCodigo(ler.nextInt());
				
				ler.nextLine();
				
				System.out.println("Digite a descrição do produto:");
				perm.setDescricao(ler.nextLine());
				
				System.out.println("Digite o valor de venda do produto:");
				perm.setValorUnit(ler.nextDouble());
				
				ler.nextLine();
				
				
				System.out.println("Digite o percentual de desvalorização:");
				perm.setPercDesvalorizacao(ler.nextDouble());
				
				System.out.println("Esse produto está no escritório? Digite 'True' ou 'False'");
				perm.setEscritorio(ler.nextBoolean());
				
				ped.setProduto(perm);
				
				ped.setCodigo(perm.getCodigo());
				
				ler.nextLine();
				
				System.out.println("REALIZAÇÃO DO PEDIDO");
				System.out.println("Informe a data do pedido:");
				ped.setDataPedido(ler.nextLine());
				
				System.out.println("Informe a quantidade de itens:");
				ped.setQuantidade(ler.nextInt());
				
				System.out.println("Cadastro de pedido realizado com sucesso!");
				System.out.println("Segue os dados do pedido:");
				System.out.println("Código >> " + ped.getCodigo());
				System.out.println("Data >> " + ped.getDataPedido());
				System.out.println("Valor Total >> R$" + perm.calcValorTotal(ped.getQuantidade()));
				
			}else {
				System.out.println("Opção inválida!");
			}
		}
	}
}
