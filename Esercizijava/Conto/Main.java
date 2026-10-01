package Esercizijava.Conto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<ContoCorrente> conti = new ArrayList<>();
		int scelta;

		do {
			System.out.println("\n--- MENU CONTO CORRENTE ---");
			System.out.println("1. Crea conto");
			System.out.println("2. Deposita denaro");
			System.out.println("3. Preleva denaro");
			System.out.println("4. Mostra dati del conto");
			System.out.println("0. Esci");
			System.out.print("Scegli un'opzione: ");
			scelta = scanner.nextInt();
			scanner.nextLine();

			switch (scelta) {
				case 1:
					System.out.print("Nome: ");
					String nome = scanner.nextLine();
					System.out.print("Cognome: ");
					String cognome = scanner.nextLine();
					String codice;
					boolean codiceGiaUsato;
					do {
						System.out.print("Codice univoco del conto: ");
						codice = scanner.nextLine();
						codiceGiaUsato = false;
						for (ContoCorrente contoEsistente : conti) {
							if (contoEsistente.getCodice().equals(codice)) {
								codiceGiaUsato = true;
								System.out.println("Questo codice è già utilizzato.");
								break;
							}
						}
					} while (codiceGiaUsato);

					ContoCorrente nuovoConto = new ContoCorrente(nome, cognome, codice);
					System.out.print("Saldo iniziale: ");
					double saldoIniziale = scanner.nextDouble();
					scanner.nextLine();
					nuovoConto.deposita(saldoIniziale);
					conti.add(nuovoConto);
					System.out.println("Conto creato. Saldo: " + nuovoConto.getSaldo());
					break;
				case 2:
					ContoCorrente contoDeposito = scegliConto(scanner, conti);
					if (contoDeposito != null) {
						System.out.print("Importo da depositare: ");
						double deposito = scanner.nextDouble();
						scanner.nextLine();
						System.out.println("Saldo dopo il deposito: " + contoDeposito.deposita(deposito));
					}
					break;
				case 3:
					ContoCorrente contoPrelievo = scegliConto(scanner, conti);
					if (contoPrelievo != null) {
						System.out.print("Importo da prelevare: ");
						double prelievo = scanner.nextDouble();
						scanner.nextLine();
						System.out.println("Saldo dopo il prelievo: " + contoPrelievo.preleva(prelievo));
					}
					break;
				case 4:
					if (conti.isEmpty()) {
						System.out.println("Non ci sono conti da mostrare.");
					} else {
						for (int i = 0; i < conti.size(); i++) {
							System.out.println((i + 1) + ". " + conti.get(i));
						}
					}
					break;
				case 0:
					System.out.println("Arrivederci.");
					break;
				default:
					System.out.println("Scelta non valida.");
			}
		} while (scelta != 0);

		scanner.close();
	}

	private static ContoCorrente scegliConto(Scanner scanner, List<ContoCorrente> conti) {
		if (conti.isEmpty()) {
			System.out.println("Crea prima un conto corrente.");
			return null;
		}

		System.out.println("Scegli un conto:");
		for (int i = 0; i < conti.size(); i++) {
			System.out.println((i + 1) + ". " + conti.get(i).getNominativo()
					+ " - codice: " + conti.get(i).getCodice());
		}
		System.out.print("Numero del conto: ");
		int numeroConto = scanner.nextInt();
		scanner.nextLine();

		if (numeroConto < 1 || numeroConto > conti.size()) {
			System.out.println("Numero del conto non valido.");
			return null;
		}
		return conti.get(numeroConto - 1);
	}
}
