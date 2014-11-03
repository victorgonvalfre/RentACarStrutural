package RAC.Model;

import RAC.Model.Utility.TipoTrabalhador;

public class Empregado extends Pessoa {
	private String codigoRegistro;
	private String numeroCarteiraTrabalho;
	private TipoTrabalhador cargo;
	
	public String getCodigoRegistro() {
		return codigoRegistro;
	}
	public void setCodigoRegistro(String codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}
	public String getNumeroCarteiraTrabalho() {
		return numeroCarteiraTrabalho;
	}
	public void setNumeroCarteiraTrabalho(String numeroCarteiraTrabalho) {
		this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
	}
	public TipoTrabalhador getCargo() {
		return cargo;
	}
	public void setCargo(TipoTrabalhador cargo) {
		this.cargo = cargo;
	}
}
