package de.htwberlin.webtech.digishop.web;

import de.htwberlin.webtech.digishop.model.Produkt;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProduktController {

    @GetMapping("/api/produkte")
    public ResponseEntity<List<Produkt>> getProdukte() {
        final List<Produkt> produkte = List.of(
                new Produkt("Uhr", 2999.90, "Luxusuhr aus Edelstahl"),
                new Produkt("Handy", 1500.00, "iPhone Pro Max"),
                new Produkt("Jacke", 500.00, "Winterjacke aus Leder")
        );
        return ResponseEntity.ok(produkte);
    }
}
