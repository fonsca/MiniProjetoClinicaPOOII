/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicapooii;

/**
 *
 * @author mateu
 */
public class Exame {
    private String nomeExame;
    private int prazoDias;

    public Exame(String nomeExame, int prazoDias) {
        if (prazoDias <= 0) {
            throw new IllegalArgumentException("Erro: O exame deve ter prazo maior que zero."); // 
        }
        this.nomeExame = nomeExame;
        this.prazoDias = prazoDias;
    }

    public String getNomeExame() { return nomeExame; }
    public int getPrazoDias() { return prazoDias; }
    
}
