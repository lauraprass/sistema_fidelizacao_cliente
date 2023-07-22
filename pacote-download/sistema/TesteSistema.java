/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sistema;

import br.cadastro.Cliente;
import br.cadastro.Eventualidade;
import br.cadastro.Funcionario;
import br.cadastro.Recompensa;
import br.cadastro.TipoDeAcessoFuncionario;
import br.cadastro.TipoDeRecompensa;
import br.cadastro.TipoEventualidade;
import static br.cadastro.TipoEventualidade.EVENTO;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fatality Informatica
 */
public class TesteSistema {
    
    public static void main(String[] args) throws Exception {
        
        //Cadastrar funcionário:
        Funcionario osvaldo = new Funcionario("1234abc", TipoDeAcessoFuncionario.ADMINISTRADOR,"Osvaldo Junior", LocalDate.of(2023,Month.JUNE,12));
        
        //Cadastrar clientes:
        Cliente cliente1 = new Cliente("Caio",LocalDate.of(1990, Month.MARCH, 10),"222-978-667-90","(49)999-88873");
        Cliente cliente2 = new Cliente("Cleiton Junior",LocalDate.of(2001, Month.AUGUST, 20),"333-545-001-12","(61)555-12345");
        Cliente cliente3 = new Cliente("Juscleison",LocalDate.of(1999, Month.NOVEMBER, 01),"444-789-1011-45","(11)234-56839");
        
        //Cadastrar eventualidades:
        
        try{
            List<Recompensa> recompensasDiaIndependencia = new ArrayList<Recompensa>(); //lista vazia
            recompensasDiaIndependencia.add(new Recompensa("5% de desconto por dois dias consecutivos!" 
            , LocalDate.of(2023, Month.SEPTEMBER, 07), LocalDate.of(2023, Month.SEPTEMBER, 8), TipoDeRecompensa.PROMOCAO));
            Eventualidade diaIndependencia = osvaldo.adicionarEventualidade("Dia da Independência", LocalDate.of(2023, Month.SEPTEMBER, 07), EVENTO, recompensasDiaIndependencia);
            System.out.println("---------INFORMAÇÕES SOBRE A EVENTUALIDADE (Dia da Independência):");
            System.out.println(diaIndependencia.toString()); //toString -> Printa o Objeto
            System.out.println("=========================================================");
         
            //Disparar Notificações de Eventualidades:  
            ArrayList<Cliente> clientes = new ArrayList<>();
            clientes.add(cliente1);
            clientes.add(cliente2);
            clientes.add(cliente3);
            System.out.println("---------NOTIFICAÇÕES ENVIADAS:---------");
            osvaldo.dispararNotificacaoDeEventualidades(clientes, diaIndependencia);
            System.out.println("=========================================================");
            
            //Cliente resgatar recompensa:
            cliente1.resgatarRecompensas(diaIndependencia.getRecompensas());
            cliente2.resgatarRecompensas(diaIndependencia.getRecompensas());
            cliente3.resgatarRecompensas(diaIndependencia.getRecompensas());  
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Lista vazia");
        }
    }
    
}
