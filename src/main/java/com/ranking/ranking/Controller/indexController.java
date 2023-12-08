package com.ranking.ranking.Controller;

import com.ranking.ranking.dao.JogadorRepository;
import com.ranking.ranking.model.Jogador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class indexController {


    @Autowired
    JogadorRepository jogadorRepository;


            @GetMapping("/")
        public String abrir(Model model){

                List<Jogador> tabelaranking = jogadorRepository.findAll();

                model.addAttribute("tabelaranking", tabelaranking);

                return "index";}




}
