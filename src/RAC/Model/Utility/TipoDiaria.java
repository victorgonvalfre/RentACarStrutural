package RAC.Model.Utility;

public enum TipoDiaria {
	CarroPasseio(150), CarroLuxo(250), CarroBasico(60);
	
	public final int iD;
	
	private TipoDiaria(int id){
		this.iD = id;
	}
}
