/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicapooii;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateu
 */
public class HistoricoClinico {
    private List<String> registros;

    public HistoricoClinico() {
        this.registros = new ArrayList<>();
    }

    public void adicionarRegistro(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: O histórico não aceita texto vazio."); // 
        }
        this.registros.add(texto);
    }

    public List<String> getRegistros() {
        return registros;
    }
    
}
