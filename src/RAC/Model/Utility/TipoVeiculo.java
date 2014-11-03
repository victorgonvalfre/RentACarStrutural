package RAC.Model.Utility;

public enum TipoVeiculo {
	Carro(0), Moto(1), Van(2);
	
	public final int iD;
	
	private TipoVeiculo(int id){
		this.iD = id;
	}

}
