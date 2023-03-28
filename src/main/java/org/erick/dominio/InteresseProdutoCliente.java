package org.erick.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InteresseProdutoCliente {
	private Cliente cliente;
	private Produto produto;
}
