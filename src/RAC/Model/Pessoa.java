package RAC.Model;

import java.util.Date;

public abstract class Pessoa {
	public String nome;
	public String cpf;
	public String rg;
	public Date nascimento;
	public Contato telefones;
	public Endereco endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public Contato getTelefones() {
		return telefones;
	}
	public void setTelefones(Contato telefones) {
		this.telefones = telefones;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg
				+ ", nascimento=" + nascimento + "]";
	}
}
