package RAC.Model;

import java.util.Date;
import RAC.Model.Utility.TipoCnh;

public class Cnh {
	private String numero;
	private TipoCnh tipoCarteira;
	private Date emissao;
	private Date validade;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public TipoCnh getTipoCarteira() {
		return tipoCarteira;
	}
	public void setTipoCarteira(TipoCnh tipoCarteira) {
		this.tipoCarteira = tipoCarteira;
	}
	public Date getEmissao() {
		return emissao;
	}
	public void setEmissao(Date emissao) {
		this.emissao = emissao;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
}
