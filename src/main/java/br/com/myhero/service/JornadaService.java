package br.com.myhero.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.myhero.model.JornadaTrabalho;
import br.com.myhero.repository.JornadaRepository;

@Service
public class JornadaService {

	private JornadaRepository jornadaRepository;

	@Autowired
	public JornadaService(JornadaRepository jornadaRepository) {
		this.jornadaRepository = jornadaRepository;
	}

	public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
		return jornadaRepository.save(jornadaTrabalho);
	}

	public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho) {
		return jornadaRepository.save(jornadaTrabalho);
	}

	public List<JornadaTrabalho> findAll() {
		return jornadaRepository.findAll();
	}

	public Optional<JornadaTrabalho> getById(Long idJornada) {
		return jornadaRepository.findById(idJornada);
	}

	public void deletaJornada(Long idJornada) {
		jornadaRepository.deleteById(idJornada);
	}
}
