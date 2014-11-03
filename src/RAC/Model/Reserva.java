package RAC.Model;

import java.util.Date;

public class Reserva {
	private int codigo;
	public Date dataInicio;
	public Date dataFinal;
	public Carro veiculoReservado;
	public Empregado responsavelAtendimento;
	public Cliente cliente;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	public Carro getVeiculoReservado() {
		return veiculoReservado;
	}
	public void setVeiculoReservado(Carro veiculoReservado) {
		this.veiculoReservado = veiculoReservado;
	}
	public Empregado getResponsavelAtendimento() {
		return responsavelAtendimento;
	}
	public void setResponsavelAtendimento(Empregado responsavelAtendimento) {
		this.responsavelAtendimento = responsavelAtendimento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
