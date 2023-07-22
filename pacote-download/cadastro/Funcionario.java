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
public class Funcionario extends Pessoa{ 
     
    private String codigo;
    private TipoDeAcessoFuncionario tipoDeAcesso;
    private List <Eventualidade> eventualidades;

    public Funcionario(String codigo, TipoDeAcessoFuncionario tipoDeAcesso, String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
        this.codigo = codigo;
        this.tipoDeAcesso = tipoDeAcesso;
        this.eventualidades = new ArrayList<>();
    }
    
    
    public Eventualidade adicionarEventualidade(String nome, LocalDate data, TipoEventualidade eventualidade, List<Recompensa> recompensas)throws Exception{
        if(recompensas.isEmpty()){  //Verificação se a lista está vazia
            throw new Exception("A lista de Eventualidades não pode estar vazia!"); 
        }
        this.eventualidades.add(new Eventualidade(nome, data, eventualidade, recompensas));//Eventualidade criada com o constutor da Classe Eventualidade    
        //.add -> eventualidade sendo adicionado a lista de eventualidades

        return new Eventualidade(nome, data, eventualidade, recompensas);//retorna uma nova eventualidade, e é adicionado a Lista de Eventualidades
        
    }
 
    public void dispararNotificacaoDeEventualidades(ArrayList<Cliente>clientes, Eventualidade eventualidade){
       for(Cliente cliente : clientes){ //repetir cada cliente na lista clientes
           cliente.receberNotificacaoDeEventualidades(eventualidades);
        //Loop percorre cada cliente na lista clientes e invoca o método receberNotificacaoDeEventualidades, fornecendo a lista de eventualidades como argumento, para cada cliente.
       } 
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoDeAcessoFuncionario getTipoDeAcesso() {
        return tipoDeAcesso;
    }

    public void setTipoDeAcesso(TipoDeAcessoFuncionario tipoDeAcesso) {
        this.tipoDeAcesso = tipoDeAcesso;
    }

    public List<Eventualidade> getEventualidades() {
        return eventualidades;
    }

    public void setEventualidades(List<Eventualidade> eventualidades) {
        this.eventualidades = eventualidades;
    }

    
}
