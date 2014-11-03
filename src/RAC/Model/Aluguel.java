package RAC.Model;

public class Aluguel {
	private Reserva reserva;
	private double kilometragemDeSaida;
	public double kilometragemDeVolta;
	public boolean aluguelComSeguro;
	private double valorDiaria;
	private double valorTotal;
	private double aluguelEfetuadoComSucesso;
	
	public Reserva getReserva() {
		return reserva;
	}
	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	public double getKilometragemDeSaida() {
		return kilometragemDeSaida;
	}
	public void setKilometragemDeSaida(double kilometragemDeSaida) {
		this.kilometragemDeSaida = kilometragemDeSaida;
	}
	public double getKilometragemDeVolta() {
		return kilometragemDeVolta;
	}
	public void setKilometragemDeVolta(double kilometragemDeVolta) {
		this.kilometragemDeVolta = kilometragemDeVolta;
	}
	public boolean isAluguelComSeguro() {
		return aluguelComSeguro;
	}
	public void setAluguelComSeguro(boolean aluguelComSeguro) {
		this.aluguelComSeguro = aluguelComSeguro;
	}
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public double getAluguelEfetuadoComSucesso() {
		return aluguelEfetuadoComSucesso;
	}
	public void setAluguelEfetuadoComSucesso(double aluguelEfetuadoComSucesso) {
		this.aluguelEfetuadoComSucesso = aluguelEfetuadoComSucesso;
	}
}
