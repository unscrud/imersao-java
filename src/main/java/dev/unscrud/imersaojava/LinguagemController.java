package dev.unscrud.imersaojava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

  @Autowired
  private LinguagemRepository repository;

  @GetMapping("/linguagens")
  public List<Linguagem> obterLinguagens() {
    List<Linguagem> linguagens = repository.findAll();
    return linguagens;
  }

  @PostMapping("/linguagens")
  public Linguagem salvarLinguagem(@RequestBody Linguagem linguagem) {
    Linguagem linguagemSalva = repository.save(linguagem);
    return linguagemSalva;
  }
}
