package com.js.avangers.web;


import com.js.avangers.domain.Avanger;
import com.js.avangers.service.AvangerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Optional;

@RestController
@RequestMapping("avangers")
public class AvangerController implements Serializable {

    private final AvangerService avangerService;

    public AvangerController(AvangerService avangerService) {
        this.avangerService = avangerService;
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        Optional<Avanger> avanger = avangerService.buscarPorId(id);

        if (avanger.isPresent()) {
            avangerService.deletar(avanger.get());
            return ResponseEntity.ok().build();
        } else {
            HttpHeaders headers = new HttpHeaders();
            headers.add("message", String.format("Avanger de id %id não existe", id));
            return ResponseEntity.notFound().headers(headers).build();
        }
    }
}
