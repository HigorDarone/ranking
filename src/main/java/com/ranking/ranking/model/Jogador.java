package com.ranking.ranking.model;

import jakarta.persistence.*;

@Entity
public class Jogador {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nome;

    @Column
    private String nick;

    @Column
    private String jogofav;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getJogofav() {
        return jogofav;
    }

    public void setJogofav(String jogofav) {
        this.jogofav = jogofav;
    }
}
