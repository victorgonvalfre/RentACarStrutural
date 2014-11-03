package RAC.Model;

public class Endereco {
	public String bairro;
	public String cep;
	public String rua;
	public int numeroResidencia;
	public String complemento;
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumeroResidencia() {
		return numeroResidencia;
	}
	public void setNumeroResidencia(int numeroResidencia) {
		this.numeroResidencia = numeroResidencia;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
