package RAC.VIEW;

public class MainView {
	
	// Mostrando o menu
	public void show() {
		mostrarMenu();
	}

	// Mostrando o menu
	private void mostrarMenu() {

		System.out.println("Bem vindo ao RAC'S");
		System.out.println("1 - Cadastrar Cliente");
		System.out.println("2 - Criar Reserva");
		System.out.println("3 - Efetuar Aluguel");
		System.out.println("4 - Sair");

	}
	
	//Mensagem de op�o Invalida
	public void mensagemOpcaoInvalida (){
		System.out.println("Opc�o invalida");
	}
	
	//Mensavem de fim de execu��o
	public void mensagemFim (){
		System.out.println("Fim do programa!");
	}


}
