package RAC.Model;

import java.util.Date;

public class CartaoCredito {
	private String titular;
	private Date vencimeto;
	private String numero;
	private boolean aprovado;
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Date getVencimeto() {
		return vencimeto;
	}
	public void setVencimeto(Date vencimeto) {
		this.vencimeto = vencimeto;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

}
