package com.ranking.ranking.Controller;


import com.ranking.ranking.dao.JogadorRepository;
import com.ranking.ranking.model.Jogador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class CadastrarController  {

    @Autowired
    JogadorRepository jogadorRepository;

    @GetMapping("/cadastro")
    public String abrir(Jogador jogador) {return "cadastrar";}

    @PostMapping("/cadastro_jogador")
    public String cadastro(Jogador jogador){
        jogadorRepository.save(jogador);
                return "redirect:/";

    }


}
