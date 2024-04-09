package com.example.demo.controller;

import com.example.demo.model.ModelTeste;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/teste")
public class ControllerTeste {

    private List<ModelTeste> modelTeste = new ArrayList<>();

    @GetMapping
    public List<ModelTeste> getModelTeste(){
        return modelTeste;
    }

    @PostMapping
    public ModelTeste sendModelTeste(@RequestBody ModelTeste teste){
        teste.setId(UUID.randomUUID());
        modelTeste.add(teste);
        return teste;
    }

    @PutMapping("/{id}")
    public ModelTeste updateModelTeste(@PathVariable UUID id, @RequestBody ModelTeste updateTeste){
        for(ModelTeste teste : modelTeste){
            if (teste.getId().equals(id)){
                teste.setNome(updateTeste.getNome());
                teste.setEmail(updateTeste.getEmail());
                teste.setTelefone(updateTeste.getTelefone());
                return teste;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteModelTeste(@PathVariable UUID id){
        Optional<ModelTeste> optionalModelTeste = modelTeste.stream().filter(teste -> teste.getId().equals(id)).findFirst();

        if (optionalModelTeste.isPresent()) {
            modelTeste.remove(optionalModelTeste.get());
            return "Objeto deletado com sucesso!";
        } else {
            return "Objeto não encontrado!";
        }
    }
}
