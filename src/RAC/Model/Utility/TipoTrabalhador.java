package RAC.Model.Utility;

public enum TipoTrabalhador {
	Estagiario(0), Atendente(1), Gerente(2);
	
	public final int iD;
	
	private TipoTrabalhador(int id){
		this.iD = id;
	}

}
