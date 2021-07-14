package br.com.myhero.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class BancoHorasId implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long idBancoHoras;
	private Long idMovimentacao;
	private Long idUsuario;
}
