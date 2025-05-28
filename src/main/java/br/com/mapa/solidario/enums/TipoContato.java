package br.com.mapa.solidario.enums;

public enum TipoContato {
	INSTAGRAM("Instagram"),
	EMAIL("Email"),
	CELULAR("Celular"),
	TELEFONE("Telefone");

	private final String descricao;

	private TipoContato(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
