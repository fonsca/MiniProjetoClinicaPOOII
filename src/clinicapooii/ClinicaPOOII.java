/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clinicapooii;

import java.time.LocalDateTime;
/**
 *
 * @author mateu
 */
public class ClinicaPOOII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--- INICIANDO SISTEMA DE CLÍNICA ---\n");

        Medico medico = new Medico("Dra. Ana", "12345-ES");
        Paciente paciente = new Paciente("Mateus Fonseca", "111.222.333-44");

        // 1. Cenário Válido
        System.out.println("[CENÁRIO VÁLIDO]");
        try {
            Consulta consultaValida = new Consulta(medico, paciente, LocalDateTime.now().plusDays(2));
            System.out.println("Consulta marcada com sucesso para o futuro.");
            consultaValida.registrarComparecimento();
            
            Exame exameValido = new Exame("Hemograma", 5);
            System.out.println("Exame " + exameValido.getNomeExame() + " criado com prazo de " + exameValido.getPrazoDias() + " dias.");
            
            paciente.getHistorico().adicionarRegistro("Paciente relatou dores de cabeça.");
            System.out.println("Histórico atualizado com sucesso.\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 2. Cenário Inválido (Quebrando as regras de negócio)
        System.out.println("[CENÁRIO INVÁLIDO]");
        try {
            // Tentando marcar no passado 
            Consulta consultaInvalida = new Consulta(medico, paciente, LocalDateTime.now().minusDays(1));
        } catch (IllegalArgumentException e) {
            System.out.println("Esperado: " + e.getMessage());
        }

        try {
            // Tentando criar exame com prazo 0 
            Exame exameInvalido = new Exame("Raio-X", 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Esperado: " + e.getMessage());
        }
        System.out.println();

        // 3. Caso de Borda (String vazia no histórico e espaços em branco)
        System.out.println("[CASO DE BORDA]");
        try {
            // Tentando inserir texto vazio ou apenas com espaços 
            paciente.getHistorico().adicionarRegistro("   "); 
        } catch (IllegalArgumentException e) {
            System.out.println("Esperado (Texto em branco): " + e.getMessage());
        }
        
    }
    
}
