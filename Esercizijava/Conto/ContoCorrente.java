package Esercizijava.Conto;

public class ContoCorrente {

	private String nome;
	private String cognome;
	private String codice;
	private double saldo;

	public ContoCorrente(String nome, String cognome, String codice) {
		this.nome = nome;
		this.cognome = cognome;
		this.codice = codice;
		this.saldo = 0;
	}

	public double preleva(double importo) {
		if (importo >= 0 && importo <= saldo) {
			saldo -= importo;
		}
		return saldo;
	}

	public double deposita(double importo) {
		if (importo >= 0) {
			saldo += importo;
		}
		return saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getCodice() {
		return codice;
	}

	public String getNominativo() {
		return nome + " " + cognome;
	}

	@Override
	public String toString() {
		return "Conto corrente: " + getNominativo()
				+ ", codice: " + codice
				+ ", saldo: " + saldo;
	}
}
