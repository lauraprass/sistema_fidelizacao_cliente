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
public class Recompensa {
    
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private TipoDeRecompensa tipoRecompensa;
    private List<Eventualidade> eventualidades;
    private List<Cliente> clientes;

    public Recompensa(String descricao, LocalDate dataInicio, LocalDate dataFim, TipoDeRecompensa recompensa) {
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.tipoRecompensa = recompensa;
        this.eventualidades = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    @Override
    public String toString(){ 
        return "Eventualidade: " + descricao + " tem as recompensar de: " + tipoRecompensa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public TipoDeRecompensa getTipoRecompensa() {
        return tipoRecompensa;
    }

    public void setTipoRecompensa(TipoDeRecompensa tipoRecompensa) {
        this.tipoRecompensa = tipoRecompensa;
    }

    public List<Eventualidade> getEventualidades() {
        return eventualidades;
    }

    public void setEventualidades(List<Eventualidade> eventualidades) {
        this.eventualidades = eventualidades;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    


}
