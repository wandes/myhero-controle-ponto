package br.com.myhero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.myhero.model.JornadaTrabalho;

public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {

}
