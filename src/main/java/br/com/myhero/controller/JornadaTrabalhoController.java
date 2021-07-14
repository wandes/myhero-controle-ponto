package br.com.myhero.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.myhero.model.JornadaTrabalho;
import br.com.myhero.service.JornadaService;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

	@Autowired
	private JornadaService jornadaService;

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(JornadaTrabalhoController.class);

	@PostMapping
	public ResponseEntity<JornadaTrabalho> createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
		logger.warn(String.format("Criando objeto: %s", jornadaTrabalho.getDescricao()));
		return new ResponseEntity<JornadaTrabalho>(jornadaService.saveJornada(jornadaTrabalho), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<JornadaTrabalho> updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
		logger.warn(String.format("Atualizando objeto:  %s ", jornadaTrabalho.getDescricao()));
		return new ResponseEntity<JornadaTrabalho>(jornadaService.updateJornada(jornadaTrabalho), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<JornadaTrabalho>> getJornadaList() {
		logger.warn("Listando objetos...");
		return new ResponseEntity<List<JornadaTrabalho>>(jornadaService.findAll(), HttpStatus.CREATED);
	}

	@GetMapping("/{idJornada}")
	public ResponseEntity<Optional<JornadaTrabalho>> getById(@PathVariable("idJornada") Long idJornada) {
		logger.warn(String.format("Pesquisando objeto por Id:  %s", idJornada));
		Optional<JornadaTrabalho> response = jornadaService.getById(idJornada);

		if (response.isPresent()) {
			return ResponseEntity.ok(response);
		}

		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{idJornada}")
	public ResponseEntity<String> deleteById(@PathVariable("idJornada") Long idJornada) {
		logger.warn(String.format("Deletando objeto por Id:  %s", idJornada));
		try {

			jornadaService.deletaJornada(idJornada);
			return ResponseEntity.ok("");

		} catch (Exception e) {

			return ResponseEntity.noContent().build();

		}
	}

}
