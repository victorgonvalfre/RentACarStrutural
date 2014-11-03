package RAC.Model;

import RAC.Model.Utility.TipoVeiculo;

public abstract class Veiculo {
	private int codigo;
	public int anoModelo;
	public String modelo;
	public String placa;
	public String numeroChasi;
	public TipoVeiculo tipoVeiculo;
	public double KilometragemTotal;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getNumeroChasi() {
		return numeroChasi;
	}
	public void setNumeroChasi(String numeroChasi) {
		this.numeroChasi = numeroChasi;
	}
	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	public double getKilometragemTotal() {
		return KilometragemTotal;
	}
	public void setKilometragemTotal(double kilometragemTotal) {
		KilometragemTotal = kilometragemTotal;
	}
}
