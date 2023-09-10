package lanchonete;

import area.cliente.Cliente;
import atendimento.cozinha.Almoxarife;
import atendimento.cozinha.Atendente;
import atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Almoxarife almoxarife = new Almoxarife();
		//ações que não precisam estar disponíveis para toda a aplicação
		almoxarife.controlarEntrada();
		almoxarife.controlarSaida();
		
		
		Atendente atendente = new Atendente();
		atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
	
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//nãop deveria, mas o estabelecimento
		//ainda não definiu normas de atendimento
		cliente.pegarPedidoBalcao();
		
		//esta ação é muito sigilosa, que tal ser privada?
		cliente.consultarSaldoAplicativo();
		
		//já pensou os cliente ouvindo que o gás acabou?
		cozinheiro.pedirParaTrocarGas(atendente);
		cozinheiro.pedirParaTrocarGas(almoxarife);
	}
	
}
