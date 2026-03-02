/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicapooii;

import java.time.LocalDateTime;
/**
 *
 * @author mateu
 */
public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private LocalDateTime dataHora;
    private boolean compareceu;

    public Consulta(Medico medico, Paciente paciente, LocalDateTime dataHora) {
        if (dataHora.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("Erro: A consulta não pode ser marcada no passado."); // 
        }
        this.medico = medico;
        this.paciente = paciente;
        this.dataHora = dataHora;
        this.compareceu = false; // 
    }

    public void registrarComparecimento() {
        this.compareceu = true;
        System.out.println("Comparecimento registrado para " + paciente.getNome());
    }

    public boolean isCompareceu() { return compareceu; }
}
