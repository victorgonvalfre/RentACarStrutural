package RAC.Controller;

import java.util.Calendar;

import RAC.Model.Cliente;
import RAC.Model.Contato;
import RAC.Model.Endereco;
import RAC.Model.Utility.EMainMenu;
import RAC.Model.Utility.LeitorUtil;
import RAC.VIEW.ClienteView;

public class OperationController {
	
	private EMainMenu opacoSelecionadaMenu;
	private int parametrosLidos;
	ClienteView clienteView = new ClienteView();
	LeitorUtil leitor = new LeitorUtil();
	Calendar cal = Calendar.getInstance();
	
	public void setOpcaoSelecionada(EMainMenu opcaoDoMenuInicial) {
		this.opacoSelecionadaMenu = opcaoDoMenuInicial;
	}
	
	public void start()
	{
		if(opacoSelecionadaMenu.equals(EMainMenu.NovoCliente))
		{
			criarNovoCliente();
		}
		else if(opacoSelecionadaMenu.equals(EMainMenu.NovaReserva))
		{
			
		}
		else{
			
		}
	}
	
	public void criarNovoCliente(){
		Cliente novoCliente = new Cliente();
		String auxiliarDeLeitura;
		this.parametrosLidos = 0;
		
		clienteView.show();
		
		while(parametrosLidos < 6){
			clienteView.mostrarMensgensCriacao(parametrosLidos);
			auxiliarDeLeitura =  leitor.lervalorString();
			montaCliente(novoCliente, parametrosLidos, auxiliarDeLeitura);
			parametrosLidos++;
		}
		
		System.out.print(novoCliente);
	}
	
	public void montaCliente(Cliente cliente,int parametro, String valorLido){
		switch (parametro) {
		case 0:
			cliente.nome = valorLido;
			break;
		case 1:
			cliente.cpf = valorLido;
			break;
		case 2:
			cliente.rg = valorLido;
			break;
		case 3:
			cliente.nascimento = cal.getTime();
			break;
		case 4:
			cliente.telefones = montaContatoCliente(valorLido);
			break;
		case 5:
			cliente.endereco = montaEnderecoCliente(valorLido);
			break;
		}

	}
	
	public Contato montaContatoCliente(String valorLido){
		Contato contato = new Contato();
		contato.tell1 = valorLido;
		return contato;
	}
	
	public Endereco montaEnderecoCliente(String valorLido){
		Endereco endereco = new Endereco();
		endereco.rua = valorLido;
		return endereco;
	}

}
