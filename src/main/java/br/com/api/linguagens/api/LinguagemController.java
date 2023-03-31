package br.com.api.linguagens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {
    
    /*private List<Linguagem> linguagens = List.of(
        new Linguagem("Java", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", 1),
        new Linguagem("PHP", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png", 2)
    );*/

    @Autowired
    private LinguagemRepository linguagemRepository;

    @GetMapping(value="/linguagens")
    public List<Linguagem> getMethodName() {
        List<Linguagem> linguagens = linguagemRepository.findAll();
        return linguagens;
    }

    @PostMapping("/createLinguagem")
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
        Linguagem linguagemSalva = linguagemRepository.save(linguagem);
        return linguagemSalva;
    }

}
