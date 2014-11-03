package RAC.Model;

import java.util.List;
import RAC.Model.Utility.TipoDiaria;

public class Carro extends Veiculo{
	public String Descricao;
	public TipoDiaria valorDiaria;
	public List<Utilitarios> lstUtilitarios;
	
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	
	public TipoDiaria getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(TipoDiaria valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	public List<Utilitarios> getLstUtilitarios() {
		return lstUtilitarios;
	}
	public void setLstUtilitarios(List<Utilitarios> lstUtilitarios) {
		this.lstUtilitarios = lstUtilitarios;
	}
}
