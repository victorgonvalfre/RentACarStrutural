package RAC.Controller;

import RAC.Model.Utility.EMainMenu;
import RAC.Model.Utility.LeitorUtil;
import RAC.VIEW.MainView;

public class MainController {
	OperationController operationController = new OperationController();
	LeitorUtil leitor = new LeitorUtil();
	MainView menuInicial = new MainView();
	EMainMenu opacoSelecionadaMenu;
	
public void start() {
		
		menuInicial.show();
		
		int opcaoMainMenu = LeitorUtil.lervalorInteiro();

		verificandoOpcaoEscolhidaMenuPrincipal(opcaoMainMenu);

		if (opacoSelecionadaMenu != null) {
			
			operationController.setOpcaoSelecionada(opacoSelecionadaMenu);
			
			operationController.start();
		}

	}
	
	private void verificandoOpcaoEscolhidaMenuPrincipal(int opcao) {
		switch (opcao) {
			case 1: 
				opacoSelecionadaMenu = EMainMenu.NovoCliente;
				break;
			case 2:
				opacoSelecionadaMenu = EMainMenu.NovaReserva;
				break;
			case 3: 
				opacoSelecionadaMenu = EMainMenu.IniciarAluguel;
				break;
			case 4:
				menuInicial.mensagemFim();
				break;
			default: 
				menuInicial.mensagemOpcaoInvalida();
				menuInicial.mensagemFim();
				break;
		}

	}


}
