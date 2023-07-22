/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cadastro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fatality Informatica
 */
public class Cliente extends Pessoa { 
    
    private String cpf;
    private String numeroWhatsApp;
    private List<Eventualidade> eventualidades;
    private List<Recompensa> recompensas;

    public Cliente(String nome,LocalDate dataNascimento, String cpf, String numeroWhatsApp) {
        super(nome, dataNascimento);
        this.cpf = cpf;
        this.numeroWhatsApp = numeroWhatsApp;       
        this.eventualidades = new ArrayList<>(); //não vai no parametro, pois assim que ele é cadastrado 
        this.recompensas = new ArrayList<>();   //ele não vai ser obrigado a ter uma eventualidade e/ou recompensa
             
    }
    public void resgatarRecompensas(List<Recompensa> recompensas){
        this.recompensas = recompensas;
    }
    public void receberNotificacaoDeEventualidades(List<Eventualidade> eventualidades){
        //percorrendo para cada eventualidade na Lista Eventualidades. A cada repetição, a variavel eventualidade recebe uma referencia para um elemento na lista:
        for(Eventualidade eventualidade : eventualidades){ 
            System.out.println(getNome() + " recebeu uma notificação de: " + eventualidade);
       
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroWhatsApp() {
        return numeroWhatsApp;
    }

    public void setNumeroWhatsApp(String numeroWhatsApp) {
        this.numeroWhatsApp = numeroWhatsApp;
    }

    public List<Eventualidade> getEventualidades() {
        return eventualidades;
    }

    public void setEventualidades(List<Eventualidade> eventualidades) {
        this.eventualidades = eventualidades;
    }

    public List<Recompensa> getRecompensas() {
        return recompensas;
    }

    public void setRecompensas(List<Recompensa> recompensas) {
        this.recompensas = recompensas;
    }

   
    
    
}
