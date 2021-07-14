package br.com.myhero.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovimentacaoId implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long idMovimento;
	private Long idUsuario;
	

}
