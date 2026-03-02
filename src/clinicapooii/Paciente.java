/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicapooii;

/**
 *
 * @author mateu
 */
public class Paciente {
    private String nome;
    private String cpf;
    private HistoricoClinico historico;

    public Paciente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.historico = new HistoricoClinico();
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public HistoricoClinico getHistorico() { return historico; }
    
}
