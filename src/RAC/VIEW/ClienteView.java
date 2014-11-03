package RAC.VIEW;

public class ClienteView {

	// Mostrando o menu
	public void show() {
		mostrarMenu();
	}

	// Mostrando o menu
	private void mostrarMenu() {
		System.out.println("Bem vindo a Criação de um novo cliente:");
	}

	public void mostrarMensgensCriacao(int numeroDoParametro) {
		switch (numeroDoParametro) {
		case 0:
			System.out.println("Insira o Nome do Cliente:");
			break;
		case 1:
			System.out.println("Insira o CPF do Cliente:");
			break;
		case 2:
			System.out.println("Insira o RG do Cliente:");
			break;
		case 3:
			System.out.println("Insira a data de nascimento do Cliente:");
			break;
		case 4:
			System.out.println("Insira o numero do telefone do Cliente:");
			break;
		case 5:
			System.out.println("Insira o endereço do Cliente:");
			break;
		}
	}

}
