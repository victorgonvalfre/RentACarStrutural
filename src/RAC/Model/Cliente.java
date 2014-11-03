package RAC.Model;

public class Cliente extends Pessoa {
	private boolean restricoes;
	private Cnh carteiraMotorista;
	private CartaoCredito cartaoDeCredito;
	
	public boolean isRestricoes() {
		return restricoes;
	}
	public void setRestricoes(boolean restricoes) {
		this.restricoes = restricoes;
	}
	public Cnh getCarteiraMotorista() {
		return carteiraMotorista;
	}
	public void setCarteiraMotorista(Cnh carteiraMotorista) {
		this.carteiraMotorista = carteiraMotorista;
	}
	public CartaoCredito getCartaoDeCredito() {
		return cartaoDeCredito;
	}
	public void setCartaoDeCredito(CartaoCredito cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}
	@Override
	public String toString() {
		return "Cliente []";
	}

}
