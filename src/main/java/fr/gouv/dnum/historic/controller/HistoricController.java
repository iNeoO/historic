package fr.gouv.dnum.historic.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.gouv.dnum.historic.dao.IHistoricDao;
import fr.gouv.dnum.historic.model.IHistoric;
import fr.gouv.dnum.historic.service.IHistoricService;

@RestController
@RequestMapping("/historic")
public class HistoricController {

    private IHistoricService iHistoricService;

    @RequestMapping("/")
        public List<IHistoric> getAll() {
        List<IHistoric> iHistoric = iHistoricService.getAll();
        return iHistoric;
    }

    @PostMapping("/")
    public ResponseEntity<Void> create(@RequestBody IHistoricDao iHIstoric) {
        iHistoricService.create(iHIstoric);
        return ResponseEntity.ok().build();
    }
}