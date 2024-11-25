/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studente;

/**
 *
 * @author moham
 */
public class Studente {
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private String matricola;

    public Studente(String nome, String cognome, String codiceFiscale, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.matricola = matricola;
    }

    public String toString() {
        return "Nome: " + nome + ", Cognome: " + cognome + ", Codice Fiscale: " + codiceFiscale + ", Matricola: " + matricola;
    }
}

