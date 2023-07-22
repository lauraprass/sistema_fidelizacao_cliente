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
public class Eventualidade {
    private  String nome;
    private  LocalDate data;
    private  TipoEventualidade eventualidade;
    private List<Cliente> clientes;
    private List<Recompensa> recompensas;

    public Eventualidade(String nome, LocalDate data, TipoEventualidade eventualidade, List<Recompensa> recompensas) {
        this.nome = nome;
        this.data = data;
        this.eventualidade = eventualidade;
        this.clientes = new ArrayList<>(); 
        this.recompensas = recompensas;
    }

    @Override
    public String toString() {
        return "*Eventualidade{" + "Nome: " + nome + "| Data: " + data + "| Tipo da Eventualidade: " + eventualidade + "| Clientes: " + clientes + "| Recompensas: " + recompensas + '}';
    }

    public List<Recompensa> getRecompensas(){
        return recompensas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public TipoEventualidade getEventualidade() {
        return eventualidade;
    }

    public void setEventualidade(TipoEventualidade eventualidade) {
        this.eventualidade = eventualidade;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
 
}
